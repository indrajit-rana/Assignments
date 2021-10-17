// armstrong number

import java.util.Scanner;
class EighthTechnicalProgram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		boolean arm = isArmstrong(num);
		if(arm)
			System.out.println(num +" is "+"armstrong");
		else
			System.out.println(num +" is "+" not armstrong");
	}
	public static boolean isArmstrong(int num){
		int sum = 0, temp = num;
		int dc = countDigits(num);
		do{
			int r = temp%10;
			sum = sum+power(r,dc);
			temp = temp/10;
		}while(temp!=0);
		return sum == num;
	}
	public static int countDigits(int num){
		int count = 0;
		do{
			count++;
			num = num/10;
		}while(num != 0);
		return count;
	}
	public static int power(int num, int p){
		int pw = 1;
		while(p>0){
			pw = pw*num;
			p--;
		}
		return pw;
	}
}