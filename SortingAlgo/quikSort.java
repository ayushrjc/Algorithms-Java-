class qSort{
	public int partition(int[] array, int low, int high) {
		int pivot = array[high];
		int i = (low-1);
		// all element less than pivot to the left of pivot
		for (int j = low; j< high; j++) {
			if(array[j]<pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		int temp = array[i+1];
		array[i+1] = array[high];
		array[high] = temp;
		return i+1;
	}
	
	void sort(int arr[], int low, int high) {
		if(low<high) {
			int pi = partition(arr, low, high);
			sort(arr,low,pi-1);
			sort(arr,pi+1,high);
		}
	}
}
public class quikSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Quick Sort");
		int arr[] = {85,5,8,5,3,7,1,0};
		int n = arr.length;
		qSort obj = new qSort();
		obj.sort(arr, 0, n-1);
		for(int i =0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
