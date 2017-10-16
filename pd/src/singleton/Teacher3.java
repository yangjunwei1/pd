package singleton;

public class Teacher3 {

	private Teacher3(){}
	private static Teacher3 t=null;
	public static Teacher3 getTeacher3(){
		if(t==null){
			synchronized (Teacher3.class) {
				if(t==null){
					t=new Teacher3();
				}	
			}
		
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
