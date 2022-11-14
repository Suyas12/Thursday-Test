package com.onetoonemapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmpAddressMap {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		Employee e=new Employee();
		e.setName("rashid");
		e.setEmail("rashid.khan@gmail.com");
		
		Address a=new Address();
		a.setAddressLine("Shantinagar, near  vishwanath nagar");
		a.setCity("ahmedabad");
		a.setCountry("India");
		a.setPincode(380023);
		a.setState("gujarat");
		e.setAddress(a);//main point
		a.setEmployee(e);//main point
		session.save(e);
		session.save(a);
		session.getTransaction().commit();
		session.close();
		factory.close();
		

	}

}
