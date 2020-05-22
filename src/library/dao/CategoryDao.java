/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.dao;

import java.util.List;
import library.model.BookCategory;
import library.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author User
 */
public class CategoryDao {
    Session session = null;
    public void saveBookCategory(BookCategory c){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.save(c);
        tx.commit();
        session.close();
    }
    
    public void updateBookCategory(BookCategory c){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.update(c);
        tx.commit();
        session.close();
    }
    
    public void deleteBookCategory(BookCategory c){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        session.delete(c);
        tx.commit();
        session.close();
    }
    
    public List<BookCategory> displayBookCategory(){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<BookCategory> categories = (List<BookCategory>) session.createCriteria(BookCategory.class).list();
        tx.commit();
        session.close();
        return categories;
    }
    
    public List<BookCategory> findByCategoryId(String id){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<BookCategory> categories = (List<BookCategory>) session.createCriteria(BookCategory.class).add(Restrictions.eq("categoryId", id)).list();
        tx.commit();
        session.close();
        return categories;
    }
    
    public String getCategoryName(String id){
        String sql = "select categoryName from BookCategory where categoryId = '"+id+"'";
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Object name = session.createCriteria(sql).uniqueResult();
        tx.commit();
        session.close();
        return name.toString();
    }
    
    public String getCategoryId(String name){
        String sql = "select categoryId from BookCategory where categoryName = '"+name+"'";
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        Object id = session.createCriteria(sql).uniqueResult();
        tx.commit();
        session.close();
        return id.toString();
    }
    
    public List<String> CategoryNames(){
        session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();
        List<String> names = session.createCriteria(BookCategory.class).setProjection(Projections.property("categoryName")).list();
        tx.commit();
        session.close();
        return names;
    }
}
