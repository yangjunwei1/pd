package proxy.java;

import java.lang.reflect.Proxy;

import proxy.RealSubject;
import proxy.Subject;


public class Test {

	public static void main(String[] args) {
		UserDao dao = new UserDao();//���������
		RealSubject rs = new RealSubject();
		
		MyInvocationHandler my = new MyInvocationHandler(rs,dao);
		
		Subject proxyDao = (Subject) Proxy.newProxyInstance(rs.getClass().getClassLoader(), rs.getClass().getInterfaces(), my);
		
		proxyDao.sales();
		
	}
}
