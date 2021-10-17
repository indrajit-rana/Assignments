/*
1****
12***
123**
1234*
12345
 */
 
import java.util.Scanner;
class NumberPatternSevenDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = 1;
		for(int i = 1; i <= r ; i++){
			for(int j = 1; j <= r; j++){
				if(j <= num)
				System.out.print(j);
				else
					System.out.print("*");
			}
			System.out.println();
			num++;
		}
	}
}