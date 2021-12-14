//Accept number of rows and number of columns from user and display below
//pattern.
//
// Input : iRow = 4    iCol = 4
//                           
//                          ___1_____ 2______3_____4____5
//
//  *  *  *  *           1 |  (11)   (12)   (13)  (14)  (15)      
//  *  @  @  *           2 |  (21)   (22)   (23)  (24)  (25)     
//  *  @  @  *           3 |  (31)   (32)   (33)  (34)  (35)   
//  *  *  *  *           4 |  (41)   (42)   (43)  (44)  (45)
//                       5 |  (51)   (52)   (53)  (54)  (55)
//                       6 |  (61)   (62)   (63)  (64)  (65)
//                    
//
//////////////////////////////////////////////////////////////

import java.util.Scanner;

class Patterns
 {

   public void Pattern(int iRow, int iColumn)
    {
      int i = 0, j = 0;
      int Start = i;
      
        for(i = 1; i <= iRow; i++ )
           {
             for (j=1; j <= iRow; j++ )
               {
                  if((i > Start && i < iRow) && (j > Start && j < iColumn))
                   {
                     System.out.print("@\t");
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

class Program47
 {
   public static void main(String[] args)
     {
         Scanner sObj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;

        System.out.println("Enter the Row : ");
        iValue1 = sObj.nextInt();

        System.out.println("Enter the Column : ");
        iValue2 = sObj.nextInt();
        
        Patterns pObj = new Patterns();

        pObj.Pattern(iValue1,iValue1);

     }
 }