package kkm;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext ctx = 
				new GenericXmlApplicationContext("applicationContext.xml");
		
		Ame ame =(Ame)ctx.getBean("ame");
		ame.CoffeeOn();
		ame.CoffeeOff();
		
		ctx.close();
	}

}
