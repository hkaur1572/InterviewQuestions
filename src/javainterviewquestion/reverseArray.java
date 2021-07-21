package javainterviewquestion;

public class reverseArray {
	public static void main(String[] args) {
		
		int[] arr =new int[5];
		
		arr[0]=1;
		arr[1]=5;

		arr[2]=6;
		arr[3]=2;

		int[] arr1 = {1, 3,8, 9, 5};

		for (int i =arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
	}
}
