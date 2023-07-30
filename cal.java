class cal{
  public static void main(String args[]){
    
    for(int i=0;i<=5;i++)
    {
      for(int j=0;j<=i;j++)
      {
        System.out.print("*");
      }

      int sp = 2*(5-i);
      for(int j=0;j<=sp;j++)
      {
        System.out.print(" ");
      }

      for(int j=0;j<=i;j++)
      {
        System.out.print("-");
      }
      
      System.out.println();
    }
    

     for(int i=5;i>=0;i--)
    {
      for(int j=0;j<=i;j++)
      {
        System.out.print("*");
      }

      int sp = 2*(5-i);
      for(int j=0;j<=sp;j++)
      {
        System.out.print(" ");
      }

      for(int j=0;j<=i;j++)
      {
        System.out.print("-");
      }
      
      System.out.println();
    }
    




   

   
   
  }
}
