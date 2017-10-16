package proxy.tank;
/**
 * 
 * 聚合
 *
 */
public class TankTime3 implements MoveAble{
	private MoveAble t;
	public TankTime3(){}
	public TankTime3(MoveAble t){
		this.t=t;
	}
	@Override
	public void move() {
	long s = System.currentTimeMillis();
		t.move();
		long e = System.currentTimeMillis();
		System.out.println(e-s);
	}
}
