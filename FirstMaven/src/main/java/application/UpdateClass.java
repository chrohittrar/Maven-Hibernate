package application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import entities.Employee;

public class UpdateClass {

	public static void main(String[] args) {

		StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

		Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();

		SessionFactory sf = metadata.getSessionFactoryBuilder().build();

		Session session = sf.openSession();

		Employee e = session.get(Employee.class, 1234);

		e.setDeptno(40);
		Transaction tr = session.beginTransaction();
		session.update(e);
		tr.commit();

		System.out.println("Successfull Updated");
	}

}
