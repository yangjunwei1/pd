package abstractFactory;


public class NorthFruitFactory implements IFruitFactory {
	public IFruit getApple() {
		return new NorthApple();
	}
	public IFruit getBanana() {
		return new NorthBanana();
	}
}
