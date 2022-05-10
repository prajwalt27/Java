package second;
import java.lang.*;
import java.util.Scanner;


public class Roots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a,b,c;
         double r1,r2;
         System.out.println("Enter the a,b,c values: ");
         Scanner sc = new Scanner(System.in);
         a=sc.nextInt();
         b=sc.nextInt();
         c=sc.nextInt();
         if(b*b<4*a*c)
         {
        	 System.out.println("The roots are complex...");
         }
         else
         {
        	 r1= (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        	 r2= (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        	 System.out.println("The roots are : "+r1+" "+r2);
         }
         
         
	}

}
