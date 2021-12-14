import java.util.Scanner;

class MultDidigits17
  {
     public int MultDigits(int iNo)
      { int iDigit = 0 ;
        int iCnt = 1;
        
        if(iNo < 0)
         {
          iNo = -iNo;
         }
         while (iNo != 0)
          {
            iDigit = iNo % 10;
             if(iDigit > 0)
             {
             iCnt = iCnt * iDigit;
             }
            iNo = iNo / 10;
          }
        return iCnt;  
      } 
  }

class Program17
 {
   public static void main(String arg[])
     {
       int iValue = 0; 
       int iRet   = 0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the Number you want");
       iValue = sObj.nextInt();
       
       MultDidigits17 cObj = new MultDidigits17();
       iRet = cObj.MultDigits(iValue);
       
       System.out.println(iRet);      
      

     }
 }
