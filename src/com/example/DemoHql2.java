package com.example;

import org.hibernate.*;

public class DemoHql2 {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		Query qry = session
				.createQuery("from com.example.Student where sage<29");
		
		@SuppressWarnings("rawtypes")
		java.util.List stlist = qry.list();
		
		for (int i = 0; i < stlist.size(); i++) {
			com.example.Student s = (com.example.Student) stlist.get(i);
			System.out.println(s.getSname());
		}
		tx.commit();
		HibernateSessionFactory.closeSession();
	}

}
