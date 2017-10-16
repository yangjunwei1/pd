package Strategy;

public class Cat implements MyComparator,DongWu{

	private int age;
	private int high;
	private TypeComparator typeComparator =new AgeDescTypeComparator();
	public Cat(){}
	public Cat(int age){
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
		DongWu cat = (DongWu) object;
		return typeComparator.comparatorTo(this, cat);
		
	}
	
}
