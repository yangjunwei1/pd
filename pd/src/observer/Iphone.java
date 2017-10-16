package observer;

public class Iphone implements Observer{

	private Subject subject;
	public Iphone(){}
	public Iphone(Subject subject){
		this.subject=subject;
		this.subject.registerObserver(this);
	}

	@Override
	public void update(int low, int heigh, String weather) {
		System.out.println("Iphone" + low + "," + heigh + "," + weather);
	}

	@Override
	public void removeSubject() {
		subject.removeObserver(this);
		
	}
}
