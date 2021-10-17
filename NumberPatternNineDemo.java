/*
5
54
543
5432
54321
 */
 
import java.util.Scanner;
class NumberPatternNineDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = 1;
				
		for(int i = 1; i <= r ; i++){
			int value = r;
			for(int j = 1; j <= num; j++){
				System.out.print(value);
				value--;
			}
			System.out.println();
			num++;
		}
	}
}