/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import library.model.Operations;
import library.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
public class OperationsDao {
    Session session = null;
    public void saveOperation(Operations op){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(op);
        tx.commit();
        session.close();
    }
    
    public String getOpNumber(String date){
        session = HibernateUtil.getSessionFactory().openSession();
        Object num = session.createCriteria(Operations.class).setProjection(Projections.count("opId")).uniqueResult();
        session.close();
        return "Op"+num+date;
    }
    
    public void increaseOrDecrease(String bookid, String opcat){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        if(opcat.equals("CHECK IN"))
            session.createQuery("update Book set copies = copies+1 where bookid = '"+bookid+"'").executeUpdate();
        else
            session.createQuery("update Book set copies = copies-1 where bookid = '"+bookid+"'").executeUpdate();
        tx.commit();
        session.close();
    }
    
    public String getOperationNumber(String cid,String bid){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx= session.beginTransaction();
        Query c = session.createSQLQuery("select opId from operations where bookid='"+bid+"' and regno = '"+cid+"' and operationcategory = 'CHECK OUT' and status = 'Have' and rownum=1");
        Object opnumber = c.uniqueResult();
        tx.commit();
        session.close();
        return opnumber.toString();
    }
    
    public void updateOperation(String cid,String bid){
        String opnum = getOperationNumber(cid,bid);
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createSQLQuery("update operations set status = 'Returned' where opId = '"+opnum+"'");
        q.executeUpdate();
        tx.commit();
        session.close();
    }
    
    public List<Operations> getReportOfData(String colname,String id,String opcat){
      List<Operations> data = new ArrayList<>();
       try{ 
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Operations where "+colname+" = '"+id+"' and operationcategory = '"+opcat+"'");
        data = q.list();
        tx.commit();
        session.close();
    }catch(HibernateException ex){
           JOptionPane.showMessageDialog(null, ex.getMessage());
    }
        return data;
    }
    
    public List<Operations> getReportOfDataDate(Date date1,Date date2,String opcat){
        List<Operations> data = null;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Criteria c = session.createCriteria(Operations.class);
        c.add(Restrictions.between("datetime", date1, date2));
        c.add(Restrictions.eq("operationcategory", opcat));
        data = c.list();
        tx.commit();
        session.close();
        return data;
    }
    
    public List<Object[]> getReportOfDataCategory(String cat,String opcat){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createSQLQuery("select operations.opId,operations.regid,opeartions.bookid,operations.datetime,operations.operationcategory,operations.status from operations  join book  on operations.bookid=book.bookid join book_category  on book.categoryid=bookcategory.categoryid  where categoryname = '"+cat+"' and operationcategory= '"+opcat+"'");
        List<Object[]> data = q.list();
        tx.commit();
        session.close();
        return data;
    }
    
    public List<Operations> getCheckInOut() {
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Criteria crt = session.createCriteria(Operations.class);
        List<Operations> book = crt.list();
        tx.commit();
        session.close();
        return book;
    } 
    
    public String getId(String className, String extcol, String col, String newid) {
        String id = null;
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Query q = session.createQuery("select " + newid + " from " + className + " where " + extcol + "='" + col + "'");
        List<String> list = q.list();
        tx.commit();
        session.close();
        for(String l:list)
            id=l;
        return id;
    }
}
