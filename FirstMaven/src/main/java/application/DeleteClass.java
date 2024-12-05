package application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class DeleteClass {

	public static void main(String[] args) {
		
		// creating session
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		  
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		  
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		  
		
		Session session = sf.openSession();
		 
		
		// HQL query 
		String hql = "Delete from Employee where id = :id ";
		
		
		Transaction tr = session.beginTransaction();
		int deleteCount = session.createQuery(hql).setParameter("id", 7369).executeUpdate();
		tr.commit();
		
		System.out.println("Row(s) Deleted : "+deleteCount);
		
	}

}
