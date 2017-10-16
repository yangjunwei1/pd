package Strategy;

public class DataSorter {

	public static void sort(MyComparator[] arr){
		for (int i = arr.length; i >0 ; i--) {
			for(int j=0;j<i-1;j++){
				MyComparator m1=arr[j];
				MyComparator m2= arr[j+1];
				if(m1.comparatorTo(m2)==1){
					swap(arr,j,j+1);
				}
			}
		}
	}

	private static void swap(Object[] arr, int j, int i) {
		Object temp =arr[j];
		arr[j]=arr[j+1];
		arr[j+1]=temp;
		
	}
}
