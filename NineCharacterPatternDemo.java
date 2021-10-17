/*
      A
     B B
    C C C
   D D D D
  E E E E E
 F F F F F F
 
 */
 
import java.util.Scanner;
class NineCharacterPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int spc = r-1;
		int col = 1;
				
		for(int i = 1; i <= r ; i++){
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= col; j++){
				System.out.print(" "+(char)(64+i));
			}
			System.out.println();
			spc--;
			col++;
		}
	}
}