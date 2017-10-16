package proxy.jdk;

import java.lang.reflect.Proxy;



public class ClassesDaoTest {
	public static void testSaveClasses(){
		Object target = new ClassesDaoImpl();
		MyTransaction myTransaction = new MyTransaction();
		ClassesDaoInterceptor interceptor = new ClassesDaoInterceptor(target, myTransaction);		
		ClassesDao proxyDao = (ClassesDao) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), interceptor);
		Classes classes = new Classes();
		classes.setCname("aaaa");
		proxyDao.saveClasses(classes);
	}
	public static void main(String[] args) {
		testSaveClasses();
	}
}
