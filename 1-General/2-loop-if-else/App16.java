//parameter passing

class Robot{
	public void speak(String text) {
		System.out.println(text);
	}
	
	public void jump(int height)
	{
		System.out.println("Jumping: "+height);
	}
	
	public void move(String direction, double distance)
	{
		System.out.println("Having "+distance+" metres in diretion "+ direction);
	}
}

public class App {

	public static void main(String[] args) {
		Robot praj= new Robot();
		praj.speak("Hi I'm praj");
		praj.jump(3);
		praj.move("Wait", 12.1);
	}

}
