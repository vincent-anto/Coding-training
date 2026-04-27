import java.util.*;

public class vowels{
	public static String vowelsNextVal(String str){
		Set<Character> hash = new HashSet<>(Set.of('a','A','e','E','i','I','o','O','u','U'));
		char[] chars = str.toCharArray();
		StringBuilder st = new StringBuilder();
		for(char i : chars){
			if(hash.contains(i))
				i++;
			st.append(i);
		}
		return st.toString();
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(vowelsNextVal(str));
	}
}