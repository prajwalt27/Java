
class Frog{
	String name;
	int age;
	
	public void setName(String newName)
	{
		name=newName;
	}
	
	public void setAge(int newAge)
	{
		age=newAge;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
}


public class App {

	public static void main(String[] args) {
		
		Frog frog1= new Frog();
		
//		frog1.name="hey";
//		frog1.age=10;
		
		frog1.setName("Hey");
		frog1.setAge(10);		
		
		System.out.println(frog1.getName());
         
	}

}
