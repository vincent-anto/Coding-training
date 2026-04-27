import java.util.*;

public class test{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int count = 1;
		int n = scan.nextInt();
		System.out.print("2 ");
		for(int i = 3;i <= n;i += 2){
			boolean isPrime = true;
			for(int j = 3; j * j <= i;j += 2){
				if(i % j == 0)
					isPrime = false;
			}
			if(isPrime){
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println("\n\nCount : "+count);
	}
}