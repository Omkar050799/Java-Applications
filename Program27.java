import java.util.Scanner;

class RangeSumEven27
  {
     public int RangeSumEven(int iStart, int iEnd)
      { 
        int iCnt = 0;
        int iAdd = 0;
        
        if(iStart > iEnd)
          {
            System.out.println("Ivalid input");
            return 0;
          }     
        if(iStart < 0)
          {
            System.out.println("Ivalid input");
            return 0;
          }
        if(iEnd < 0)
          {
            System.out.println("Ivalid input");
            return 0;
          }
           
        for(iCnt = iStart; iCnt <= iEnd; iCnt++)
          {
            if((iCnt % 2) == 0)
             {
              iAdd = iAdd + iCnt;
             }
            
          } 
          return iAdd;            
      } 
  }

class Program27
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
       
       RangeSumEven27 cObj = new RangeSumEven27();
       
       iRet = cObj.RangeSumEven(iValue1,iValue2);
       
       System.out.println("Addition is:--"+iRet);      
      

     }
 }
