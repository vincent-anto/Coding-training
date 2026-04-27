import java.util.*;

public class Recursive_probs{
	public static void ForwardNum(int n){
		if(n == 0) return;
		ForwardNum(n-1);
		System.out.println(n);
	}
	public static void BackwardNum(int n){
		if(n == 0) return;
		System.out.println(n);
		BackwardNum(n-1);
	}
	public static int SumOfNum(int n){
		if(n == 0) return 0;
		return n+SumOfNum(n-1);
	}
	public static int SumOfNumOptimized(int n,int sum){
		if(n == 0) return sum;
		return SumOfNumOptimized(n-1,n+sum);
	}
	public static int Factorial(int n){
		if (n <= 1 ) return 1;
		return n*Factorial(n-1); 
	}
	public static int FactorialOptimal(int n, int mul){
		if(n <= 1) return mul;
		return FactorialOptimal(n-1,n*mul);
	}
	public static void reverseArray(int[] arr, int n) {
		if(n/2 <= arr.length-n) return;
		int temp = arr[n-1];
		arr[n-1] = arr[arr.length-n];
		arr[arr.length-n] = temp;
		reverseArray(arr,n-1);
		/*
		public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] array = new int[num];
		for(int i = 0; i < num ; i++)
			array[i] = scan.nextInt();
		reverseArray(array,num);
		for(int it : array){System.out.println(it);}
		}
		*/
    }
    public static boolean palindromeCheck(String s) {
    	if(s.length() <= 1) return true;
    	if(s.charAt(0) != s.charAt(s.length()-1)) return false;
    	return palindromeCheck(s.substring(1,s.length()-1));
    	/*INPUT:
    	hannah
		aabbaA

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			String str = scan.nextLine();
			System.out.println(palindromeCheck(str));
		}
    	*/  
    }
    public static int fibonacci(int n){
    	if(n == 0) return 0;
    	if(n == 1) return 1;
    	return fibonacci(n-1)+fibonacci(n-2);
    }


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("Fibonacci of "+n+":"+fibonacci(n));
	}
}