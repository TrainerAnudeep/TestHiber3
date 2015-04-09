package com.example;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

/**
 * Updating a value in table using hibernate
 * @author anudeep
 *
 */
public class DemoHql6 {

	
	public static void main(String[] args) {
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		session.clear();
		Transaction tx=session.beginTransaction();
		
		com.example.Student st=new com.example.Student();
		
		//no exception thrown if their is no error
		st.setSid(new Long(3));
		st.setFname("Alpha");
		st.setSage(new Long(55));
		st.setSname("Beta");
		session.update(st);
		//exception thrown if row not found go for load..
		//session.load(st, new Long(3));
        tx.commit();
        
       session.close(); 
	}
}
