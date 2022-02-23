package coreJava.logics.string;

public class StringPermute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
permute("abcd","");
	}
public static void permute(String str, String word) {
	if(str.length()==0)
		System.out.println(word);
	else
		for(int i=0; i<str.length();i++) {
			permute(str.substring(0,i)+str.substring(i+1),word+str.charAt(i));
		}
}
}
