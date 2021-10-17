/*
 123456789
  23456789
   3456789
    456789
     56789
    456789
   3456789
  23456789
 123456789
 */
import java.util.Scanner;
class NinthNumberPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = r;
		int spc = 1;
		
		for(int i = 1; i <= r; i++){
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}
			for(int j = spc; j <= num; j++){
				System.out.print(j);
			}
			System.out.println();
			if(i <= r/2)
				spc++;
			else 
				spc--;
		}
	}
}