
class Phone{
	public void call()
	{
		System.out.println("Phone call");
	}
	public void sms()
	{
		System.out.println("Phone sending SMS");
	}
}

interface ICamera
{
	void click();
	void record();
}

interface IMusicPlayer
{
	void play();
	void stop();
}

class SmartPhone extends Phone implements ICamera, IMusicPlayer
{
	public void videoCall()
	{
		System.out.println("Smart Phone video calling");
	}
	
	public void click()
	{
		System.out.println("Smart Phone Clicking Photo");
	}
	
	public void record()
	{
		System.out.println("Smart Phone recording video");
	}
	
	public void play()
	{
		System.out.println("Smart Phone playing music");
	}
	
	public void stop()
	{
		System.out.println("Smart phone stopped playing music");
	}
	
}


public class example {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.click();
		sp.play();

	}

}
