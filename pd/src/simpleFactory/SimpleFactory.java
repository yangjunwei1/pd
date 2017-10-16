package simpleFactory;

public class SimpleFactory {

	public static People create(String className) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
		Class class1 = Class.forName(className);
		return	(People) class1.newInstance();
	}
}
