package commond;

public class Test {

	public static void main(String[] args) {
		
		Light light = new Light();
		LightOnCommond loc = new LightOnCommond(light);
		
		Tv tv = new Tv();
		TurnTvCommond ttc = new TurnTvCommond(tv);
		
		MracoCommond mc = new MracoCommond(loc,ttc);
		
		RemoteContro rc = new RemoteContro();
		rc.setCommond(ttc);
		rc.setCommond(loc);
		rc.setCommond(mc);
		rc.buttonWasPressed(3);
		//rc.buttonWasPressed(1);
		//rc.buttonWasPressed(2);
		
	}
}
