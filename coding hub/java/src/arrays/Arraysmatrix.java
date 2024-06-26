package arrays;

public class Arraysmatrix
{
  public static void main(String[] args) 
	{
	  
		int[]a[]=new int[][] {{9,8,6},{6,2,1},{2,4,8}};
		for(int b=0;b<3;b++)
		{
			for(int c=0;c<3;c++)
			{
				System.out.print(a[b][c]);
			}
			System.out.println();
		}
		System.out.println("---------------");
         for(int x=0;x<3;x++)
         {
        	 for(int y=0;y<3;y++)
        	 {
        		 System.out.print(a[y][x]);
        	 }
        	 System.out.println();
         }
         System.out.println("________________");
         for(int d=0;d<3;d++)
 		 {
 			for(int e=0;e<3;e++)
 			{
 				System.out.print(a[d][e]+a[e][d]+"  ");
 			}
 			System.out.println();
 		  }
         System.out.println("diagnol");
          for(int f=0;f<3;f++)
          {
        	  for(int g=0;g<3;g++)
        	  {
        		  if(f==g)
        		  System.out.print(a[f][g]+" ");
        		  else
        		  System.out.print(" ");
        	  }
        	  System.out.println();
          }
          System.out.println("reverse");
          for(int f=0;f<3;f++)
          {
        	  for(int g=0;g<3;g++)
        	  {
        		  if(f+g==2)
        		  System.out.print(a[f][g]+" ");
        		  else
        		  System.out.print(" ");
        	  }
        	  System.out.println();
          }
          System.out.println("sum of rows");
          
          for(int f=0;f<3;f++)
          {
        	  int sum=0;
        	  for(int g=0;g<3;g++)
        	  {
        		  sum=sum+a[f][g];
        	  }
        	  System.out.print(sum);
        	  System.out.println();
          }
         System.out.println("highest number in a row");
        
         for(int f=0;f<3;f++)
          { 
        	 int max=0;
        	 for(int g=0;g<3;g++)
        	  {
        		  if(max<a[f][g])
        		    max=a[f][g];
        	  }
        	  System.out.println(max);
        }
        System.out.println("sum of row and column");
         for(int f=0;f<3;f++)
         {
       	  int sum=0;
       	  for(int g=0;g<4;g++)
       	  {
       		  if(f<3 && g<3) 
       		  {
       		  sum=sum+a[f][g];
       		  System.out.print(a[f][g]+" ");
       		  }
       		  else
       		  System.out.print(sum);
       	  }
       	  System.out.println();
         }
        
    }
 		
}
