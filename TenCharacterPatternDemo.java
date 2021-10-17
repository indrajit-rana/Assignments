/*
    J
   A A
  V V V
 A A A A
 
 */
 
import java.util.Scanner;
class TenCharacterPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		String r = sc.next();
		int len = r.length();
		int spc = len-1;
		int num = 1;
		
		for(int i = 0; i < len; i++){
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= num; j++){
				System.out.print(" "+r.charAt(i));
			}
			System.out.println();
			num++;
			spc--;
		}

	}
}