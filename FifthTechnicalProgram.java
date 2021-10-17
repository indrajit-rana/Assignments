// find the product without using * operator
import java.util.Scanner;
class FifthTechnicalProgram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		
		int prod = 0;
		
		for(int i = 1; i <= num2; i++){
			prod += num1;
		}
			

		
		System.out.println("The sum is : "+prod);
		
	}
}