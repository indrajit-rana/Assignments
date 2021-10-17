// reverse a string without using loop

import java.util.Scanner;
class TenthTechnicalProgram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		String rev = revString(str);
		System.out.println("The reverse of "+str +" is: "+rev);
	}
	public static String revString(String str){
		String rev = "";
		int len = str.length();
		int i = len-1;
		
		while(i>=0){
			rev = rev+str.charAt(i);
			i--;
		}
		return rev;
	}
}