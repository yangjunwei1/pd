package commond;

public class MracoCommond implements Commond{

	private Commond[] commonds;
	
	public MracoCommond(Commond...commonds) {
		this.commonds = commonds;
	}
	
	@Override
	public void execute() {
		for(Commond cmd : commonds) {
			cmd.execute();
		}
	}

}
