package simpleFactory;

public class Test {
public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
	People man = SimpleFactory.create("simpleFactory.Man");
	People woman = SimpleFactory.create("simpleFactory.Woman");
	man.say();
	woman.say();
}
}
