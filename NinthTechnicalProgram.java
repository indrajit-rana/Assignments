// palindrome number

import java.util.Scanner;
class NinthTechnicalProgram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		boolean pal = isPalindrome(num);
		if(pal)
			System.out.println(num +" is "+"palindrome");
		else
			System.out.println(num +" is "+" not palindrome");
	}
	public static boolean isPalindrome(int num){
		int check = num;
		int rev = 0, r;
		do{
			r = num%10;
			rev = rev*10+r;
			num = num/10;
		}while(num!=0);
		if(check == rev)
			return true;
		else
			return false;
	}
}