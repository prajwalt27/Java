import java.util.Scanner;

public class App {

	public static void main(String[] args) {
	    
		//create scanner object
		Scanner input= new Scanner(System.in);
		
		//output the prompt
        System.out.println("Enter a line of test: ");
        
        //user input , for string nextLine()
        String line= input.nextLine();
        
        System.out.println("Enter your fav number: ");
        int num= input.nextInt();
        
        //entered input
        System.out.println("Entered string: "+line);
        System.out.println("Entered number: "+num);
		
	}

}
