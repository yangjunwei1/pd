package template;

public class Tea extends Beverage{

	@Override
	public void brew() {
		System.out.println("�ݲ�");
	}

	@Override
	public void addCoundiments() {
		System.out.println("��ӷ���");
	}
	
	@Override
	public boolean hook() {
		return false;
	}
	
	/*@Override
	public void hook() {
		System.out.println("����һƿ");
	}*/

}
