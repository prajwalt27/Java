

//compile time polymorphism -> Method Overloading

class Test{
	public int max(int a, int b)
	{
		return a>b?a:b;
	}
	
	public int max(int a,int b, int c)
	{
		if(a>b && a>c) return a;
		else if(b>c) return b;
		return c;
	}
}

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Test t= new Test();
		System.out.println(t.max(10,33));
		System.out.println(t.max(10,33,112));
		
	}

}
