
public class Test5 {

   static void max(int ...A)
   {
	   if(A.length==0)
	   {
		  System.out.println("Null");
	   }
	   int m=A[0];
	   for(int i=1;i<A.length;i++)
	   {
		   if(m<A[i])
		   {
			   m=A[i];
		   }
	   }
	   System.out.println(m);
   }
   
   static void sum(int ...A)
   {
	   int sum=0;
	   for(int i=0;i<A.length;i++)
	   {
		   sum+=A[i];
	   }
	   System.out.println("Sum is :"+ sum);
   }
	
   static void discount(double ...A)
   {
	 int sum=0;
	 for(int i=0;i<A.length;i++)
	 {
		 sum+=A[i];
	 }
	 if(sum<=1000)
	 {
		 System.out.println("NO Disconut");
	 }
	 else if(sum<5000 && sum>1000)
	 { 
		System.out.println("15% off !!");
		double dis= (sum*15)*0.01f;
		double amount= sum-dis;
		System.out.println("Total Cost: "+ amount);
	 }
   }
   
	public static void main(String[] args) {
		
	   max(1,2,3);
	   sum(1,2,4);
	   discount(12,2344,122,31);
	}

}
