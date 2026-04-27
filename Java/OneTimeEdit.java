/*
4.There are three types of edits that can be performed on strings: insert a
character, remove a character, or replace a character. Given two strings,
write a function to check if they are one edit (or zero edits) away.
EXAMPLE
pale, ple -> true
pales, pale -> true
pale, bale -> true
pale, bake -> false
*/

import java.util.*;

public class OneTimeEdit{
	public static boolean EditCheck(String str,String str1){
	}

	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String str1 = scan.nextLine();
		System.out.println(EditCheck(str,str1));
	}
}