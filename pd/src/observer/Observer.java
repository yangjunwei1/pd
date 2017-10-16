package observer;

public interface Observer {

	public void update(int low,int heigh,String weather);
	void removeSubject();
}
