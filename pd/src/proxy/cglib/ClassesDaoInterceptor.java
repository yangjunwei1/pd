package proxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * 1������Ŀ���� 2���������� 3�����invoke����
 * 
 * @author Think
 * 
 */
public class ClassesDaoInterceptor implements MethodInterceptor {
	private Object target;
	private MyTransaction myTransaction;
	public ClassesDaoInterceptor(Object target, MyTransaction myTransaction) {
		this.target = target;
		this.myTransaction = myTransaction;
	}
	public Object create() {
		Enhancer en = new Enhancer();
		en.setSuperclass(target.getClass());
		en.setCallback(this);
		return en.create();
	}
	@Override
	public Object intercept(Object proxy, Method method, Object[] args,
			MethodProxy arg3) throws Throwable {
		System.out.println(proxy.getClass().getName());
		System.out.println(arg3.getSuperName());
		if (method.getName().equals("saveClasses")
				|| method.getName().equals("updateClasses")) {
			this.myTransaction.beginTransaction();// ֪ͨ
			method.invoke(this.target, args);// Ŀ�귽��
			this.myTransaction.commit();
		} else {
			method.invoke(this.target, args);
		}
		return null;
	}

}
