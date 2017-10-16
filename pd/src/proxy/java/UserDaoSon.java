package proxy.java;

public class UserDaoSon extends UserDao{

	
	@Override
	public void save() {
		System.out.println("xxx");
		super.save();
		System.out.println("xxxx");
	}
}
