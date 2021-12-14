import java.util.Scanner;

class CountOdd15
  {
     public int CountOdd(int iNo)
      { int iDigit = 0 ;
        int iCnt = 0;
         
         if (iNo < 0)
          {
           iNo = -iNo;
          }  
         while(iNo != 0)
          {
            iDigit = iNo % 10;
            if((iDigit % 2) != 0)
             {
               iCnt++;
             }
            iNo = iNo / 10;
          } 
        return iCnt;
      } 
  }

class Program15
 {
   public static void main(String arg[])
     {
       int iValue = 0; 
       int iRet   = 0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the Number you Want");
       iValue = sObj.nextInt();
       
       CountOdd15 cObj = new CountOdd15();
       
       iRet = cObj.CountOdd(iValue);
       
       System.out.println(iRet);      

     }
 }
