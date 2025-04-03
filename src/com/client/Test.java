package com.client;

import org.hibernate.Session;

import com.config.HibernateUtil;
import com.model.Student;

public class Test {

	public static void main(String[] args) {

		
		Session se=HibernateUtil.getSessionFactory().openSession();
		
//		Student s=se.get(Student.class, 6);
//		
//		Student  s1=se.get(Student.class, 6);
//		
//		Student s2=se.get(Student.class, 6);
		
        Student s=se.get(Student.class, 4);
		
        se.clear();
        
		Student  s1=se.get(Student.class, 4);
		
		Student s2=se.get(Student.class, 4);
		
		
		Session session=HibernateUtil.getSessionFactory().openSession();
		
		//session.evict(s);
		
		Student a=session.get(Student.class, 4);
		
		Student b=session.get(Student.class, 4);
		
		
		
			
	}
}
