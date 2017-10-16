package proxy.cglib;

import java.lang.reflect.Proxy;

import net.sf.cglib.proxy.Enhancer;




public class ClassesDaoTest {
	public static void testSaveClasses(){
		Object dao = new ClassesDaoImpl();
		MyTransaction myTransaction = new MyTransaction();
		ClassesDaoInterceptor interceptor = new ClassesDaoInterceptor(dao, myTransaction);		
		ClassesDaoImpl proxyDao= (ClassesDaoImpl) interceptor.create();
		Classes classes = new Classes();
		classes.setCname("aaaa");
		proxyDao.saveClasses(classes);
	}
	public static void main(String[] args) {
		testSaveClasses();
	}
}
