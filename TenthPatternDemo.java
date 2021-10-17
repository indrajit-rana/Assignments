import java.util.Scanner;
class TenthPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of raw:");
		int r = sc.nextInt();
		int spc = (r/2)+1;
		int str = 1;
		
		for(int i = 1; i <= r; i++){
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}
			for(int j = 1; j <= str; j++){
				System.out.print("*");
			}
			for(int j = 1; j <= spc; j++){
				System.out.print(" ");
			}
			System.out.println();
			if(i <= r/2){
				spc--;
				str+=2;
			}
			else{
				spc++;
				str-=2;
			}
		}
	}
}