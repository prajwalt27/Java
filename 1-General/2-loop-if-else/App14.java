
class Person{
	String name;
	int age;
	
	void speak() {
	  for(int i=0;i<3;i++) {
		System.out.println("My Name is "+ name+" "+" and I am "+ age+" years old");
	 }
	}
	
	void sayHello() {
		System.out.println("Hello There!");
	}
}

public class App {

	public static void main(String[] args) {
		  
		  Person person1= new Person();
		  person1.name ="Joe Bloogs";
		  person1.age= 37;
		  person1.speak();
		  
		  Person person2= new Person();
		  person2.name="Sarah Witch";
		  person2.age=20;
		  person2.speak();
		  person2.sayHello();
		  
		  System.out.println(person1.name);
		  
       
	}

}
