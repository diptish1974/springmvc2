package com.cgi.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cgi.model.Student;

@Repository
@Transactional
public class StudentDAOImpl implements StudentDAO {

	  @Autowired
	  SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public StudentDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}
	   
	   public void saveStudent(Student student)
	   {
		   Session session=sessionFactory.getCurrentSession();
		   session.save(student);
	   }
	  
}
