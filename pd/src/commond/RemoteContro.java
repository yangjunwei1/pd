package commond;

import java.util.ArrayList;
import java.util.List;

public class RemoteContro {

	private List<Commond> commondList = new ArrayList<Commond>();
	
	public void setCommond(Commond commond) {
		commondList.add(commond);
	}
	
	public void buttonWasPressed(int index){
		commondList.get(index-1).execute();
	}
}
