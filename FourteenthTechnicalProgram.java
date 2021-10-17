//find the largest number in an array 


class FourteenthTechnicalProgram{
	public static void main(String[] args){
		System.out.println("Array is ");
		int[] numArr = {2,5,10,3,4};
		for(int x :numArr){
			System.out.print(x+" ");
		}
		
		int big = numArr[0];
		for(int i = 1; i < numArr.length; i++){
			if(big < numArr[i]){
				big = numArr[i];
			}
		}
		System.out.println("Biggest number in the array is :"+big);
		
	}
	
}