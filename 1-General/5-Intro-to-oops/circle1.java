package oops;

class circle{
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

public class circle1 {

	public static void main(String[] args) {
		
		circle c1= new circle();
		circle c2= new circle();
		
		c1.radius=3;
		c2.radius=5;
		
		System.out.println("Area: "+c1.area());
		System.out.println("Perimeter: "+c1.perimeter());
		System.out.println("Circumference: "+c1.circumference());

		System.out.println("Area: "+c2.area());
		System.out.println("Perimeter: "+c2.perimeter());
		System.out.println("Circumference: "+c2.circumference());
	}

}
