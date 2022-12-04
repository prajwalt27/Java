
public class Arguments {

	static void showList(int start,String ...s)
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(start+". "+s[i]);
			start++;
		}
	}
	
	static void show(int ...A)
	{
		for(int x:A)
		{
			System.out.println(x);
		}
	}
	
	public static void main(String[] args) {
		
          show();
          show(10,20,30);
          showList(5,"John","smith","virat");
          
	}

}
