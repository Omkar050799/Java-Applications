import java.util.Scanner;

class CountLess13
  {
     public int CountLess(int iNo)
      { int iDigit = 0 ;
        int iCnt = 0;
        
        
      
         if (iNo < 0)
           {
             iNo = -iNo;
           }
           while(iNo != 0)
            {
              iDigit = iNo % 10;
               
              // System.out.print(iDigit);
                if(iDigit < 6)
                 {
                   iCnt++;         
                 }
              iNo = iNo / 10;
             }
         return iCnt;    
      } 
  }

class Program13
 {
   public static void main(String arg[])
     {
       int iValue = 0; 
       int iRet   = 0;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the number you want");
       iValue = sObj.nextInt();
       
       CountLess13 cObj = new CountLess13();
       
       iRet = cObj.CountLess(iValue);
              System.out.println(iRet);
     }
 }
