/*
1
22
333
4444
55555
666666
7777777
 */
 
import java.util.Scanner;
class NumberPatternTwoDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = 1;				
		for(int i = 1; i <= r ; i++){
			for(int j = 1; j <= num; j++){
				System.out.print(num);
			}
			System.out.println();
			num++;
		}
	}
}