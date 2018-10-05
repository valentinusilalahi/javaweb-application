package com.silalahi.valentinus.app.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class CekPermissionAdvice implements MethodInterceptor {
	public Object invoke(MethodInvocation method) throws Throwable {
		String namaMethod = method.getMethod().getName();
		System.out.println("Memeriksa ijin akses untuk menjalankan method " + namaMethod);
		Object hasil = method.proceed();
		return hasil;
	}
}
