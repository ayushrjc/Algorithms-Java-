class bSort{
	public void bs(int[] array) {
		int len=array.length;
		for(int i = 0 ; i < len-1; i++) {
			for(int j =0 ; j<len-i-1;j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j]= array[j+1];
					array[j+1] = temp;
				}
			}
		}
		System.out.println("After Sorting");
		for(int i=0;i<len;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
}
public class bubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bSort obj = new bSort();
		int[] array = {6,5,4,3,2,1,0};
		int len = array.length;
		System.out.println("*****Bubble Sort*****");
		System.out.println("Before sorting");
		for(int k=0;k<len;k++) {
			System.out.print(array[k]+" ");
		}
		System.out.println();
		System.out.println();

		obj.bs(array);
	}

}
