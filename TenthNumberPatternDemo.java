/*
 1234567
  23456
   345
    4
   345
  23456
 1234567
 
 Not as expected
 */
import java.util.Scanner;
class TenthNumberPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = r;
		int spc = 1;
		
	
		for(int i = 1; i <= r; i++){
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}
			for(int j = spc; j <= num; j++){
				System.out.print(j);
			}
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}	

			
			System.out.println();
			if(i <= r/2){
				spc++;
				num--;
			}			
			else{
				spc--;
				num++;
			}
		}
	}
}