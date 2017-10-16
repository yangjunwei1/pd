package Iterator;

public class MyNode {

	private Object data;
	private MyNode nextNode;
	public MyNode(Object data,MyNode nextNode){
		this.data=data;
		this.nextNode=nextNode;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public MyNode getNextNode() {
		return nextNode;
	}
	public void setNextNode(MyNode nextNode) {
		this.nextNode = nextNode;
	}
	
}
