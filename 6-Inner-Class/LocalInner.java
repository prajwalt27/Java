package innerclass;

//By abstract class
//abstract class My1
//{
//	abstract public void show();
//}

//interface My1{
//	public void show();
//}


//Anonymous inner class
//class Outer2{
//	public void display1()
//	{
//1st way-
//		My1 m= new My1() {
//			public void show()
//			{
//				System.out.println("Anonymous Hello`");
//			}
//		};
//		m.show();
//		
//2nd way-
//	 new My1() {
//		 public void show()
//		 {
//			 System.out.println("Annonymous hello2");
//		 }
//	 }.show();
//	
//	}
//}


//Local inner class
//class Outer1{
//	public void display1()
//	{
//		class Inner1
//		{
//			public void show()
//			{
//				System.out.println("Local Hello");
//			}
//		}
//		Inner i= new Inner();
//		i.show();
//		
//		new Inner1().show();
//		
//	}
//}



//static class
class Outer3{
	int x=10;
	static int y=20;
	
	static class My3{
		public void show()
		{
			System.out.println(y);
		}
	}
}


public class LocalInner
{
   
	public static void main(String [] args)
	{ 
//		Outer1 o1= new Outer1();
//		o1.display1();
//		
//		Outer2 o2 = new Outer2();
//		o2.display1();
//		
		Outer3.My3 m1= new Outer3.My3();
		m1.show();
	}
}
