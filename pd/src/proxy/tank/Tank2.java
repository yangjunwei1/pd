package proxy.tank;

/**
 * 
 * 继承
 *
 */
public class Tank2 extends Tank1{

	@Override
	public void move() {
	long s = System.currentTimeMillis();
		super.move();
		long e = System.currentTimeMillis();
		System.out.println(e-s);
	}

}
