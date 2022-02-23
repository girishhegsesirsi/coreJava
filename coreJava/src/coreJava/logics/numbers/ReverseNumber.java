package coreJava.logics.numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number = 123456789;
reverseNumber(number);
	}
	public static void reverseNumber(int number){
		System.out.println("number: "+number);
		int reverse =0;
		while(number!=0) {
			int reminder = number % 10;
			System.out.println(reminder);
			reverse= reverse*10 + reminder;
			number = number/10;
		}
		
		System.out.println("reverse number: "+reverse);
	}
}
