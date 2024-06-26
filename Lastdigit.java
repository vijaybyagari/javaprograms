class Lastdigit
{
 public static void main(String args[])
{
   int i=2567,j=0,k=0,l=0;
   j=i%100;
   System.out.println(j);
   k=j%10;//K=7
   System.out.println(k);
   l=j/10;//L=6
   System.out.println(l);
  if(k%2==0 && l%2==0)
{
 System.out.println("numbers are even");
}
else if(l%2=0)
{
System.out.println("numbers  are odd");
}

 
 }
}