/*
1. Find number of smaller elements to the right
Input : { 3, 4, 9, 6, 1}
Output : {1,1,2,1,0}
*/

import java.util.*;

public class NextSmallestNum{
	public static int[] SmallNumCount(int[] arr,int n){
		Set<Integer> hash = new HashSet<>();
		for(int i = n-1;i >= 0;i--){
			int count = 0;
			hash.add(arr[i]);
			for(int j : hash)
				if(j < arr[i])
					count++;
			arr[i] = count;
		}
		return arr;
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++)
			arr[i] = scan.nextInt();
		for(int i : SmallNumCount(arr,n))
			System.out.print(i+" ,");
	}
}