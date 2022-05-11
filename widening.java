package second;

public class widening {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b=10;
		short s=10;
		int i=10;
		long l =10;
		float f =10;
		double d=10;
		char c=10;
		boolean bl =true;
		
		s=b;
		i=b;
		l=b;
		f=b;
//		c=b; char to only char and int value
		//bl to bl
		//b=s not allowed
		//to allow we can to do narrowing 
		//i.e  
		b=(byte)s;
		System.out.println(b);
		//check whether the value can be accomodate by the variable or else the data will be devasted
		
		i=s;
		l=s;
		f=s;
		d=s;
		
		
		//i=f not allowed
		f=i;
		d=f;
		f= (float)d;
		
		float f2= 10.5f;
		i=(int)f2;
		System.out.println(i);
		
		
	}

}
