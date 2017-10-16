package proxy;

public class SubjectProxy implements Subject{

	private Subject subject;
	public SubjectProxy(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void sales() {
		subject.sales();
	}

}
