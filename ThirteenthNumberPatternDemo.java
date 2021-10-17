/*
1
22
333
4444
55555
666666
7777777

Not as expected
 */
 
import java.util.Scanner;
class ThirteenthNumberPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = 1;
				
		for(int i = 1; i <= r ; i++){
			for(int j = 1; j <= num; j++){
				int val = num;
				System.out.print(val);
			}
			System.out.println();
			num++;
		}
	}
}