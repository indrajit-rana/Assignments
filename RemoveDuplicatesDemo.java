
public class RemoveDuplicatesDemo {
	public static void main(String[] args) {
		String name = "azam";
		System.out.println("Initially the string is :"+name);
		char[] ch = name.toCharArray();
		int size = ch.length;
		for(int i = 0; i < size; i++) {

			for(int j = i+1; j < size; j++) {
				if(ch[i] == ch[j]) {

					int k = j;
					while(k<size-1) {
						ch[k] = ch[k+1];
						k++;
					}
					j--;
					size--;
				}
			}

		}
		System.out.println("after removing duplicates:");
		for(int i = 0; i<size; i++) {
			System.out.print(ch[i]);
		}

	}
}
