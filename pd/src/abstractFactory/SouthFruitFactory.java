package abstractFactory;


public class SouthFruitFactory implements IFruitFactory {
	public IFruit getApple() {
		return new SouthApple();
	}
	public IFruit getBanana() {
		return new SouthBanana();
	}
}
