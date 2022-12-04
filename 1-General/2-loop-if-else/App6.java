
public class Application {

	public static void main(String[] args) {
	   
		int  cnt= 98;
		
		if(cnt>100)
		{
			System.out.println("Yes, it's true!");
		}
		else if(cnt>80)
		{
			System.out.println("Yes , it's true");
		}
		else
		{
			System.out.println("No, it's false!");
		}
	    
		int loop=0;
		
		while(loop<5)
		{
			System.out.println("Looping "+loop);
			if(loop==5)
			{
				break;
			}
			loop++;
			System.out.println("Runnig");
		}
		
	}

}
