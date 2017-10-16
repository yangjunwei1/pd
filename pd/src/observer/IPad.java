package observer;

public class IPad implements Observer{

	private Subject subject;
	public IPad(){}
	public IPad(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}
	
	
	
	@Override
	public void update(int low, int heigh, String weather) {
		System.out.println("IPad " + low + "," + heigh + "," + weather);
	}
	
	public void removeSubject() {
		subject.removeObserver(this);
	}

}
