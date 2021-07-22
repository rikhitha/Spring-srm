package autowireType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Inside class with ioc");
		ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		Vehicle  pay = (Vehicle )context.getBean("vehicleid");
		 
		 System.out.println("Vehicle toString "+pay);
		 
		 System.out.println("From getMessage"+" "+pay.getName());
		 
		 System.out.println(pay.getPayStatus().getStatus());
		 
//		 Payment paytwo = (Payment)context.getBean("magicpay");//Singleton
//		 
//		 System.out.println("Payment "+paytwo);//Singleton
		 
		 System.out.println("####");
		 
		 System.out.println("Calling ScopeProtoype Class");
		 
		 ScopePrototype sp = (ScopePrototype)context.getBean("scopeproto");
		 
		 System.out.println("object sp"+sp);
		 
         ScopePrototype sptwo = (ScopePrototype)context.getBean("scopeproto");
		 
		 System.out.println("object sptwo"+sptwo);
		 
         Book  bk = (Book )context.getBean("publish");
		 
		 System.out.println("Book toString "+bk);
		 
		 System.out.println("From BookgetPublisher"+" "+bk.getPublisher());
		 
		 System.out.println(bk.getBookStat().getbbStatus());
        
		 
		 
		 
		 

	}

}
