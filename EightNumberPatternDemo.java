/*
 1
 1  2  1
 1  2  3  2  1
 1  2  3  4  3  2  1
 1  2  3  4  5  4  3  2  1
 1  2  3  4  5  6  5  4  3  2  1
 1  2  3  4  5  6  7  6  5  4  3  2  1
 */
 
import java.util.Scanner;
class EightNumberPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = 1;
		
		for(int i = 1; i <= r ; i++){
			for(int j = 1; j <= num; j++){
				System.out.print(" "+j+" ");
			}
			for(int j = num-1; j >= 1; j--){
				System.out.print(" "+j+" ");
			}
			System.out.println();
			num++;
		}
	}
}