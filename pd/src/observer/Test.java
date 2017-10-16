package observer;

public class Test {

	public static void main(String[] args) {
		
		
		WeatherData wd = new WeatherData();
		
		Android android = new Android(wd);
		//android.removeSubject();
		Nokia n = new Nokia(wd);
		IPad ipad = new IPad(wd);
		//ipad.removeSubject();
		
		wd.setData(2, 23, "---");
	}
}
