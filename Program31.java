import java.util.Scanner;

class Pattern31
 {
   public void Pattern(int iNo)
    { 
      int iCnt = 0;
      
      for (iCnt = 1; iCnt <= iNo; iCnt++)
        {
          System.out.print(iCnt+    "  *   "  );
        }
    }
 }
class Program31
  {
    public static void main(String arg[])
      {
         int iValue1 = 0, iValue2 = 0;
         
         Scanner sObj = new Scanner(System.in);
         
         System.out.println("Enter the value");
         iValue1 = sObj.nextInt();
         
         Pattern31 pObj = new Pattern31();
         
         pObj.Pattern(iValue1);
         
          

      }
  }
