import java.util.Scanner;
class FourthPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raw:");
		int r = sc.nextInt();
		int str = 1;
		int spc = --r;
		
		for(int i = 1; i <= r; i++){
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= str; j++){
				System.out.print("*");
			}
			System.out.println();
			str++;
			spc--;
		}
	}
}