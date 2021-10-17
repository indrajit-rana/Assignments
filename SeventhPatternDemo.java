import java.util.Scanner;
class SeventhPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raw:");
		int r = sc.nextInt();
		int spc = 0;
		int str = r+2;
		
		for(int i = 1; i <= r; i++){
			for(int j =1; j <= spc; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= str; j++){
				System.out.print("*");
			}
			for(int j =1; j <= spc; j++){
				System.out.print(" ");
			}
			System.out.println();
			spc++;
			str = str - 2;
		}
		
	}
}