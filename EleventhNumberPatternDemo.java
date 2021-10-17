/*
 1
 1  0  1
 1  0  1  0  1
 1  0  1  0  1  0  1
 1  0  1  0  1  0  1  0  1
 1  0  1  0  1  0  1  0  1  0  1
 1  0  1  0  1  0  1  0  1  0  1  0  1
 */
 
import java.util.Scanner;
class EleventhNumberPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raws");
		int r = sc.nextInt();
		int num = 1;
		
		for(int i = 1; i <= r ; i++){
			for(int j = 1; j <= num; j++){
				if(j%2==0){
					System.out.print(" "+0+" ");
				}
				else {
					System.out.print(" "+1+" ");
				}
			}
			System.out.println();
			num+=2;
		}
	}
}