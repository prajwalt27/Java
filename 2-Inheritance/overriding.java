
class Super1{
	public void Display()
	{
		System.out.println("Super Class Display");
	}
}

class Sub extends Super1{
  //	@Override
	public void Display()
	{
		System.out.println("Sub class Display");
	}
}

public class overriding {

	public static void main(String[] args) {
		
//          Super1 s=new Super1();
//          s.Display();
//          
//          Sub s1= new Sub();
//          s1.Display();
		
		//Dynamic Method Dispatch	
		Super1 s=new Sub();
		s.Display();
		
	}

}
