import java.util.Scanner;
class jSearch {
	
	int js(int[] array,int key,int len) {
		int step = (int)Math.floor(Math.sqrt(len));
		int prev =0 ;
		while(array[Math.min(step,len)-1]<key)
		{
			prev = step;
			step = (int)Math.floor(Math.sqrt(len));
			if(prev >= len)
				return -1;
		}
		while(array[prev]<key)
		{
			prev++;
			if (prev == Math.min(step, len))
				return -1;
		}
		if(array[prev]==key)
			return prev;
		return -1;
}
}

public class JumpSearch{

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		jSearch obj=new jSearch();
		Scanner scan =new Scanner(System.in);
		System.out.println("*******Jump Search*******");
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		// Since we cant compare generics ( <T> ) using > or < operators, i have taken int type array
		int len = arr.length;
		System.out.println("Enter key");
		int key = scan.nextInt();
		int pos = obj.js(arr, key,len);
		if(pos==-1)
			System.out.println("Not found");
		else
			System.out.println("Found at position "+(pos+1));
	}
}