import java.util.Scanner;

class CountDiff18
  {
     public int CountDiff(int iNo)
      { int iDigit = 0 ;
        int iCntEven = 0;
        int iCntOdd = 0;
        int iTotal = 0;
                
        if(iNo < 0)
         {
          iNo = -iNo;
         }
         while (iNo != 0)
          {
            iDigit = iNo % 10;
             
             if((iDigit % 2 == 0))
             {
             iCntEven = iCntEven + iDigit;
             }
             else
             {
               iCntOdd = iCntOdd + iDigit; 
             }
             
            iNo = iNo / 10;
          }
          iTotal = iCntEven - iCntOdd;
        return iTotal;  
      } 
  }

class Program18
 {
   public static void main(String arg[])
     {
       int iValue = 0; 
       int iRet   = 0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the Number you want");
       iValue = sObj.nextInt();
       
       CountDiff18 cObj = new CountDiff18();
       
       iRet = cObj.CountDiff(iValue);
       
       System.out.println(iRet);      
      

     }
 }
