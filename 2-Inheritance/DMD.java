

class Super2{
	
	public void meth1()
	{
		System.out.println("Super Meth1");
	}
	
	public void meth2()
	{
		System.out.println("Super Meth2");
	}
}

class Sub2 extends Super2
{
	@Override
	public void meth2()
	{
		System.out.println("Sub Meth2");
	}
	
	public void meth3()
	{
		System.out.println("Sub Meth3");
	}
}

public class DMD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
//	Super2 S= new Super2();
//	S.meth1();
//	S.meth2();
//	
//	Sub2 S1=new Sub2();
//	S1.meth2();
//	S1.meth2();
//	S1.meth3();
	
	Super2 S3=new Sub2();
	S3.meth1(); //-> will call the super class
	S3.meth2(); //->will call the sub class meth2

    //	Sub2 S4= new Super2();
	//  Not Allowed , throws error
  }

}
