

class Circle1{
    public double radius;
	
	public double area()
	{
		return Math.PI*radius*radius;
	}
	
	public double perimeter()
	{
		return 2*Math.PI*radius;
	}
	
	public double circumference()
	{
		return perimeter();
	}
}

class Cylinder extends Circle1
{
	public double height;
	
	public double volume()
	{
		return area()*height;
	}
}


public class Cricle {
    
	public static void main(String [] args)
	{
		Cylinder c= new Cylinder();
		
		c.height=10;
		c.radius=5;
		
		System.out.println("Volume: "+c.volume());
		System.out.println("Area: "+c.area());
	}
}