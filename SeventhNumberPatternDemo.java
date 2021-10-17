/*
1234567
123456
12345
1234
123
12
1
*/

import java.util.Scanner;
class SeventhNumberPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = r;
		
		
		for(int i = 1; i <= r; i++){
			int value = r;
			for(int j = 1; j <= num; j++){
				System.out.print(j);
			}
			System.out.println();
			
			num--;			
		}
	}
}