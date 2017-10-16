package singleton;

public class Teacher2 {

	private Teacher2(){}
	private static Teacher2 t=null;
	public static Teacher2 getTeacher2(){
		if(t==null){
			t=new Teacher2();
		}
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
