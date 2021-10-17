import java.util.Scanner;
class NinthPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raw:");
		int r = sc.nextInt();
		int str = 1;
		int spc = (r/2)+1;
		for(int i = 1; i <= r; i++){
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= str; j++){
				System.out.print("*");
			}
			System.out.println();
			if(i <= r/2){
				str++;
				spc--;
			}
			else{
				str--;
				spc++;
			}
			
		}
	}
}