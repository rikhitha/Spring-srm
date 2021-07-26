package vehicleIoc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Inside class with ioc");
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		 Payment pay = (Payment)context.getBean("magicpay");
		 
		 System.out.println("Payment "+pay);
		 
		 System.out.println("From getMessage"+" "+pay.getMessage());
		 
		 System.out.println(pay.getPayStatus().getStatus());
		 
//		 Payment paytwo = (Payment)context.getBean("magicpay");//Singleton
//		 
//		 System.out.println("Payment "+paytwo);//Singleton
		 
		 System.out.println("####");

	}

}
