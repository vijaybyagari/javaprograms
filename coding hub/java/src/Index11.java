public class Index11 
{
  public static void main(String args[])
	{
	 int arr[]=new int[] {10,10,7,14,10,58,10};
	 int count=0;
	 for(int temp:arr)
	 {
		 //System.out.println(temp);
		 count++;
	 }
	 System.out.println("count of an array  "+count);
	 for(int x=0;x<count;x++)
	 {
		if(arr[x]==10) 
		System.out.println("10 is present in array  "+x);
	}
   }

}
