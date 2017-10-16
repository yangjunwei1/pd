package observer;

public class Nokia implements Observer{
	private Subject subject;
	public Nokia(){}
	public Nokia(Subject subject) {
		this.subject=subject;
		this.subject.registerObserver(this);
	}
	


	@Override
	public void update(int low, int heigh, String weather) {
		System.out.println("Nokia" + low + "," + heigh + "," + weather);
	}
	@Override
	public void removeSubject() {
		subject.removeObserver(this);
		
	}
}
