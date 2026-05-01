public class Two_C251073{
	public static void main(String[] args){
		int n = 6;
		int[] arr = {3, 4, 6, 9, 1, 2};
		int max = arr[0];

		for(int i=0; i < n; i++){
			System.out.print(arr[i] + " ");
		}

		for(int i=0; i < n; i++){
			if(arr[i] > max)
				max = arr[i];
		}
		
		System.out.println("\nlargest number: " + max);
	}
}
