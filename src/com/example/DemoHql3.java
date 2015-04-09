package com.example;
import org.hibernate.*;

/**
 * 
 * Parameterized query example
 * 
 * @author anudeep
 *
 */
public class DemoHql3 {

	
	public static void main(String[] args) {
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
        Query qry=session.createQuery("from com.example.Student where sage=?");
        qry.setString(0,"24");
        @SuppressWarnings("rawtypes")
		java.util.List stlist=qry.list();
        for(int i=0;i<stlist.size();i++){       
        com.example.Student s=(com.example.Student)stlist.get(i);	
        System.out.println(s.getFname());
        }
	    tx.commit();
	    HibernateSessionFactory.closeSession();
	}
	

}
