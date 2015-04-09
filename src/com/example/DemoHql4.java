package com.example;

import org.hibernate.*;

/**
 * Another demonstration of parameterized query
 * @author anudeep
 *
 */
public class DemoHql4 {

	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		Query qry = session
				.createQuery("from com.example.Student where sage<:maxsage and sage>:minsage");
		qry.setString("maxsage", "27");
		qry.setString("minsage", "23");
		@SuppressWarnings("rawtypes")
		java.util.List stlist = qry.list();
		for (int i = 0; i < stlist.size(); i++) {
			Student s = (com.example.Student) stlist.get(i);
			System.out.println(s.getFname());
		}
		tx.commit();
		HibernateSessionFactory.closeSession();

	}

}
