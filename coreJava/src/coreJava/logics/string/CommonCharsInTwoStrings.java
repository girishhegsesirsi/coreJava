package coreJava.logics.string;

public class CommonCharsInTwoStrings {
private static final int MAX_CHAR=26;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="alpha",  s2 = "alphabet";
		
		printCommon(s1,s2);

	}
	
	public static void printCommon (String str1, String str2) {
	     // two arrays of length 26 to store occurrence 
        // of a letters alphabetically for each string 
		int[] a1 = new int[MAX_CHAR];
		int[] a2 = new int[MAX_CHAR];
		
	      int length1 = str1.length(); 
	      int length2 = str2.length(); 
	      
	      for (int i=0; i<length1; i++) {
	    	//  System.out.println((str1.charAt(i)-'a'));
	    	  a1[str1.charAt(i)-'a'] +=1;
	      }
	      for (int i=0; i<length2; i++) {
	    	  a2[str2.charAt(i)-'a'] +=1;
	      }
	      
	      
	   // If a common index is non-zero, it means 
	        // that the letter corresponding to that 
	        // index is common to both strings 
	      for (int i = 0 ; i < MAX_CHAR ; i++) 
	        { 
	            if (a1[i] != 0 && a2[i] != 0) 
	            { 
	                // Find the minimum of the occurrence 
	                // of the character in both strings and print 
	                // the letter that many number of times 
	                for (int j = 0 ; j < Math.min(a1[i], a2[i]) ; j++) 
	                    System.out.println(((char)(i + 'a'))); 
	            } 
	        } 
	}

}
