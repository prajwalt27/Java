package second;
import java.lang.*;
import java.util.Scanner;


public class Area {
     public static void main(String args[])
     {
//    	 float base,height,area;
//    	 System.out.println("Enter base and height: ");
//    	 Scanner sc = new Scanner(System.in);
//    	 base = sc.nextFloat();
//    	 height=sc.nextFloat();
//    	 area=base*height*0.5f;
//    	 
//    	 System.out.println("Area: "+area);
//    	 
    	 
    	 //by another method 
    	 Scanner sc= new Scanner(System.in);
    	 float a,b,c,s;
    	 double area;
    	 System.out.println("Enter the three sides: ");
    	 a=sc.nextFloat();
    	 b=sc.nextFloat();
    	 c=sc.nextFloat();
    	 s=0.5f*(a+b+c);
    	 area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
    	 System.out.println("The area of triangle is: "+area);
    	 
     }
}
