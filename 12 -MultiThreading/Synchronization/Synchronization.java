package multithreading;

class MyData{
	
  synchronized public void display(String str) {
	
//only one thread is allowed in synchronized method
//	 synchronized(this)	
//	{ 
		 //critical section
		 for(int i=0;i<str.length();i++)
		{
			System.out.print(str.charAt(i));
			try {
				Thread.sleep(100);
			}catch(Exception e) {}
		}
	}	
// }
}

class MyThread4 extends Thread
{
	MyData d;
	public MyThread4(MyData d)
	{
		this.d=d;
	}
	
	public void run()
	{
		d.display("Welcome All");
	}
}

class MyThread5 extends Thread
{
	MyData d;
	public MyThread5(MyData d)
	{
		this.d=d;
	}
	
	public void run()
	{
		d.display("I am very glad to see u guys!!");
	}
}

public class Synchronization {

	public static void main(String[] args) {
		
		MyData d1= new MyData();
		MyThread4 t1= new MyThread4(d1);
		MyThread5 t2= new MyThread5(d1);
        
		t1.start();
		t2.start();

	}

}
