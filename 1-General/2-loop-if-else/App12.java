
public class App {
 
	//multi dimensional arrays
	
	public static void main(String[] args)
	{ 
		
		//1D
		int[] values= {3,5,2343};
		System.out.println(values[2]);
		
		//2D
		int [][] grid= {
				{3,5,2343},
				{2,4},
				{1,2,3,4}
		};
		
	   System.out.println(grid[1][1]);
	   
	   String[][] texts = new String[2][3];
	   
	   texts[0][1]="Hello things";
	   System.out.println(texts[0][1]);
	   
	   for(int row=0;row<grid.length;row++)
	   {
		   for(int col=0;col<grid[row].length;col++) {
			   System.out.println(grid[row][col]+"\t");
		   }
		   System.out.println();
	   }
	
	  String[][] words = new String[2][];
	  
	  System.out.println(words[0]);
	  
	  words[0]= new String[3];
	  words[0][1]="hi there";
	  
	  System.out.println(words[0][1]);
	}
}
