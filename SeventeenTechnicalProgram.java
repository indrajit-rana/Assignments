//neon number
import java.util.Scanner;
public class SeventeenTechnicalProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int num=n*n,sum=0;
		do {
			int r=num%10;
			sum=sum+r;
			num=num/10;
		}while(num!=0);
		if(sum==n)
			System.out.println(n+" is a neon number");
		else
			System.out.println(n+ " is not a neon number");
		sc.close();
	}
}