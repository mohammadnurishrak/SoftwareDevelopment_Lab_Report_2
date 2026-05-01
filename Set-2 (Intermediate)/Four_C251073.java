public class Four_C251073{
	public static void main(String[] args){
		int n = 6;
		int[] arr = {3, 4, 6, 7, 9, 1};
		int sum = 0;

		for(int i=0; i < n; i++){
			System.out.print(arr[i] + " ");
		}

		for(int i=0; i < n; i++){
			sum += arr[i];
		}

		float avg = (float) sum/n;
		
		System.out.println("\naverage of the array: " + avg);
	}
}
