import java.util.Scanner;

class Pattern38
 {
   public void Pattern(int iRow , int iCol)
     {
       int i = 0, j = 0;
       
       for(i = 1; i <= iRow ; i++)
          {
            for(j = 1; j <= iCol; j++)
              {  
                 System.out.print(i+"\t");  
              }
          System.out.println("");                      
          }
     }
 }
 
class Program38
  {
    public static void main(String arg[])
      {  
        int iValue1 = 0, iValue2 = 0;
        
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("Enter the Row");
        iValue1 = sObj.nextInt();
        
        System.out.println("Enter the Row");
        iValue2 = sObj.nextInt();
        
        Pattern38 pObj = new Pattern38();
        
        pObj.Pattern(iValue1,iValue2);
        
                   
          
 
      }    
  } 
