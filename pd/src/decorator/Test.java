package decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		
		MilkCake mc = new MilkCake();
		Berry b = new Berry(mc);
		Chocolate c = new Chocolate(b);
		System.out.println("" + c.cost());
		
	
		
	}
}
