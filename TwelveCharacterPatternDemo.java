/*
 A B C D E D C B A
 A B C C B A
 A B A
 A
 */
 
import java.util.Scanner;
class TwelveCharacterPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = r;
		
		for(int i = 1; i <= r; i++){
			for(int j = 1; j <= num; j++){
				System.out.print(" "+(char)(64+j));
			}
			for(int j = r-i; j >= 1; j--){
				System.out.print(" "+(char)(64+j));
			}
			System.out.println();
			num-=2;
		}

	}
}