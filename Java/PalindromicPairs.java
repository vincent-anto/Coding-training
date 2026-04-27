/*
Print the palindromic pairs in given string array
Input : [ “code” , “edoc” , “da” , “d” ] ,
Output : [code,edoc]
*/

import java.util.*;

public class PalindromicPairs{
	public static List<String> PalindromCheck(List<String> li){
		List<String> res = new ArrayList<>();
		Map<String,String> map = new HashMap<>();

		for(String i : li){
			if(!map.containsKey(i)){
				map.put(new StringBuilder(i).reverse().toString(),i);
				continue;
			}
			res.add(map.get(i));
			res.add(i);
		}
		return res;
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		List<String> li = new ArrayList<>();
		while(scan.hasNext())
			li.add(scan.nextLine());
		System.out.println(PalindromCheck(li));
	}
}