package multithreading;


class MyThread2 extends Thread{
	public void run()
	{
		int count=1;
		
		while(true)
		{
			System.out.println(count++ +"My Thread");
		}
	}
}

public class DaemonJoinYield {

	public static void main(String[] args) {
		
        MyThread2 t= new MyThread2();
    //    t.setDaemon(true);
        t.start();
        
        int count =1;
        while(true)
        {
        	System.out.println(count++ +"Main");
            Thread.yield();
        }
        
        
//       Thread mainThread = Thread.currentThread(); 
//		 mainThread.join();
        
//        try {
//        	Thread.sleep(100);
//        }
//        catch(Exception e)
//        {
//        	
//        }
        
	}

}
