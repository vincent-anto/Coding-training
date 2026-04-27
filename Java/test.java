import java.util.*;

public class test{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 1;i <= n;i++){
			for(int spa = 1;spa < (n+1)-i; spa++)
				System.out.print(" ");
			for(int j = 1;j <= i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		for(int i = 1;i < n;i++){
			for(int spa = 1;spa <= i; spa++)
				System.out.print(" ");
			for(int j = 1;j <= n-i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}