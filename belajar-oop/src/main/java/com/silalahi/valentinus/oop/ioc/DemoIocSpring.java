package com.silalahi.valentinus.oop.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoIocSpring {
	public static void main(String[] xxx) {
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("training-ioc.xml");
		NasabahDaoIoc nasabahDao = (NasabahDaoIoc) springContainer.getBean("nd");
		nasabahDao.simpan();
		
		RekeningDao rDao = springContainer.getBean(RekeningDao.class);
		rDao.simpan();
	}
}
