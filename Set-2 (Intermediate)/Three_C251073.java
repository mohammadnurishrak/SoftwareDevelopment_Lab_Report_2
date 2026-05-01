public class Three_C251073{
	public static void main(String[] args){
		int n = 6;
		int[] arr = {3, 5, 6, 9, 1, 2};
		int min = arr[0];

		for(int i=0; i < n; i++){
			System.out.print(arr[i] + " ");
		}

		for(int i=0; i < n; i++){
			if(arr[i] < min)
				min = arr[i];
		}
		
		System.out.println("\nsmallest number: " + min);
	}
}
