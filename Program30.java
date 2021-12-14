import java.util.Scanner;

class Pattern30
 {
   public void Pattern(int iNo)
    { 
      int iCnt = 0;
      
      for (iCnt = iNo; iCnt >= 1; iCnt--)
        {
          System.out.print(iCnt+    "  #   "  );
        }
    }
 }
class Program30
  {
    public static void main(String arg[])
      {
         int iValue1 = 0, iValue2 = 0;
         
         Scanner sObj = new Scanner(System.in);
         
         System.out.println("Enter the value");
         iValue1 = sObj.nextInt();
         
         Pattern30 pObj = new Pattern30();
         
         pObj.Pattern(iValue1);
         
          

      }
  }
