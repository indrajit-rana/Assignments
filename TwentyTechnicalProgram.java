//lower to uppercase 

import java.util.Scanner;

public class TwentyTechnicalProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String st=sc.nextLine();
		char str[]=st.toCharArray();
		for(int i=0;i<str.length;i++) {
			if(str[i]>='a' && str[i]<='z') {
				str[i]=(char)((int)str[i]-32);
			}
		}
		String newst= new String(str);
		System.out.println(newst);
		sc.close();
	}
}