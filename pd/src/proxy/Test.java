package proxy;

public class Test {

	public static void main(String[] args) {
		RealSubject rs = new RealSubject();
		
		SubjectProxy sp = new SubjectProxy(rs);
		
		sp.sales();
	}
}
