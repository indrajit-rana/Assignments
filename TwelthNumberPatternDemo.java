/*
1010101
0101010
1010101
0101010
1010101
0101010
1010101
 */
 
import java.util.Scanner;
class TwelthNumberPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
				
		for(int i = 1; i <= r ; i++){
			for(int j = 1; j <= r; j++){
				int sum = i+j;
				if(sum%2==0)
					System.out.print(1);				
				else
					System.out.print(0);
					
			}
			System.out.println();
		}
	}
}