package application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Employee;


public class SaveClass {

	public static void main(String[] args) {

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		
		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();
		
		SessionFactory sf = metadata.getSessionFactoryBuilder().build();
		
		Session session = sf.openSession();
		
		Employee e = new Employee(134, "Rohit", 12500f);
		
		Transaction tr = session.beginTransaction();
		session.save(e);
		tr.commit();
		
		System.out.println("Successfull");
	}

}
