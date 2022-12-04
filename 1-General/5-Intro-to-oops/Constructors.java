package oops;

class Rec{
	private double length;
	private double breadth;
	
	public Rec()
	{
		length=1;
		breadth=1;
	}
	
	public Rec(double l, double b)
	{
		setLength(l);
		breadth=b;
	}
	
	public Rec(double s)
	{
		length=breadth=s;
	}
	
	public double getLength()
	{
		return length;
	}
	
	public double getBreadth()
	{
		return breadth;
	}

	public void setLength(double l)
	{
		if(l>0)
		{
			length=l;
		}
		else
		{
			length=0;
		}
	}
	
	public void setBreadth(double b)
	{
		if(b>0)
		{
			breadth=b;
		}
		else
		{
			breadth=0;
		}
	}
	
	public double area()
	{
		return length*breadth;
	}
	
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	
	public boolean isSquare()
	{
		if(length==breadth)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
}

public class Constructors {

	public static void main(String[] args) {
		 
		Rec r= new Rec();
		Rec r1= new Rec(-10,5);
		Rec r2= new Rec(4);
          
		System.out.println("Area: "+r.area());
		System.out.println("Area: "+r1.area());
		System.out.println("Area: "+r2.area());
	}

}
