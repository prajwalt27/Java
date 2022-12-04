package oops;

class DataHiding{
	
	private double length;
	private double breadth;
	
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
		if(l<0)
		{
			length=0;
		}
		length=l;
	}
	
	public void setBreadth(double b)
	{
		if(b<0)
		{
			breadth=0;
		}
		breadth=b;
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
	
	public String toString()
    {
    	return "\n"+"l: "+length+"\n"+"b: "+breadth+"\n";
    }
}

public class Rectangle {
	
	public static void main(String[] args) {
		
		DataHiding r= new DataHiding();
          
          r.setLength(10.5);
          r.setBreadth(5.5);
          
          System.out.println("Area: "+r.area());
          System.out.println("Perimeter: "+r.perimeter());
          System.out.println("Is it sqaure: "+r.isSquare());
          
          System.out.println("Length: "+r.getLength());
          System.out.println("Breadth: "+r.getBreadth());
          
          System.out.println("Details- "+ r);
	}

}
