import java.util.Scanner;
class FirstPatternDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r,str;
		System.out.println("Enter the number of raw");
		r = sc.nextInt();
		System.out.println("Enter the number of star");
		str = sc.nextInt();
		
		for(int i = 1; i <= r; i++){
			for(int j = 1; j <= str; j++){
				System.out.print(" * ");
			}
			System.out.println();
		}
			
	}

}