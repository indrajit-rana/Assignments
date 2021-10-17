/*
 ABCDE
  BCDE
   CDE
    DE
     E
    DE
   CDE
  BCDE
 ABCDE
@ABCDE
 */
import java.util.Scanner;
class FourCharacterPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = r;
		int spc = 1;
		
		for(int i = 1; i <= r*2; i++){
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}
			for(int j = spc; j <= num; j++){
				System.out.print((char)(64+j));
			}
			System.out.println();
			if(i <= r-1)
				spc++;
			else 
				spc--;
		}
	}
}