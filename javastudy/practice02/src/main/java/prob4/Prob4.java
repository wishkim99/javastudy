package prob4;

public class Prob4 {

	public static void main(String[] args) {
		char[] string1 = reverse( "Hello World" );
		printCharArray(string1);
		
		char[] string2 = reverse( "Java Programming!" );
		printCharArray(string2);
	}
	
	public static char[] reverse(String str) {
		char[] charArr = str.toCharArray();
		char[] reverseArr = new char[charArr.length];
		for(int i = 0; i<charArr.length; i++) {
			reverseArr[charArr.length-1-i] = charArr[i];
		}
		return reverseArr;
	}

	public static void printCharArray(char[] arr){
		System.out.println(arr);
	}
}