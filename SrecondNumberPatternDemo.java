/*
1111111
1111122
1111333
1114444
1155555
1666666
7777777
*/

import java.util.Scanner;
class SrecondNumberPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = 1;
		int vac = r-1;
		
		for(int i = 1; i <= r; i++){
			for(int j = 1; j <= vac; j++){
				System.out.print("1");
			}
			for(int j = 1; j <= num; j++){
				System.out.print(num);
			}
			System.out.println();
			num++;
			vac--;
		}	
	
	}
}