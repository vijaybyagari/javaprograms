class steel
{
  public static void main(String args[])
  {
     int hardness=49,tensile=5000;
     double carbon=0.9;
     if(hardness>=50 && carbon<=0.7 && tensile>=5600)
     System.out.println("GRADE IS 10 ");
     else if(hardness>=50 && carbon<=0.7)
     System.out.println("GRADE IS 9");
     else if(carbon<=0.7 && tensile>=5600)
    System.out.println("GRADE IS 8");
    else if(hardness>=50 && tensile>=5600)
    System.out.println("GRADE IS 7");
    else if(hardness>=50 || carbon<=0.7 || tensile>=5600)
    System.out.println("GRADE IS 6");
    else 
    System.out.println("GRADE IS 5");

     
  }
}