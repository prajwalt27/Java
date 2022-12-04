

class Rectangle{
	int length;
	int breadth;
	int x=10;
	
	Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
}

class Cuboid extends Rectangle
{
	int height;
	int x=20;
	
	Cuboid(int l,int b, int h)
	{
		super(l,b);
		height=h;
	}
	
	void Display()
	{
		System.out.println(super.x);
		System.out.println(x);
	}
}


public class Super {

	public static void main(String[] args) {
		
		Cuboid r= new Cuboid(15,25,35);
		 r.Display();

	}

}
