import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int val= 0;
		
		do {
			System.out.println("Enter a number: ");
			val=input.nextInt();
		}
		while(val!=5);
        
		System.out.println("yes, we got it!");
	}

}
