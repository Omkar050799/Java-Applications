import java.util.Scanner;

class Pattern32
 {
   public void Pattern(int iNo)
    { 
      int iCnt = 0;
      
      for (iCnt = 1; iCnt <= iNo; iCnt++)
        {
          System.out.print("  #  "   +iCnt+    "  *   "  );
        }
    }
 }
class Program32
  {
    public static void main(String arg[])
      {
         int iValue1 = 0, iValue2 = 0;
         
         Scanner sObj = new Scanner(System.in);
         
         System.out.println("Enter the value");
         iValue1 = sObj.nextInt();
         
         Pattern32 pObj = new Pattern32();
         
         pObj.Pattern(iValue1);
         
          

      }
  }
