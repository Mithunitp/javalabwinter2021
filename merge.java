package j10_02_2021;

import java.util.Scanner;

public class merge {

	public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	       System.out.println("Enter 2 strings: ");
	       String str1 = s.next();
	       String str2 = s.next();
	       String str3[]=new String[50];
	       //char str3;
	       for(int i=0;i<str1.length() || i<str2.length();i++)
	       {
	            if (i<str1.length())
	                str3.append(str1.charAt(i));

	            if (i<str2.length())
	                str3.append(str2.charAt(i));
	       }
	       System.out.println(str3);

	}

}
