//find odd or even without using % 

import java.util.Scanner;
class TwelthTechnicalProgram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(num/2*2==num)
			System.out.println("Even");
		else 
			System.out.println("Odd");
	}
}