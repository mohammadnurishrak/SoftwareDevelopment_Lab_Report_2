import java.util.Scanner;

public class Eleven_C251073{
	public static void main(String[] args){
		Scanner helper = new Scanner(System.in);
		System.out.print("Enter the amount of kg pulp reaceived: ");
		int n = helper.nextInt();
		
		int totalPages = n * 1000;
		int totalNoteBooks = (int) Math.floor(totalPages/100);

		System.out.println("Total " + totalNoteBooks + " notebooks can be made out of " + n + " kg pulp");

		helper.close();
	}
}
