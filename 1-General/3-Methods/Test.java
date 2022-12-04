
public class Test {
    
	
	//Either you make the int function static and call it directly
	//else create an base class object and call it.
	static int max(int x,int y)
	{
	 if(x>y)
	 {
		 return x;
	 }
	 else
	 {
		 return y;
	 }
	}
	
	static void inc(int x)
	{
		x++;
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		
		int a=10;
		int b=15;
        
		System.out.println(max(a,b));
		
		//Test t= new Test();
		//System.out.println(t.max(a,b));
		
		inc(a);
		System.out.println(a);
	}

}
