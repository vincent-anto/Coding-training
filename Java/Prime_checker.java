import java.util.*;

public class Prime_checker{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		int count = 0;
		for(int i = 1; i*i <= num; i++){
			if(num%i == 0){
				count += 1;
				if(num/i != i)
					count += 1;
			}
		}
		System.out.println(count == 2);
	}
}