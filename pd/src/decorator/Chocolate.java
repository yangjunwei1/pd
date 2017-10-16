package decorator;

public class Chocolate extends CakeDecorator{

	private ICake cake;
	
	public Chocolate(ICake cake) {
		this.cake = cake;
	}
	
	@Override
	public float cost() {
		float chocolatePrice = 25f;
		return cake.cost() + chocolatePrice;
	}
}
