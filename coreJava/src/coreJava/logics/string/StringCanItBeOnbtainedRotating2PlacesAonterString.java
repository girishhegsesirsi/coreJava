package coreJava.logics.string;

public class StringCanItBeOnbtainedRotating2PlacesAonterString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "amazon";
String str1 = "azonam";
String str2 = "onamaz";
System.out.println(isRotated(str, str1) ?  "Yes"
        : "No");
System.out.println(isRotated(str, str2) ?  "Yes"
        : "No");
	}
	
public static boolean	isRotated(String str, String teststr){
	
	boolean flag=false;
	int n= str.length();
	String temp = teststr.substring(n-2, n)+teststr.substring(0, n-2);
	String temp1 = teststr.substring(2)+teststr.substring(0, 2);

	 // check if any of them is equal to string1
    return (str.equals(temp) ||
            str.equals(temp1));

}
	

}
