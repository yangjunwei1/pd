package abstractFactory;


public class WenshiFruitFactory implements IFruitFactory {

	public IFruit getApple() {
		return new WenshiApple();
	}

	public IFruit getBanana() {
		return new WenshiBanana();
	}

}
