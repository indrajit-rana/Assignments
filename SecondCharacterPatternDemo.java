/*
     A
    ABC
   ABCDE
  ABCDEFG
 ABCDEFGHI
  ABCDEFG
   ABCDE
    ABC
     A
	 
*/
import java.util.Scanner;
class SecondCharacterPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raw:");
		int r = sc.nextInt();
		int spc = (r/2)+1;
		int str = 1;
		
		for(int i = 1; i <= r; i++){
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= str; j++){
				System.out.print((char)(64+j));
			}
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}
			System.out.println();
			if(i <= r/2){
				spc--;
				str+=2;
			}
			else{
				spc++;
				str-=2;
			}
		}
	}
}