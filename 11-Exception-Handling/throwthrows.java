package exceptiondemo;

class NegativeDimentionException extends Exception{
	
	public String toString() {
		return "Dimension of rectangle cannot be Negative";
	}
	
}

public class throwthrows {
	
//throw :-
//	 static int meth1()
//	 {
//		 return 10/0;
//	 }
//	 
//	 static void meth2()
//	 {
//		 meth1();
//	 }
//	 
//	 static void meth3()
//	 {
//		 meth2();
//	 }
	 
	static int area(int l,int b) throws NegativeDimentionException
	{
		if(l<0 || b<0)
		{
			throw new NegativeDimentionException();
		}
		return l*b;
	}
	
	static void meth1() throws NegativeDimentionException
	{
		System.out.println("Area is "+area(10,-5));
	}
	
     public static void main(String [] args)throws NegativeDimentionException
     { 
//    	try {
//    	  meth3();
//    	}catch(Exception e)
//    	{
//    		System.out.println(e);
//    	}
    	
    	 try {
    		 meth1();
    	 }
    	 catch(NegativeDimentionException e)
    	 {
    		 System.out.println(e);
    	 }
    	
     }
}
