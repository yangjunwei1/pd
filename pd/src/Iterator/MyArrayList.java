package Iterator;

public class MyArrayList implements Collection{

	private Object[] array = new Object[10];
	private int index=0;//数值当前可以放值的下标
	public void add( Object obj){
		if(index==array.length){
			Object[] newArray = new Object[array.length*2];
			System.arraycopy(array, 0, newArray, 0, index);
			array=newArray;
		}
		array[index]=obj;
		index++;
	}
	public int size(){
		return index;
	}
	@Override
	public Iterator iterator() {
		return new Aaa();
	}
	private class Aaa implements Iterator{
		private int c=0;
		@Override
		public boolean hasNext() {
			if(c<index){
				return true;
			}else{
				return false;
			}
		
		}

		@Override
		public Object next() {
			 Object object = array[c];
			 c++;
			return object;
		}
		
	}
	public static void main(String[] args) {
		MyArrayList arr = new MyArrayList();
		for (int i = 0; i < 20; i++) {
			arr.add(new Object());
		}
		System.out.println(arr.size());
		Iterator iterator = arr.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	
}
