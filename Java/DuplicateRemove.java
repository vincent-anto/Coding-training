/*Remove the duplicates in the String.

Testcase 1:
Input: Java1234 Output: Javb1234 (Remove the second ‘a’ as it is duplicated)
Testcase 2:
Input: Python1223: Output: Python1234 (Replace the second 2 with 3, and replace 3 with 4 as 3 is replaced for the duplicated 2)
#316
*/

import java.util.*;

public class DublicateRemove{
	public static String DummyRemover(String str){
		StringBuilder res = new StringBuilder();
		Set<Character> hash = new HashSet<>();
		char[] chars = str.toCharArray();

		for(char cha : chars){
			while(hash.contains(cha))
				cha++;
			hash.add(cha);
			res.append(cha);
		}
		return res.toString();
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(DummyRemover(str));
	}
}