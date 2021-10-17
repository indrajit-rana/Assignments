//count
import java.util.Scanner;

public class NineteenTechnicalProgram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
		String st=sc.nextLine();
		char[] ch=st.toCharArray();
		int[] res=countVowelsConsonants(ch);
		System.out.println("Numbers of vowels="+res[0]);
		System.out.println("Numbers of consonant="+res[1]);
		int  spres=countSpecialChar(ch);
		System.out.println("Numbers of special characters="+spres);
		int wordres=wordCount(st);
		System.out.println("Numbers of words="+wordres);
		System.out.println("Number of character="+ch.length);
	}
	static public int[] countVowelsConsonants(char[] ch) {
		int vcount=0,ccount=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z' ) {
				if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
					vcount++;
				else
					ccount++;	
			}
		}
		int[] res= {vcount,ccount};
		return res;
	}
	static int countSpecialChar(char[] ch) {
		int sp=0;
		for(int i=0;i<ch.length;i++) {
			if(!(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z' || ch[i]>='0' && ch[i]<='9' ))
				sp++;
		}
		return sp;
	}
	static int countWords(char[] ch) {
		int wcount=0;
		for(int i=0;i<ch.length;i++) {
			if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
				wcount++;
		}
		return wcount;
	}
	static int wordCount(String st)  
    {  
      int count=0;  
  
        char ch[]= new char[st.length()];     
        for(int i=0;i<st.length();i++)  
        {  
            ch[i]= st.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    } 
}