import java.util.*;

public class NextBiggestNum{
	public static int[] NextNum(int[] arr,int n){
		int max = -1;
		for(int i = n-1;i >= 0;i--){
			int tempval = arr[i];
			arr[i] = max;
			if(tempval > max)
				max = tempval;
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++)
			arr[i] = scan.nextInt();
		for(int i : NextNum(arr,n))
			System.out.print(i+" , ");
	}
}/*1299*/