package commond;

public class LightOnCommond implements Commond{

	private Commond light;
	public LightOnCommond(Commond light) {
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.execute();
	}

}
