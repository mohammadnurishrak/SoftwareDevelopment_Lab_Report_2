public class Five_C251073{
	public static void main(String[] args){
		int evenNums = 0;
		int oddNums = 0;
		int[] arr = {3, 4, 6, 7, 8, 9};
		
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}

		System.out.println();

		for(int i = 0; i < arr.length; i++){
			if(arr[i] % 2 == 0){
				evenNums++;
			} else{
				oddNums++;
			}
		}

		System.out.println("Even numbers: " + evenNums);
		System.out.println("Odd numbers: " + oddNums);
	}
}
