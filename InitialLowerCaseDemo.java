public class InitialLowerCaseDemo {
	public static void main(String[] args) {
		String name = "azam amir reza";
		System.out.println("Initially the string is :"+name);
		String[] stArr = name.split(" ");
		for(int i = 0; i <= stArr.length-1; i++) {
			char[] ch = stArr[i].toCharArray();
			for(int j = 0; j <= ch.length-1; j++) {
				if(j==0) {
					System.out.print(ch[j]);
				}
				else {
					System.out.print(Character.toUpperCase(ch[j]));
				}
			  }
			System.out.print(" ");
			}
		}

}