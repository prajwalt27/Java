package multithreading;

class Mythread implements Runnable {
	
	public void run()
	{
		int i=1;
		while(true)
		{
			System.out.println(i+" Hello");
			i++;
		}
	}
}

public class Runnableinterface {

	public static void main(String[] args) {
		
		Mythread m = new Mythread();
		Thread t= new Thread(m);
		t.start();
		int i=1;
		while(true)
		{
			System.out.println(i+" World");
			i++;
		}

	}

}
