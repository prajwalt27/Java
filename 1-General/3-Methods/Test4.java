
public class Test4 {

   static int max_element(int []a,int n)
   {
	   //selection sort
	   for(int i=0;i<n-1;i++)
	   {
		   int min =i;
		   for(int j=i+1;j<n;j++)
		   {
			   if(a[j]<a[min])
			   {
				  min=j;
			   }
			   int temp=a[min];
			   a[min]=a[i];
			   a[i]=temp;
		   }
	   }
	   return a[n-1];
   }
	
	public static void main(String[] args) {
		
         int a[]= {3,21,2,4,5};
         System.out.println(max_element(a,5));
	}

}
