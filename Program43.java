//Accept number of rows and number of columns from user and display below
//pattern.
//
// Input : iRow = 4    iCol = 4
//                           
//                          ___1_____ 2______3_____4____
//
//  1  2  3  4           1 |  (11)   (12)   (13)  (14)        
//  5  6  7  8           2 |  (21)   (22)   (23)  (24)       
//  9  10 11 12          3 |  (31)   (32)   (33)  (34)     
//  13 14 15 16          4 |  (41)   (42)   (43)  (44)                   
//
//////////////////////////////////////////////////////////////

import java.util.Scanner;


class Patterns
 {
    public void pattern(int iRow, int iColumn)
     {
      int i = 0, j = 0,iCnt = 0;
      char cChar1 , cChar2;

        for (i = 1; i <= iRow ; i++)
          {
            for (j = 1; j <= iColumn ; j++)
              {
                iCnt++;
                     System.out.print(iCnt+"\t");
                                      
              }
            System.out.println("");   
          }

     }
 }

class Program43
 {
   public static void main(String[] args)
     {
         Scanner sObj = new Scanner(System.in);
        int iValue1 =0 , iValue2 = 0;

        System.out.println("Enter the row : ");
        iValue1 = sObj.nextInt();

        System.out.println("Enter the Column : ");
        iValue2 = sObj.nextInt();
        
        Patterns pObj = new Patterns();

        pObj.pattern(iValue1,iValue2);


     }
 }
