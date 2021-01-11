package com.yogie.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: spring
 * @Description: 测试类
 * @Author: Chenyogie
 * @Date: 2021/1/11 14:33
 */
public class StudentTest {

	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("com/yogie/spring-student.xml");
		Object student = context.getBean("student");
		System.out.println(student);
	}
}
