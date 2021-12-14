import java.util.Scanner;

class Pattern33
 {
   public void Pattern(int iNo)
    { 
      int iCnt = 0;
      
      for (iCnt = 1; iCnt <= iNo + iNo; iCnt++)
        {
          if((iCnt % 2) == 0)
          {
          System.out.print(iCnt + "\t");
          }
        }
    }
 }
class Program33
  {
    public static void main(String arg[])
      {
         int iValue1 = 0, iValue2 = 0;
         
         Scanner sObj = new Scanner(System.in);
         
         System.out.println("Enter the value");
         iValue1 = sObj.nextInt();
         
         Pattern33 pObj = new Pattern33();
         
         pObj.Pattern(iValue1);
         
          

      }
  }
