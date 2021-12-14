import java.util.Scanner;

class Pattern34
 {
   public void Pattern(int iRow, int iCol)
    { 
      int i = 0;
      int j = 0;
      
      for(i = 1; i <= iRow; i++)
         {
          for(j = 1; j <= iCol; j++ )
             {
                System.out.print("*\t");
             }
         System.out.print("\n"); 
        }
    }
 }
class Program34
  {
    public static void main(String arg[])
      {
         int iValue1 = 0, iValue2 = 0;
         
         Scanner sObj = new Scanner(System.in);
         
         System.out.println("Enter the Row value ");
         iValue1 = sObj.nextInt();
         
         System.out.println("Enter the Column Value");
         iValue2 = sObj.nextInt();
         
         Pattern34 pObj = new Pattern34();
         
         pObj.Pattern(iValue1,iValue2);
         
          

      }
  }
