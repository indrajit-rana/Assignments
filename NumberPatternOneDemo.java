/*
      1
     121
    12321
   1234321
  123454321
 12345654321
1234567654321
 */
 
import java.util.Scanner;
class NumberPatternOneDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = 1;
		int spc = r-1;
				
		for(int i = 1; i <= r ; i++){
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= num; j++){
				System.out.print(j);
			}
			for(int j = num-1; j >= 1; j--){
				System.out.print(j);
			}
			System.out.println();
			num++;
			spc--;
		}
	}
}