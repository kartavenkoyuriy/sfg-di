package edu.sfg.sfgdi;

import edu.sfg.sfgdi.controllers.ConstructorInjectedController;
import edu.sfg.sfgdi.controllers.MyController;
import edu.sfg.sfgdi.controllers.PropertyInjectedController;
import edu.sfg.sfgdi.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		MyController bean = ctx.getBean(MyController.class);
		String s = bean.sayHello();
		System.out.println(s);

		System.out.println("-----------------");

		System.out.println("-----------------Property based");
		PropertyInjectedController propertyInjectedController = ctx.getBean(PropertyInjectedController.class);
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-----------------Setter based");
		SetterInjectedController setterInjectedController = ctx.getBean(SetterInjectedController.class);
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-----------------Constructor based");
		ConstructorInjectedController constructorInjectedController = ctx.getBean(ConstructorInjectedController.class);
		System.out.println(constructorInjectedController.getGreeting());
	}

}
