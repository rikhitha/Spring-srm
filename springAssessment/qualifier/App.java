package vehicleScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

	public static void main(String[] args) 
	{
		
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");

	      Profile profile = (Profile) context.getBean("profile");
	      profile.printId();
	      profile.printName();
//	      profile.getStudent().getAge();
		 
		 
		 
		 

	}

}
