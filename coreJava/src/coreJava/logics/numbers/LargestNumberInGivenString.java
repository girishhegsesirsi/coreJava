package coreJava.logics.numbers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LargestNumberInGivenString {

	public static void main(String[] args) {
		// input alphanumeric string 
        String str = "12abc20yz68"; 
		 // Function call 
	    System.out.println(findLargest(str)); 

	}
public static int findLargest(String str) {
	int max=0;
 // regular expression for atleast one numeric digit	
	String regex = "\\d+";
	// compiling regex 
	Pattern pat = Pattern.compile(regex);
	 // Matcher object 
    Matcher m = pat.matcher(str);
    while(m.find()) {
    int num =Integer.parseInt(m.group());
    
    if (max<num)
    	max=num;
    }
	return max;
}
}
