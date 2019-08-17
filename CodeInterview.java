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
	
	//Q 5
	
	public static boolean oneAway(String str1, String str2){
		String mystr1=str1, mystr2 = str2;
		for (int i=0; i<str1.length() && i<str2.length(); i++){
			int j1 = i, j2 = i+1;
			if(str1.charAt(i) != str2.charAt(i)){
				if(str1.length()>str2.length()){
					mystr1 = str2;
					mystr2 =str1;
				}
				else if (str1.length() == str2.length()){
					j1++;
				}
				return mystr1.substring(0,i).equals(mystr2.substring(0,i)) && mystr1.substring(j1).equals(mystr2.substring(j2));
			}
		}
		return str1.equals(str2);
	}
	
	//Q6
	
	public static String strComp(String str){
		if (str.length() == 0) return str;
		int j = 0;
		int counter = 0;
		char nowLetter = str.charAt(0);
		String newStr[] = new String[str.length()];
		char chArr[] = str.toCharArray();
		for (char c : chArr){
			if(c == nowLetter){
				counter++;
			}
			else{
				if(j+1 >= str.length()){
					return str;
				}
				newStr[j] = ""+nowLetter;
				newStr[j+1] = ""+counter;
				j=j+2;
				counter = 1;
				nowLetter = c;
			}
		}
		newStr[j] = ""+nowLetter;
		newStr[j+1] = ""+counter;
		String output = Arrays.toString(newStr).replace(", ", "").replace("[", "").replace("]","").replace("null", "");
		return output.length()>str.length()? str:output;
	}
	
	public static void main(String[] args){
		char[] arr = "Mr John Smith    ".toCharArray();
		uRLify(arr , 13);
		System.out.println(new String(arr));
		System.out.println(palindromePermutation("Tact Coal"));
		System.out.println(oneAway("pale", "bale"));
		System.out.println(strComp("aabcccccaaa"));
		System.out.println(strComp("abca"));
	}
}
