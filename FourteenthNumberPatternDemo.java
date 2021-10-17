/*
0000000
0100000
0020000
0003000
0000400
0000050
0000006
 */
 
import java.util.Scanner;
class FourteenthNumberPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = 0;
				
		for(int i = 1; i <= r ; i++){
			for(int j = 1; j <= r; j++){
				if(j==num+1)
					System.out.print(num);
				else
					System.out.print(0);
					
			}
			System.out.println();
			num++;
		}
	}
}