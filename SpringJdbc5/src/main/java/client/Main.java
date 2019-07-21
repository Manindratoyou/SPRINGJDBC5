package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pack1.bo.DemoBean;

public class Main {

	public static void main(String[] args) 
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		Object o=ctx.getBean("demoBean");
		DemoBean db=(DemoBean)o;
		db.bm();

	}

}
