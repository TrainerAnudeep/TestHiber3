package com.example;

import org.hibernate.*;

public class DemoHql7 {

	public static void main(String[] args) throws Exception {
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();

		Query qry = session
				.createQuery(" from com.example.Student  s order by s.sname ");
		java.util.List stlist = qry.list();

		for (int i = 0; i < stlist.size(); i++) {
			com.example.Student s = (com.example.Student) stlist.get(i);
			System.out.print(s.getSname());
			System.out.print("\t" + s.getFname());
			System.out.print("\t" + s.getSid());
			System.out.println("\t" + s.getSage());
		}
		tx.commit();
		HibernateSessionFactory.closeSession();
	}

}
