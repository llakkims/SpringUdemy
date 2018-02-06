package com.mypack;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAutoScan {
	
	public static void main(String[] ss)
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationProperties.xml");
		
		Coach crickCoach = context.getBean("cricketCoach", Coach.class);
		
		
		
		System.out.println("Today's workout from Cricket Coach : "+ crickCoach.getDailyWorkOut());
		context.close();
		
	}

}
