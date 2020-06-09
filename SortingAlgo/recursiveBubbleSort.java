class rbSort{
	public void rbs(int[] array, int len) {
		if(len==1)
			return;
		
		for(int j =0 ; j<len-1;j++) {
			if(array[j]>array[j+1]) {
				int temp = array[j];
				array[j]= array[j+1];
				array[j+1] = temp;
			}
		}
		rbs(array,len-1);
	}
	
}
public class recursiveBubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rbSort obj = new rbSort();
		int[] array = {6,5,4,3,2,1,0};
		int len = array.length;
		System.out.println("*****Recursive Bubble Sort*****");
		System.out.println("Before sorting");
		for(int k=0;k<len;k++) {
			System.out.print(array[k]+" ");
		}
		System.out.println();
		System.out.println();

		obj.rbs(array,len);
		System.out.println("After Sorting");
		for(int i=0;i<len;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
