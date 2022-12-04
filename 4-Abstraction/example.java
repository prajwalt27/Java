package abstraction;


abstract class Shape{
	
	abstract  double perimeter();
	abstract double area();
	
}

class Circle extends Shape{
	
	double radius;
	
	public double perimeter()
	{
		return Math.PI*2*radius;
	}
	
	public double area()
	{
		return Math.PI*radius*radius;
	}
}

class Rectangle extends Shape
{
	double length;
	double breadth;
	
	public double perimeter()
	{
		return 2*(length+breadth);
	}
	
	public double area()
	{
		return length*breadth;
	}
}


public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Rectangle r= new Rectangle();
		r.length=20;
		r.breadth=15;
	System.out.println(r.area());
	System.out.println(r.perimeter());
		
		
		
	}

}
