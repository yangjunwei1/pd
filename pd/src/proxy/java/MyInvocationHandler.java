package proxy.java;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class MyInvocationHandler implements InvocationHandler {

	private Object obj;
	private Dao dao;
	public MyInvocationHandler(Object obj,Dao dao) {
		this.obj = obj;
		this.dao=dao;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("before");
		dao.save();
		Object result = method.invoke(obj, args);
		System.out.println("after");
		dao.save();
		return result;
	}

}
