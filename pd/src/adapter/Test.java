package adapter;

public class Test {

	public static void main(String[] args) {
		
		Wolf w = new Wolf();
		Sheep sa = new SheepAdapter(w);
		sa.run();
		sa.ho();
		
	}
}
