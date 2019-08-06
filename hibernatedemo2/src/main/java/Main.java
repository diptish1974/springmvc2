import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


import com.niit.Book;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // TODO Auto-generated method stub

		 Configuration   configuration=new AnnotationConfiguration().configure();
         SessionFactory sessionFactory=configuration.buildSessionFactory();
		 Session session=sessionFactory.openSession();
	     Transaction transaction=session.beginTransaction();
	  	 Book book=new Book();
	  	 book.setId(1);
	  	 book.setBookname("Java");
	  	 book.setAuthor("Patrick");
	  	 session.save(book);
         transaction.commit(); 
         session.close();
	}

}