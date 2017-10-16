package methodFactory;

public class Test {

	public static void main(String[] args) {
		PeopleFactory manf= new ManFactory();
		People man = manf.create();
		man.say();
		
		PeopleFactory wf= new WomanFactory();
		People w = wf.create();
		w.say();
	}
}
