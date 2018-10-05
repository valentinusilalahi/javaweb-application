package com.silalahi.valentinus.app.aop;

import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AuditLogAdvice implements MethodInterceptor {
	public Object invoke(MethodInvocation method) throws Throwable {
		Object hasil = method.proceed();

		// catat pemanggilan ke log file
		Date sekarang = new Date();
		System.out.println("Method " + method.getMethod().getName() + " di jalankan pada waktu " + sekarang);
		return hasil;
	}
}
