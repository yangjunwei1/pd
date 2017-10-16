package Strategy;

public class Dog implements MyComparator,DongWu{

	private int age;
	private int high;
	private TypeComparator typeComparator =new AgeDescTypeComparator();
	public Dog(){}
	public Dog(int age){
		this.age=age;
	}
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHigh() {
		return high;
	}
	public void setHigh(int high) {
		this.high = high;
	}
	@Override
	public int comparatorTo(Object object) {
		DongWu d = (DongWu) object;
		return typeComparator.comparatorTo(this, d);
		
	}
	
}
