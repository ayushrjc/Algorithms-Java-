import java.util.Scanner;
class bSearch {
	
	int bs(int[] array,int key,int start,int end) {
		int pos=-1;
		if(end>=start) {
			int mid = start +end/2;
			if(array[mid]==key)
				return mid;
			else if(array[mid] > key)
				return bs(array,key,start,mid-1);
			else 
				return bs(array,key,mid+1,end);
		}
		else
			return pos;
	}

}

public class binarySearch{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bSearch obj=new bSearch();
		Scanner scan =new Scanner(System.in);
		System.out.println("*******Binary Search*******");
		int[] arr = {1,2,3,4};
		// Since we cant compare generics ( <T> ) using > or < operators, i have taken int type array
		int len = arr.length;
		System.out.println("Enter key");
		int key = scan.nextInt();
		int pos = obj.bs(arr, key,0,len-1);
		if(pos==-1)
			System.out.println("Not found");
		else
			System.out.println("Found at position "+(pos+1));
	}
}
