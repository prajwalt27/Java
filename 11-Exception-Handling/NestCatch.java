package exceptiondemo;

public class NestCatch {

	public static void main(String[] args) {
		
		int A[]= {30,20,10,40,0};
		try {
		   int c=A[0]/A[1];
	       System.out.println("Division is: "+c);
		   try {
	          System.out.println(A[8]);
		   }
		   catch(ArrayIndexOutOfBoundsException e)
		   {
			   System.out.println("Index is Invalid");
		   }
		}
		catch(ArithmeticException e)
		{
			System.out.println("Denominator should not be 0");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Index is Invalid");
		}
		 System.out.println("Bye!");

	}

}
