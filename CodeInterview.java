package java_code_interview;

import java.util.Arrays;

public class CodeInterview {
	
	//Q 3
	public static void uRLify(char[] arr, int length){
		int j = arr.length-1;
		for (int i=length-1; i>=0 ;i--){
			if(arr[i] != ' '){
				arr[j] = arr[i];
			}
			else{
				arr[j] = '0';
				arr[j-1] = '2';
				arr[j-2] = '%';
				j = j -2;
			}
			j--;
		}
	}
	
	//Q 4
	
	public static boolean palindromePermutation(String str){
		int numOfOdd = 0; int num;
		int numOfApp[] = new int[256];
		for (int i=0;i<str.length();i++){
			if (str.charAt(i) == ' ') continue;
			num = ++numOfApp[(int)(Character.toLowerCase(str.charAt(i)))];
			if(num % 2 == 1) numOfOdd++;
			else numOfOdd--;
		}
		return numOfOdd <= 1;
	}
	
	public static void main(String[] args){
		char[] arr = "Mr John Smith    ".toCharArray();
		uRLify(arr , 13);
		System.out.println(new String(arr));
		System.out.println(palindromePermutation("Tact Coal"));
	}
}
