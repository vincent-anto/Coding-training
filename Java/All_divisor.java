import java.util.*;

public class All_divisor{
	public static void divisors(int n){
		List<Integer> al = new ArrayList<>();

		for (int i = 1; i*i <= n; i++){
			if(n%i == 0){
				al.add(i);
				if(n/i != i)
					al.add(n/i);
			}
		}
		al.sort(Comparator.naturalOrder());
		for(int it : al){System.out.println(it);}
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		divisors(input);
	}
}