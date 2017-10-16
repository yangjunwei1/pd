package Iterator;

public class MyLinkTable implements Collection{

	private MyNode head;
	private MyNode tail;
	private int size = 0;

	public void add(Object data) {
		MyNode n = new MyNode(data, null);
		if (head == null) {
			head = n;
			tail = n;
		}
		tail.setNextNode(n);
		tail = n;
		size++;
	}

	public int size() {
		return size;
	}
	
	public MyNode getHead() {
		return head;
	}

	public void setHead(MyNode head) {
		this.head = head;
	}

	public MyNode getTail() {
		return tail;
	}

	public void setTail(MyNode tail) {
		this.tail = tail;
	}
	@Override
	public Iterator iterator() {
		return new Aaa();
	}
	private class Aaa implements Iterator{
		private int c=0;
		MyNode node=null;
		@Override
		public boolean hasNext() {
		
			for (int i = 0; i <=c; i++) {
				if(i==0){
					node = head;
				}else{
					node = node.getNextNode();
				}
				
			}
			if(node==null){
				return false;
			}else{
				return true;
			}
		}

		@Override
		public Object next() {
			for (int i = 0; i <=c; i++) {
				if(i==0){
					node = head;
				}else{
					node = node.getNextNode();
				}
			}
			c++;
			return node;
		}
		
	}
	public static void main(String[] args) {
		MyLinkTable node = new MyLinkTable();
		node.add(1);
		node.add(2);
		node.add(3);
	Iterator iterator = node.iterator();
	while(iterator.hasNext()){
		MyNode node1=	(MyNode) iterator.next();
		System.out.println(node1.getData());
	}
	}

	
}
