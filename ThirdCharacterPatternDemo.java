/*
ABCDE
 ABCD
  ABC
   AB
    A
   AB
  ABC
 ABCD
ABCDE
ABCDEF
 */
 
import java.util.Scanner;
class ThirdCharacterPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = r;
		int spc = 0;
		
		for(int i = 1; i <= r*2; i++){
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= num; j++){
				System.out.print((char)(64+j));
			}

			System.out.println();
			if(i < r){
				num--;
				spc++;
			}
			else{
				num++;
				spc--;
			}
		}
	}
}