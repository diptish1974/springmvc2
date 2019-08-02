package disetterdemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("data.xml");
        Student stu=(Student)context.getBean("student");
        System.out.println(stu.getRoll());
        System.out.println(stu.getName());
        System.out.println(stu.getMarks());
        
	}

}
