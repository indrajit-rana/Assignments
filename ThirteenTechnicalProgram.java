public class ThirteenTechnicalProgram{
	public static void main(String[] args) {
		int[] arr = {5,2,7,4,15,10};
		System.out.print("The array is :");
		for(int elem : arr) {
			System.out.print(" "+elem);
		}
	
		for(int i = 0; i < arr.length-1; i++){
			for(int j = 0; j < arr.length-i-1; j++){
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("After Sortig The Array Is :");
		for(int elem : arr) {
			System.out.print(" "+elem);
		}
		
	}

}
