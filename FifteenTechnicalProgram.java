//strong number 

import java.util.Scanner;
class FifteenTechnicalProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		int sum=0,t=n;
		do {
			int r=n%10;     
			sum=sum+fact(r);     
			n=n/10;
		}while(n!=0);
		if(t==sum)
			System.out.println(t+" is a strong number");
		else
			System.out.println(t+ " is not a strong number");
		}
	static int fact(int y) {
		int fact=1;
		for(int i=y;i>1;i--) {
			fact=fact*i;
		}
		return fact;
	}
}