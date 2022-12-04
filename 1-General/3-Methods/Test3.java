
public class Test3 {

	static int gcd(int n,int m)
	{
		while(n!=m)
		{
			if(n>m)
			{
				n=n-m;
			}
			else
			{
				m=m-n;
			}
		}
		return m;
	}
	
	public static void main(String[] args) {
	
           System.out.println("The GCD of two numbers is: "+gcd(15,12));
	}

}
