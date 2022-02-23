package coreJava.logics;
//swaps the value 
public class ZeroAtFirstSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {1,2,0,3,0,1,0,4,0,5,0};
int j=0;
for(int i=0;i<arr.length && j<arr.length;) {
	if (arr[i]!=0)
		i++;
	else {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		j++;
	}
}
for (int k:arr)
	System.out.println(k+" ");
	}

}
