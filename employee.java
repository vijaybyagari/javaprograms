class employee
{
   public static void main(String args[])
   {
      String ename="raju";
      int eid=23,bsalary=25000;
      double tax=0,hra=0,ta=0,bonus=0,cgst=0,sgst=0,totalsalary=0;
      hra=15/100.0*bsalary;
      ta=8/100.0*bsalary;
      bonus=20/100.0+bsalary;
      tax=3/100.0*bsalary;
      cgst=2/100.0*bsalary;
      sgst=4/100.0*bsalary;
      totalsalary=hra+ta+bonus-(tax-cgst-sgst);
      System.out.println("employee name     "+ename);
      System.out.println("employee id         "+eid);
      System.out.println("basic salary of employee   "+bsalary);
      System.out.println("employee total salary     "+totalsalary);

   }
}