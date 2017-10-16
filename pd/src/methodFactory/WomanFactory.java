package methodFactory;

public class WomanFactory implements PeopleFactory{
	public  People create() {
		return new Woman();
	}
}
