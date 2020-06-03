import java.util.*;
class lSearch<T> {
	
	int ls(T[] array,T key) {
		int pos=-1;
		int len = array.length;
		for(int i=0;i<len;i++ ) {
			if(array[i]==key) {
				return i;
			}	
		}
		return pos;
	}

}

public class linearSearch{
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lSearch<Integer> obj=new lSearch();
		System.out.println("*******Linear Search*******");
		Scanner scan =new Scanner(System.in);
		Integer[] arr = {1,2,3};
		System.out.println("Enter key");
		int key = scan.nextInt();
		int pos = obj.ls(arr, key);
		if(pos==-1)
			System.out.println("Not found");
		else
			System.out.println("Found at position "+(pos+1));
	}
}
