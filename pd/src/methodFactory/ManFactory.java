package methodFactory;

public class ManFactory implements PeopleFactory{
	public  People create() {
		return new Man();
	}
}
