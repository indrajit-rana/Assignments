/*
1
23
456
78910
 
 */
 
import java.util.Scanner;
class NumberPatternSixDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = 1;
		int count = 0;
		for(int i = 1; i <= r ; i++){
			for(int j = 1; j <= num; j++){
				count++;
				System.out.print(count);
			}
			System.out.println();
			num++;
		}
	}
}