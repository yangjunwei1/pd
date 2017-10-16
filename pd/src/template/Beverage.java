package template;

public abstract class Beverage {

	public final void create() {
		boilWater();
		brew();
		pourInCup();
		if(hook()) {
			addCoundiments();
		}
		//hook();
	}

	public boolean hook() {
		return true;
	}

	public void pourInCup() {
		System.out.println("����ˮ��");
		
	}

	public abstract void brew();

	public abstract void addCoundiments();

	public void boilWater() {
		System.out.println("�տ�ˮ");
	}
}
