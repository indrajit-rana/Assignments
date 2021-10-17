// find the remainder without using % operator
import java.util.Scanner;
class FirstTechnicalProgram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter dividant: ");
		int num = sc.nextInt();
		
		System.out.println("Enter divisor: ");
		int div = sc.nextInt();
		
		System.out.println("The remainder is : "+(num-div*(num/div)));
		
	}
}