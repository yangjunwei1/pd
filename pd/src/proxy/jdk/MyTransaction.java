package proxy.jdk;


public class MyTransaction {
	public void beginTransaction(){
	System.out.println("开始事务");
	}
	public void commit(){
		System.out.println("提交事务");
	}
}
