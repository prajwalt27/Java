class Person{
	
	//Instance variables (data or "state")
	String name;
	int age;
	
	
	//classes can contain
	/* 1.Data
	 * 2.SubRoutine(methods)
	 */
}


public class App {

	public static void main(String[] args) {
	  
	  Person person1= new Person();
	  person1.name ="Joe Bloogs";
	  person1.age= 37;
	  
	  Person person2= new Person();
	  person2.name="Sarah Witch";
	  person2.age=20;
	  
	  System.out.println(person1.name);
	  
	}

}
