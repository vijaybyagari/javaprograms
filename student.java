class student
{
  public static void main(String args[])
  {
    String sname="khoushik";
    int  rno=99,s1=78,s2=100,s3=100,s4=100,s5=88,s6=90,max=600;
    double total=s1+s2+s3+s4+s5+s6;
    double avg=0;
    System.out.println("studentname     "+sname);
    System.out.println("roll no         "+rno);
     System.out.println("marksobtained   "+total);
      avg=total/max*100;
    System.out.println("average         "+avg);
   if(total>=550)
     System.out.println("GRADE A+");
     else if(total>=500)
     System.out.println("GRADE A");
     else if(total>=400)
     System.out.println("GRADE B");
     else if (total>=300)
     System.out.println("GRADE  C");
     else
     System.out.println("FAILED");
   } 
  }