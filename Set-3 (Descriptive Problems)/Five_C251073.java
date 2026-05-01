import java.util.Scanner;

public class Five_C251073{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("Enter 3 numbers (seperated by space): ");
		int a = helper.nextInt();
		int b = helper.nextInt();
		int c = helper.nextInt();
		
		float avg = ((float) a + b) / 2;

		if(avg > c){
			System.out.println("Average of A and B is greater than C");
		} else{
			System.out.println("Average of A and B is not greater than C");
		}
	}
}
