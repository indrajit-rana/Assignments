/*
7654321
765432
76543
7654
765
76
7
*/

import java.util.Scanner;
class FifthNumberPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = r;
		
		
		for(int i = 1; i <= r; i++){
			int value = r;
			for(int j = 1; j <= num; j++){
				System.out.print(value);
				value--;
			}
			System.out.println();
			
			num--;			
		}
	}
}