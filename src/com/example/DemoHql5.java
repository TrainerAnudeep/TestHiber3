package com.example;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Selecting only required parameters and safe way to iterate through list
 * @author anudeep
 *
 */
public class DemoHql5 {

	
	public static void main(String[] args)throws Exception {
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
        Query qry=session.createQuery("select s.sname,s.sage from com.example.Student as s");
        @SuppressWarnings("rawtypes")
		List stuList=qry.list();
        
       @SuppressWarnings("rawtypes")
	Iterator itr=stuList.iterator();
       while(itr.hasNext()){
    	  Object[] obj=(Object[]) itr.next();
    	  for(int i=0;i<obj.length;i++){
    		  System.out.print(obj[i]+"\t\t");
    	  }
    	  System.out.println();
       }
      
     /*   java.util.List stlist=qry.list();
        Object[] o=stlist.toArray();
        for(int i=0;i<o.length;i++){
        	Object[] ar=(Object[])o[i];
        	String sname=(String)ar[0];
        	Long sage=(Long)ar[1];
        	System.out.print(sname+"\t\t");
        	System.out.println(sage);	
        }*/
        
        tx.commit();
        HibernateSessionFactory.closeSession();
	}

}
