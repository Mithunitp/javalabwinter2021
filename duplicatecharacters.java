package j10_02_2021;

import java.util.Scanner;

public class duplicatecharacters {

	public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	       System.out.println("Enter string: ");
	       String str = s.next();
	       int a[]=new int[28];
	       for(int i=0;i<str.length();i++)
	       {
	    	   a[(int)str.charAt(i)-97]++;
	       }
	       for(int i=0;i<28;i++)
	       {
	    	   if(a[i]!=0)
	    	   {
	    		   char t=(char)(97+i);
		       System.out.println(t+" occurs "+a[i]+" times ");
	    	   }
		   }
	       
	}

}
