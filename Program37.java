import java.util.Scanner;

class Pattern37
 {
   public void Pattern(int iRow , int iCol)
     {
       int i = 0, j = 0;
       
       for(i = 1; i <= iRow ; i++)
          {
            for(j = 1; j <= iCol; j++)
              {  
                 if((j % 2) == 0)
                  {
                   System.out.print("#\t");
                  }   
                  else 
                  {
                    System.out.print("*\t");
                  }    
              }
          System.out.println("");                      
          }
     }
 }
 
class Program37
  {
    public static void main(String arg[])
      {  
        int iValue1 = 0, iValue2 = 0;
        
        Scanner sObj = new Scanner(System.in);
        
        System.out.println("Enter the Row");
        iValue1 = sObj.nextInt();
        
        System.out.println("Enter the Row");
        iValue2 = sObj.nextInt();
        
        Pattern37 pObj = new Pattern37();
        
        pObj.Pattern(iValue1,iValue2);
        
                   
          
 
      }    
  } 
