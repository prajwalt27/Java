
class Parent{
	public Parent()
	{
	    System.out.println("Non-param ,Parent Construtor");
	}
	public Parent(int x)
	{
		System.out.println("Param of parent: "+x);
	}
}

class Child extends Parent{
	Child()
	{
		System.out.println("Non-param ,Child constructor");
	}
	Child(int y)
	{
		System.out.println("Param of child");
	}
	Child(int x,int y)
	{
		super(x);
		System.out.println("2 Param of Child");
	}
}

//class GrandChild extends Child{
//	public GrandChild()
//	{
//		System.out.println("Non-param ,GrandChild Constructor");
//	}
//	public GrandChild(int z)
//	{
//		System.out.println("Param of GrandChild");
//	}
//}


public class Example {

	public static void main(String[] args) {
	  // Parent p= new Parent();
     Child gc= new Child(19,20);
   //  GrandChild gc1= new GrandChild();
	}

}
