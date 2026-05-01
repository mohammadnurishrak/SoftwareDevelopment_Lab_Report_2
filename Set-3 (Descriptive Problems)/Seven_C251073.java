import java.util.Scanner;

public class Seven_C251073{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("Enter the time you are going to start really: ");
		int startTime = helper.nextInt();

		int finishTime = startTime + 3;

		if(finishTime <= 10){
			System.out.println("This boy can finish in time");
		}else{
			System.out.println("It's too late to start");
		}

	}
}
