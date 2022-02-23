package coreJava.logics.string;

public class RemoveCharswhichAreInAnotherString {
	static final int NO_OF_CHARS = 256;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "Alphabets";
String str2="Alphas";
//removeRepeating(str1,str2);

System.out.println(removeRepeating(str1,str2));
	}
	public static String removeRepeating(String str1, String str2){
		int i=0,j=0;
		
		int count[]=getCharCountArray(str2);
	    char arr[] = str1.toCharArray();
		
		while(i!=str1.length()) {
			char temp = str1.charAt(i);
			if(count[temp]==0) {
			arr[j]=arr[i];
			j++;
			}
			i++;
		}
		String str = new String (arr);
		
		return str.substring(0, j);
	}
	
	/* Returns an array of size 256 containg count
    of characters in the passed char array */
 static int[] getCharCountArray(String str)
 {
     int count[] = new int[NO_OF_CHARS];
     for (int i = 0; i < str.length(); i++)
         count[str.charAt(i)]++;

     return count;
 }
}
