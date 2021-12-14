import java.util.Scanner;

class RangeDisplayRev28
  {
     public void RangeDisplayRev(int iStart, int iEnd)
      { 
        int iCnt = 0;
        
        if(iStart > iEnd)
          {
            System.out.println("Ivalid input");
          } 
        for(iCnt = iEnd; iCnt >= iStart; iCnt--)
          {
            System.out.println(iCnt);
          }      
      } 
  }

class Program28 
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
       
       RangeDisplayRev28 cObj = new RangeDisplayRev28();
       
       cObj.RangeDisplayRev(iValue1,iValue2);
       
      // System.out.println(iRet);      
      

     }
 }
