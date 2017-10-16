package singleton;

public class Teacher1 {

	private Teacher1(){}
	private static final Teacher1 t=new Teacher1();
	public static Teacher1 getTeacher1(){
		return t;
	}
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
