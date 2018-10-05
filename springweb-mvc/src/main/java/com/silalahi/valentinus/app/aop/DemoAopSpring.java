package com.silalahi.valentinus.app.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAopSpring {
	public static void main(String[] args) {
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("training-aop.xml");
		RekeningDao rd = springContainer.getBean(RekeningDao.class);
		rd.simpan();
	}
}
