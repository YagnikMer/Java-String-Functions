package com.string;

public class StringExamples {
	
	public static void main(String[] args)
	{
		String str="Hello World";
		String str1="   Hello  World   ";
		String str2="HELLO";
		String str3="hello";

		System.out.println("Lower Case : "+str.toLowerCase());
		
		System.out.println("Upper Case : "+str.toUpperCase());
		
		System.out.println("Length : "+str.length());
		
		System.out.println("Without Trim : "+str1);
		
		System.out.println("With Trim : "+str1.trim());
		
		System.out.println("Char At(6) : "+str.charAt(6));
		
		System.out.println("SubString : "+str.substring(0,5));
		
		System.out.println("Replace : "+str.replace("H","C"));
		
		System.out.println("CompareTo : "+str2.compareTo(str3));
		
		System.out.println("CompareToIgnoreCase : "+str2.compareToIgnoreCase(str3));
		
		System.out.println("concat : "+str2.concat(" WORLD"));
		
		System.out.println("contentEquals 1 : "+str2.contentEquals("hELLO"));
		
		System.out.println("contentEquals 2 : "+str2.contentEquals("HELLO"));
	}
}