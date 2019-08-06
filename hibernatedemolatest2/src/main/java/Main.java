import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cgi.model.Book;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // TODO Auto-generated method stub

		 Configuration   configuration=new Configuration().configure();
                 SessionFactory sessionFactory=configuration.buildSessionFactory();
		 Session session=sessionFactory.openSession();
	         Transaction transaction=session.beginTransaction();
	  	     Book book=new Book();
	  	     book.setTitle("Java");
	  	     book.setAuthor("Jack");
	  	  session.save(book);
         transaction.commit(); 
         session.close();
	}

}