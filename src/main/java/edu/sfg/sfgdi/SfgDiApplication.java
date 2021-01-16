package edu.sfg.sfgdi;

import edu.sfg.sfgdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		System.out.println("-----------------I18N Profile beans");
		I18NController i18NController = ctx.getBean(I18NController.class);
		System.out.println(i18NController.sayHello());

		System.out.println("-----------------Primary bean");
		MyController bean = ctx.getBean(MyController.class);
		System.out.println(bean.sayHello());

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
