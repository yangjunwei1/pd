package abstractFactory;


public class MainClass {
	public static void main(String[] args) {
		IFruitFactory ff = new NorthFruitFactory();
		IFruit apple = ff.getApple();
		apple.get();
		
		IFruit banana = ff.getBanana();
		banana.get();
		System.out.println("--------------------------------");
		IFruitFactory ff2= new SouthFruitFactory();
		IFruit apple2 = ff2.getApple();
		apple2.get();
		
		IFruit banana2 = ff2.getBanana();
		banana2.get();
		System.out.println("--------------------------------");
		IFruitFactory ff3 = new WenshiFruitFactory();
		IFruit apple3 = ff3.getApple();
		apple3.get();
		
		IFruit banana3 = ff3.getBanana();
		banana3.get();
	}
}
