class sSort{
	public void ss(int[] array) {
		int len = array.length;
		for(int i=0;i<len-1;i++) {
			int min_idx = i;
			for(int j=i+1;j<len;j++) {
				if(array[j]<array[min_idx])
					min_idx =j;
			int temp=array[i];
			array[i] = array[min_idx];
			array[min_idx] = temp;
			}
		}
		System.out.println("sorted array:");
		for(int i=0;i<len;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
	}
}

public class selectionSort {
	public static void main(String[] args) {
		sSort obj = new sSort();
		int[] array = {6,5,4,3,2,1};
		int len = array.length;
		System.out.println("*****Selection Sort*****");
		System.out.println("Before sorting");
		for(int k=0;k<len;k++) {
			System.out.print(array[k]+" ");
		}
		System.out.println();
		System.out.println();

		obj.ss(array);
	}

}
