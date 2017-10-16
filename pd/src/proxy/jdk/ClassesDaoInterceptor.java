package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/**
 * 1������Ŀ����
 * 2����������
 * 3�����invoke����
 * @author Think
 *
 */
public class ClassesDaoInterceptor implements InvocationHandler{
	private Object target;
	private MyTransaction myTransaction;
	public ClassesDaoInterceptor(Object target,MyTransaction myTransaction){
		this.target = target;
		this.myTransaction = myTransaction;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println(proxy.getClass().getName());
		if(method.getName().equals("saveClasses")||
				method.getName().equals("updateClasses")){
			this.myTransaction.beginTransaction();//֪ͨ
			method.invoke(this.target, args);//Ŀ�귽��
			this.myTransaction.commit();
		}else{
			method.invoke(this.target, args);
		}
		return null;
	}

}
