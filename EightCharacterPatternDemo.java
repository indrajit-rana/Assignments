/*
 A B C D E F E D C B A
 B C D E F E D C B
 C D E F E D C
 D E F E D
 E F E
 F
 */
 
import java.util.Scanner;
class EightCharacterPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = r;
		int col = 1;
		
		for(int i = 1; i <= r; i++){
			for(int j = i; j <= r; j++){
				System.out.print(" "+(char)(64+j));
			}
			for(int j = r-1; j >= col; j--){
				System.out.print(" "+(char)(64+j));
			}
			System.out.println();
			num--;
			col++;
		}

	}
}