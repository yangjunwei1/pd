package proxy.tank;

public class Test {
public static void main(String[] args) {
	Tank1 t =new Tank1();
	TankTime3 tt = new TankTime3(t);
	tt.move();
}
}
