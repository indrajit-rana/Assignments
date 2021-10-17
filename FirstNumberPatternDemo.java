/*
 1
 1  2
 1  2  3
 1  2  3  4
 1  2  3  4  5
 */
 
import java.util.Scanner;
class FirstNumberPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = 1;
		
		for(int i = 1; i <= r ; i++){
			for(int j = 1; j <= num; j++){
				System.out.print(" "+j+" ");
				
			}
			System.out.println();
			num++;
		}
	}
}