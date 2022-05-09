import java.lang.*;
import java.util.*;

public class read
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        // String name;
        // System.out.println("Hey human whats u r name? ");
        // name= sc.nextLine();
        // System.out.println("A warm welcome "+name+" !");
         sc.useRadix(2);
         int x= sc.nextInt();
         System.out.println(x);
    }
}