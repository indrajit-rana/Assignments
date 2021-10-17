// factorial without using loop

import java.util.Scanner;
class SeventhTechnicalProgram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Factorial of "+num +" "+ fact(num));
	}
	public static int fact(int num){
		int f = 1;
		if(num == 1)
			return 1;
		f = num*fact(num-1);
		return f;
	}
}