package edu.sfg.sfgdi;

import edu.sfg.sfgdi.controllers.MyController;
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
	}

}
