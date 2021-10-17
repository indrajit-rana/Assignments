/*
AAAAAAA
AAAAAAB
AAAAABC
AAAABCD
AAABCDE
AABCDEF
ABCDEFG
 */
 
import java.util.Scanner;
class SevenCharacterPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int spc = r-1;
		int num = 1;
		
		for(int i = 1; i <= r; i++){
			for(int j = 1; j <= spc; j++){
				System.out.print("A");
			}
			for(int j = 1; j <= num; j++){
				System.out.print((char)(64+j));
			}
			System.out.println();
			num++;
			spc--;
		}

	}
}