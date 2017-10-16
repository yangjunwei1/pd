package commond;

public class TurnTvCommond implements Commond {
	
	private Commond tv;
	public TurnTvCommond(Commond tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.execute();

	}

}
