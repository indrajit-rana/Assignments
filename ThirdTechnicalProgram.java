// find the sub without using - operator
import java.util.Scanner;
class ThirdTechnicalProgram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		if(num2>0){
			while(num2>0){
				num1--;
				num2--;
			}
		}
		if(num2<0){
			while(num2<0){
				num1++;
				num2++;
			}			
		}
			

		
		System.out.println("The sum is : "+num1);
		
	}
}