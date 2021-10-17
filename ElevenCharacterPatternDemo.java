/*

ABCDE
BCDEF
CDEFG
DEFGH
EFGHI

 */
 
import java.util.Scanner;
class ElevenCharacterPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = 1;
		int col = r;
		
		for(int i = 1; i <= r; i++){
			for(int j = i; j <= col; j++){
				System.out.print((char)(64+j));
			}

			System.out.println();
			col++;
		}

	}
}