package arrays;

public class Array
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,9};
		int b[]=new int[6];
		int c[]=new int[6];
		int d[]=new int[3];
		int e[]=new int[3];
		System.out.println("size of an array "+b.length);
		for(int x=0;x<=a.length-1;x++)
		{
			b[x]=a[x];
			System.out.print(b[x]+" ");
		}
		System.out.println();
		
		 for(int x=b.length-1;x>=0;x--) 
		 {
			 c[x]=b[x];
			 System.out.print(c[x]+" ");
		 }
		 System.out.println();
		
		 for(int x=0;x<(a.length)/2;x++)
		 {
			 d[x]=c[x];
			 System.out.print(d[x]+" ");
		 }
		 System.out.println();
		
	    for(int x=a.length-1/2;x<3;x--)
	    {
	    	e[x]=a[x];
	    	System.out.println(e[x]+" ");
	    }
	    
	}	
	}


