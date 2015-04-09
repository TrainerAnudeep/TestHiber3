package com.example;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
public class DemoHql {

	
	public static void main(String[] args)throws Exception{
	Session session=HibernateSessionFactory.getSession();
	session.clear();
	Query qry=session.createQuery("from com.example.Student");
	
	@SuppressWarnings("unchecked")
	List<Student> stlist=qry.list();
	System.out.println("Number of rows are: "+stlist.size());
	
	for(int i=0;i<stlist.size();i++){
             
		com.example.Student s=stlist.get(i);
		System.out.print(s.getSname());
		System.out.print("\t"+s.getFname());
		System.out.print("\t"+s.getSid());
		System.out.println("\t"+s.getSage());
	}

	
	HibernateSessionFactory.closeSession();

	}

}
