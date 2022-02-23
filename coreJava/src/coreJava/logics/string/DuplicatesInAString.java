package coreJava.logics.string;

public class DuplicatesInAString {
final static int MAX_CHAR = 26;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "common";
printDuplicate(str);
	}
	
	public static void printDuplicate(String str) {
		int[] a1 = new int[MAX_CHAR];
		
		int length = str.length();
		for(int i=0; i<length;i++) {
			a1[str.charAt(i)-'a'] +=1;
			if(a1[str.charAt(i)-'a']>1) {
				System.out.println(str.charAt(i) + " repeats "+a1[str.charAt(i)-'a'] + " times");
			}
		}
			/*for (int i=0;i<MAX_CHAR;i++) {
				if(a1[i]>=2) {
					System.out.println((char)(i+'a'));
				}
			}*/
		
		
		
	}

}
