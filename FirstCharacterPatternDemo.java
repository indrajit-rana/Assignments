/*
ABCDEFG
 ABCDE
  ABC
   A
 

 */
import java.util.Scanner;
class FirstCharacterPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = r+2;
		int spc = 0;
		
	
		for(int i = 1; i <= r; i++){
			
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= num; j++){
				System.out.print((char)(64+j));
			}
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}	

			
			System.out.println();
			spc++;
			num-=2;

		}
	}
}