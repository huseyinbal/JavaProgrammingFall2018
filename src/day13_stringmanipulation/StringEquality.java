package day13_stringmanipulation;

public class StringEquality {
	public static void main(String[] args) {
		String str1="abc";
		String str2="abc";
		System.out.println(str1==str2);//true-try not to use (==) in string variables
		
		String str3=new String("abc");
		String str4="abc";
		System.out.println(str3=str4);//false-(==) usually works for primitives.
		
		
		String str5=new String("abc");
		String str6=new String("abc");
		System.out.println(str5==str6);//false too.!
		
		System.out.println(str1.equals(str2));// always use equals for string.
		System.out.println(str3.equals(str4));
		
	}
}
