/*
 1  2  3  4  5  6  7
 1  2  3  4  5  6
 1  2  3  4  5
 1  2  3  4
 1  2  3
 1  2
 1
 1  2
 1  2  3
 1  2  3  4
 1  2  3  4  5
 1  2  3  4  5  6
 1  2  3  4  5  6  7
 */
 
import java.util.Scanner;
class FourthNumberPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = (r/2)+1;
		
		for(int i = 1; i <= r; i++){
			for(int j = 1; j <= num; j++){
				System.out.print(" "+j+" ");
			}
			System.out.println();
			if(i <= r/2)
				num--;
			else
				num++;
		}
		

	}	
}