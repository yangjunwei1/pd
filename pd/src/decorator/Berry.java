package decorator;

public class Berry extends CakeDecorator {

	private ICake cake;
	public Berry(ICake cake) {
		this.cake = cake;
	}
	
	@Override
	public float cost() {
		float berryPrice = 5f;
		return cake.cost() + berryPrice;
	}
}
