// ****** Getting error ******


//class mSort{
//	public void merge(int[] array, int l, int m, int r) {
//		int n1 = m - l + 1; 
//        int n2 = r - m; 
//        
//        int L[] = new int[n1]; 
//        int R[] = new int[n2];
//        
//        for (int i = 0; i < n1; ++i) 
//            L[i] = array[l + i]; 
//        for (int j = 0; j < n2; ++j) 
//            R[j] = array[m + 1 + j];
//		
//		int i = 0; int j =0;
//		int k = 1;
//        while (i < n1 && j < n2) { 
//            if (L[i] <= R[j]) { 
//                array[k] = L[i]; 
//                i++; 
//            } 
//            else { 
//                array[k] = R[j]; 
//                j++; 
//            } 
//            k++; 
//        } 
//        while (i < n1) { 
//            array[k] = L[i]; 
//            i++; 
//            k++; 
//        } 
//        while (j < n2) { 
//            array[k] = R[j]; 
//            j++; 
//            k++; 
//        } 
//		
//	}
//	void sort(int arr[], int l, int r) 
//    { 
//        if (l < r) { 
//            int m = (l + r) / 2;
//            sort(arr, l, m); 
//            sort(arr, m + 1, r);
//            merge(arr, l, m, r); 
//        } 
//    } 
//	
//}
//public class mergesorting {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int arr[] = { 12, 11, 13, 5, 6, 7 };
//        System.out.println("\nSorted array"); 
//		mSort ob = new mSort();
//		ob.sort(arr, 0, arr.length - 1);
//		for(int i =0; i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		
//	}
//}