package proxy.cglib;


public class ClassesDaoImpl implements ClassesDao{
	@Override
	public void saveClasses(Classes classes) {
		System.out.println("保存");
	}
}
