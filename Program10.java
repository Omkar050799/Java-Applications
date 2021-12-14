import java.util.Scanner;

class CheckZero10
  {
     public boolean ChkZero(int iNo)
      { int iDigit = 0 ;
        int iZero = 1;
      
         if (iNo < 0)
           {
             iNo = -iNo;
           }
           while(iNo != 0)
            {
              iDigit = iNo % 10;
               
               System.out.println(iDigit);
               
               iZero = iZero * iDigit;          

              iNo = iNo / 10;
             }
           if(iZero == 0)
             {
               return true;
             }
           else
             {
               return false;
             }  
      } 
  }

class Program10
 {
   public static void main(String arg[])
     {
       int iValue = 0; 
       boolean iRet = false;
       
       Scanner sObj = new Scanner(System.in);
       
       System.out.println("Enter the number you want to reverse");
       iValue = sObj.nextInt();
       
       CheckZero10 cObj = new CheckZero10();
       
       iRet = cObj.ChkZero(iValue);
         if(iRet == true)
           {
              System.out.println("It Contains Zero");
      	   }
      	  else
      	   {
              System.out.println("there is no Zero");
      	   } 
     }
 }
