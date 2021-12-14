import java.util.Scanner;

class Pattern1
 {
   public void Pattern(int iNo)
    { 
      int iCnt = 0;
      char ch = '\0';
      
      for (iCnt = 1, ch = 'a'; iCnt <= iNo; iCnt++,ch++)
        {
          System.out.println(ch);
        }
    }
 }
class Program29
  {
    public static void main(String arg[])
      {
         int iValue1 = 0, iValue2 = 0;
         
         Scanner sObj = new Scanner(System.in);
         
         System.out.println("Enter the value");
         iValue1 = sObj.nextInt();
         
         Pattern1 pObj = new Pattern1();
         
         pObj.Pattern(iValue1	);
         
          

      }
  }
