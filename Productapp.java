class Productapp
{
  public static void main(String args[])
  {
     String name="mixer";
     int pcode=4567,price=7890,quantity=4,total=0,coupon=150;
     double dis=0,tax=0,cgst=0,sgst=0,amount=0;
     total=price*quantity;
     System.out.println("product name    "+name);
     System.out.println("product code    "+pcode);
     System.out.println("product price   "+price);
     System.out.println("quantity         "+quantity);
     System.out.println("total price      "+total);
    if(total<=2000)
   {
      dis=(10/100.0*total);
      System.out.println("discount           "+dis);
      System.out.println("discount_total     "+(total-dis));
    }
   else if(total>=(2000-4000))
    {
        dis=(20/100.0*total);
       System.out.println("discount            "+dis);
       System.out.println("discount_total      "+(total-dis));
    }
    else if(total>=(4000-6000))
    {
      dis=(40/100.0*total);
       System.out.println("discount                "+dis);
       System.out.println("discount_total          "+(total-dis));

    }
    else if (total>=(6000-8000))
    {
      dis=(80/100.0*total);
       System.out.println("discount                 "+dis);
       System.out.println("discount_total           "+(total-dis));

    }
    else if (total>=(8000-10000))
    {
      dis=(100/100.0*total);
       System.out.println("discount                 "+dis);
       System.out.println("discount_total           "+(total-dis));

    }
    
    cgst=3/100.0*total;
    sgst=2/100.0*total;
    amount=((total+cgst+sgst)-dis-coupon);
    System.out.println("amount payable             "+amount);
    
 }
}