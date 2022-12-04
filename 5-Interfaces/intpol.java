

interface Test
{
  void meth1();
  void meth2();
}

class My implements Test
{
	public void meth1()
	{
		System.out.println("Meth1 of my class");
	}
	
	public void meth2()
	{
		System.out.println("Meth2 of my class");
	}
	
	public void meth3()
	{
		System.out.println("Meth3 of my class");
	}
}

public class intpol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//          Test t= new Test();
		
		Test t = new My();
		t.meth1();
		t.meth2();
		
		//Meth3() will give error as object t is refering 
		// Test class not the "My" class
		
		My m= new My();
		m.meth3();
	}

}
