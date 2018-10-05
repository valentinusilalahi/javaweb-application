package com.silalahi.valentinus.app.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.silalahi.valentinus.app.aop.Nasabah;
import com.silalahi.valentinus.app.aop.NasabahDao;

public class DemoInsertNasabah {
	public static void main(String[] args) {
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("training-jdbc.xml");

		// Data yang akan di insert
		Nasabah n = new Nasabah();
		n.setNomor("111");
		n.setNama("valentinus silalahi");
		n.setEmail("valentinus.silalahi@gmail.com");

		NasabahDao dao = new NasabahDao();
		dao.insert(n);
	}
}
