



public class Finaldemo {
    
	static final float PI=3.14f;
	
//  Not allowed 
//	final float PI;
//	PI=3.14;

	
//  Allowed in only blocks
//  final float PI;
//  {
//	  PI=3.14f;
//  }
	
//  Allowed in static blocks only for static final variable
//  static final float PI;
//  static  
//	{
//	  PI=3.14f;
//  }
	
	class Test{
		
		public void show()
		{
			System.out.println("Hello");
		}
	}
	
	class test1 extends Test{
		public void show()
		{
			
		}
	}
	
	public static void main(String[] args) {
		final int x=10;
		
// Declaration 
//		final float PI;
//		PI=3.14f;
		System.out.println(PI);
		

	}

}
