public class Six_C251073{
	public static void main(String[] args){
		int[] arr = {3,4,5,6,7};
		int target = 7;
		int lo = 0;
		int hi = arr.length - 1;
		boolean found = false;
	
		while(lo <= hi){
			int mid = lo + (hi - lo)/2;
			int val = arr[mid];

			if(val < target){
				lo = mid + 1;		
			}

			if(val > target) {
				hi = mid - 1;
			}

			if(val == target){
				found = true;
				break;
			}
		}

		System.out.println(found ? "element 7 found in the array" : "element not found");
	}
}

