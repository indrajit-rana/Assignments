//find the duplicate character
import java.util.Scanner;
class SixthTechnicalProgram{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.nextLine();
		
		char[] ch = str.toCharArray();
		int len = ch.length;
		
		for(int i = 0; i < len; i++){
			for(int j = i+1; j < len; j++){
				if(ch[i] == ch[j]){
					System.out.print(ch[i]);
					break;
				}
			}
		}
		
	}
}