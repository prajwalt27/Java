package oops;

//If you want to print object itself 
// toString() to string method should be implemented


class Task{
	
	public double r;
	public double h;
	
	public double CurvedArea()
	{
		return 2*Math.PI*r*h;

	}
	
	public double surface_area()
	{
		double x= 2*Math.PI*r;
		double y= r+h;
		return x*y;
	}
	
    public double volume()
    {
    	return Math.PI*r*r*h;
    }
    
    //to print object itself toString method is used
    public String toString()
    {
    	return "\n"+"Radius: "+r+"\n"+"Height: "+h+"\n";
    }
}


public class cylinder {

	public static void main(String[] args) {
		
		Task t= new Task();
        t.r=5;
        t.h=10;
        
		System.out.println("LidArea: "+t.CurvedArea());
		System.out.println("TotalSurfaceArea: "+t.surface_area());
		System.out.println("Volume: "+t.volume());
		System.out.println("Details- "+ t);
	}

}
