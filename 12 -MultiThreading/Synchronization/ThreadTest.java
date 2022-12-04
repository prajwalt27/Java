package multithreading;

//1st using thread class
//class Mythread extends Thread
//{
//	public void run()
//	{
//		int i=1;
//		while(true)
//		{
//			System.out.println(i+" Hello");
//			i++;
//		}
//	}
//}

//thread class in single class
public class ThreadTest extends Thread {
     
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i+" Hello");
			i++;
		}
	}
	
	public static void main(String[] args) {
	//Mythread t= new Mythread();
	    ThreadTest t= new ThreadTest();
		t.start();
		int i=1;
        while(true)
        {
        	System.out.println(i+" World");
        	i++;
        }
	}

}


