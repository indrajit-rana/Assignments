/*
     F
    E F
   D E F
  C D E F
 B C D E F
A B C D E F
 */
 
import java.util.Scanner;
class FiveCharacterPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = 1;
		int spc = r-1;
		int col = r;
				
		for(int i = r; i >= 1 ; i--){
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}
			for(int j = i; j >= col; j--){
				System.out.print((char)(64+j));
			}
			for(int j = col+1; j <= r; j++){
				System.out.print(" "+(char)(64+j));
			}
			System.out.println();
			num++;
			spc--;
			col--;
		}
	}
}