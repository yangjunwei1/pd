package observer;

public class Android implements Observer{

	public Android(){}
	
	private Subject subject;
	
	public Android(Subject subject) {
		this.subject = subject;
		this.subject.registerObserver(this);
	}
	


	@Override
	public void update(int low, int heigh, String weather) {
		System.out.println("Android" + low + "," + heigh + "," + weather);
	}
	
	public void removeSubject() {
		subject.removeObserver(this);
	}
}
