package com.lucas;

import com.lucas.beans.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

	@Test
	public void test01() {
		ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

		User user = (User) context.getBean("user");

		System.out.println(user);
	}
}
