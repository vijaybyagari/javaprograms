class Upper_lower 
{
  public static void main(String args[])
  {
     char word='u';
     if(word >='a' && word <='z')
    { 
     char upper=(char)(word-32);
     System.out.println(upper);
     } 
     else if(word >='A' &&  word <='Z')
      {
     char lower=(char)(word+32);
     System.out.println(lower);
      }
   }

}
   




