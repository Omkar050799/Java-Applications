import java.util.Scanner;

class Pattern36
 {
   public void Pattern(int iRow , int iCol)
     {
       int i = 0, j = 0;
       
       for(i = iRow; i >= 1 ; i--)
          {
            for(j = iCol; j >= 1; j--)
              {
                 System.out.print(j+"\t");        
              }
          System.out.println("");                      
          }
     }
 }
 
class Program36
  {
    public static void main(String arg[])
      {  
        int iValue1 = 0, iValue2 = 0;
        
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("Enter the Row");
        iValue1 = sObj.nextInt();
        
        System.out.println("Enter the Row");
        iValue2 = sObj.nextInt();
        
        Pattern36 pObj = new Pattern36();
        
        pObj.Pattern(iValue1,iValue2);
        
                   
          
 
      }    
  } 
