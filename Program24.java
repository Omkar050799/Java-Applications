import java.util.Scanner;

class RangeDisplay24
  {
     public void RangeDisplay(int iStart, int iEnd)
      { 
        int iCnt = 0;
        
        if(iStart >= iEnd)
          {
            System.out.println("Ivalid input");
          } 
        for(iCnt = iStart; iCnt <= iEnd; iCnt++)
          {
            System.out.println(iCnt);
          }      
      } 
  }

class Program24
 {
   public static void main(String arg[])
     {
       int iValue1 = 0, iValue2 = 0; 
       int iRet   = 0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the Number you want");
       iValue1 = sObj.nextInt();
       
       System.out.println("Enter the Number you want");
       iValue2 = sObj.nextInt();
       
       RangeDisplay24 cObj = new RangeDisplay24();
       
       cObj.RangeDisplay(iValue1,iValue2);
       
      // System.out.println(iRet);      
      

     }
 }
