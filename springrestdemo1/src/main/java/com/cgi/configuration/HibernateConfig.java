package com.cgi.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.cgi.model.Note;



/*This class will contain the application-context for the application. 
 * Define the following annotations:
 * @Configuration - Annotating a class with the 
 * @Configuration indicates that the 
 *                  class can be used by the
 *                   Spring IoC container as a source of 
 *                  bean definitions
 * @EnableTransactionManagement - Enables Spring's
 *  annotation-driven transaction management capability.
 *                  
 * */
@Configuration
@EnableTransactionManagement
public class HibernateConfig {

	/*
	 * Define the bean for DataSource. In our application, we are using MySQL as the
	 * dataSource. To create the DataSource bean, we need to know: 1. Driver class
	 * name 2. Database URL 3. UserName 4. Password
	 */

	  @Bean
	  @Autowired
	  public DataSource dataSource()
	  {
		  BasicDataSource dataSource=new BasicDataSource();
		  dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		  dataSource.setUrl("jdbc:mysql://localhost:3306/NoteDatabase");
		  dataSource.setUsername("root");
		  dataSource.setPassword("cgi123");
	      return dataSource;
	  }
	
	  @Bean
	  @Autowired
	  public LocalSessionFactoryBean sessionFactory(DataSource dataSource)
	  {
		  LocalSessionFactoryBean sessionFactoryBean=new LocalSessionFactoryBean(); 
	      sessionFactoryBean.setDataSource(dataSource);
	      Properties hibernateProperties=new Properties();
	      hibernateProperties.put("hibernate.show_sql", "true");
	      hibernateProperties.put("hibernate.hbm2ddl.auto","update");
	      hibernateProperties.put("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
	      sessionFactoryBean.setAnnotatedClasses(Note.class);
	      sessionFactoryBean.setHibernateProperties(hibernateProperties);
	      return sessionFactoryBean;
	  }
	

   
	  @Bean
	  @Autowired
	  public HibernateTransactionManager transactionManager(SessionFactory sessionFactory)
	  {
		  HibernateTransactionManager hibernateTransactionManager=new HibernateTransactionManager();
		  hibernateTransactionManager.setSessionFactory(sessionFactory);  
	      return hibernateTransactionManager;
	  }


}
