package javainterviewquestion;

public class ReverseStringWords {

	public static void main(String[] args) {
	String str= "have  a nice day";
	String reverseString="";
	
	String[] words=str.split(" ");
	
	for(int i=words.length-1; i>=0; i--) {
	//reverseString = reverseString + words[i];
		System.out.println(words[i]);
	}
	
//System.out.println(reverseString);
	}

}
