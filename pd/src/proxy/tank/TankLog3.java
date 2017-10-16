package proxy.tank;
/**
 * 
 * 聚合
 *
 */
public class TankLog3 implements MoveAble{

	private MoveAble t;
	public TankLog3(){}
	public TankLog3(MoveAble t){
		this.t=t;
	}
	@Override
	public void move() {
	System.out.println("s");
		t.move();
		System.out.println("e");
	}

}
