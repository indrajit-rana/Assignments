import java.util.Scanner;
class SecondPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r,str = 1;
		System.out.println("Enter the number of raw");
		r = sc.nextInt();

		
		for(int i = 1; i <= r; i++){
			for(int j = 1; j <= str; j++){
				System.out.print(" * ");
			}
			System.out.println();
			str++;
		}
	}
}