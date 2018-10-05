## Spring Framework ##

* [Spring Framework Reference Manual](https://docs.spring.io/spring/docs/current/spring-framework-reference/htmlsingle/)

### Inversion of Control dengan Spring ###

* Client Code

 ```java
public class DemoIocSpring {
 	public static void main(String[] args) {
		ApplicationContext springContainer
			= new ClassPathXmlApplicationContext("belajar-ioc.xml");
		
		NasabahDaoIoc nasabahDao = (NasabahDaoIoc) springContainer.getBean("nd");
		nasabahDao.simpan();
	}
 }
```

 * Konfigurasi Dependency Injection

 ```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">
 	<!-- 
		KoneksiDatabase koneksiDatabase = new KoneksiDatabase();
		koneksiDatabase.setUrl("jdbc:postgresql://localhost/belajar");
		koneksiDatabase.setUsername("demo");
		koneksiDatabase.setPassword("cobacoba");
	-->
	<bean id="koneksiDatabase" class="belajar.spring.ioc.KoneksiDatabase">
		<property name="url" value="jdbc:postgresql://localhost/belajarspring"/>
		<property name="username" value="springdemo"/>
		<property name="password" value="cobaspring"/>
	</bean>
 	<!-- 
		NasabahDaoIoc nd = new NasabahDaoIoc(koneksiDatabase);
	-->
	<bean id="nd" class="belajar.spring.ioc.NasabahDaoIoc">
		<constructor-arg ref="koneksiDatabase" />
	</bean>
	
</beans>
```

### Setup ###

 Tambahkan dependensi berikut di `pom.xml`

 ```xml
    <dependency>
        <groupId>org.springframework</groupId>
        <artifactId>spring-context</artifactId>
        <version>4.3.10.RELEASE</version>
    </dependency>
```

### Aspect Oriented Programming ###

Berbagai istilah:
* Cross cutting concern : masalah yang terjadi di semua fitur/proses bisnis. Misalnya transaction (begin/commit/rollback), cek permission, audit log
* Aspect : solusi untuk mengatasi cross cutting concern
* Advice : kode program yang mengimplementasikan cross cutting concern
* Joinpoint : tempat untuk memasang advice
* Pointcut : pattern/expression untuk memilih fitur yang akan dipasang joinpoint
* Target object : object asli yang menjalankan proses bisnis
* Client code : object yang memanggil target object
* Proxy : object palsu yang menggantikan target object untuk dipanggil client code
* Weaving : proses merangkai proxy, advice, dan target object

