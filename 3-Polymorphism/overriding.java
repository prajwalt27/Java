
//Runtime Polymorphism -> Method Overriding

class Super{
	
	protected void display()
	{
		System.out.println("Super Display");
	}
	
}

class Sub extends Super{
	public void display()
	{
		System.out.println("Sub Display");
	}
}


public class overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Super s= new Super();
		s.display();
		
		Super s1= new Sub();
		s1.display();
	}

}
