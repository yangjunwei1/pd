package adapter;

public class SheepAdapter implements Sheep{

	private Wolf wolf;
	public SheepAdapter(Wolf wolf) {
		this.wolf = wolf;
	}
	
	@Override
	public void run() {
		wolf.run();
	}

	@Override
	public void ho() {
		wolf.ho();
	}

}
