package com.hibernateproject;



import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class FetchData {

	public static void main(String[] args) {
		
// get and load methods for fetching the data

		
		System.out.println( "Project Started :) " );
        
        SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
		// get = student:102
		
		Student studentdata = new Student();
		studentdata = session.load(Student.class, 106);
		System.out.println(studentdata);
		
		
		session.close();
		sf.close();
		
	}
	
	
}
