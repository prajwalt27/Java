
public class Test2 {

	static void prime_num(int n)
	{ 
		int m=n/2;
		int flag=0;
		for(int i=2;i<=m;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not a prime number !!");
			}
			flag=1;
			break;
		}
		if(flag==0)
		{
			System.out.println("it's Prime number !!");
		}
	}
	
	public static void main(String[] args) {
		
            prime_num(3);
	}

}
