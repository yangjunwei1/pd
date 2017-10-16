package proxy.tank;

public class Client {
	public static void main(String[] args) throws Exception {
		Tank1 t = new Tank1();
		InvocationHandler h = new TimeHandler(t);
		MoveAble m = (MoveAble)Proxy.newProxyInstance(MoveAble.class, h);
		m.move();
	}
}
