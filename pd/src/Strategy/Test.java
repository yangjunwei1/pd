package Strategy;

public class Test {
	public static void main(String[] args) {

		/*Cat[] arr = new Cat[5];
		arr[0]=new Cat(2);
		arr[1]=new Cat(1);
		arr[2]=new Cat(5);
		arr[3]=new Cat(3);
		arr[4]=new Cat(4);
		DataSorter.sort(arr);
		for (DongWu cat : arr) {
			System.out.println(cat.getAge());
		}*/
		Dog[] arr = new Dog[5];
		arr[0]=new Dog(2);
		arr[1]=new Dog(1);
		arr[2]=new Dog(5);
		arr[3]=new Dog(3);
		arr[4]=new Dog(4);
		DataSorter.sort(arr);
		for (DongWu d : arr) {
			System.out.println(d.getAge());
		}
	}
}
