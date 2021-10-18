class StringDemo{
	public static void main(String[] args){
		String name = "azam amir reza";
		System.out.println(name);
		String[] str = name.split(" ");
		for(int i = 0; i <= str.length-1; i++){
			char[] ch = str[i].toCharArray();
			for(int j = ch.length-1; j >= 0; j--){
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}
}