/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.dao;

import java.util.List;
import library.model.Client;
import library.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
public class ClientDao {
    Session session = null;
    public void saveClient(Client c){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(c);
        tx.commit();
        session.close();
    }
    
    public void updateClient(Client c){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(c);
        tx.commit();
        session.close();
    }
    
    public void deleteClient(Client c){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(c);
        tx.commit();
        session.close();
    }
    
    public List<Client> displayClient(){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<Client> clients = (List<Client>) session.createCriteria(Client.class).list();
        tx.commit();
        session.close();
        return clients;
    }
    
    public List<Client> findById(String id){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<Client> clients = (List<Client>) session.createCriteria(Client.class).add(Restrictions.eq("regid", id)).list();
        tx.commit();
        session.close();
        return clients;
    }
    
    public String getRegId(String name){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Object id = session.createQuery("select regId from Client where firstname||' '||lastname ='"+name+"'").uniqueResult();
        tx.commit();
        session.close();
        return id.toString();
    }
    
    public String getClientName(String regno){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Object id = session.createQuery("select firstname||' '||lastname as name from Client where regid ='"+regno+"'").uniqueResult();
        tx.commit();
        session.close();
        return id.toString();
    }
}
