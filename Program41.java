//Accept number of rows and number of columns from user and display below
//pattern.
//
// Input : iRow = 4    iCol = 4
//                           
//                          ___1_____ 2______3_____4____
//
//  A  A  A  A           1 |  (11)   (12)   (13)  (14)        
//  B  B  B  B           2 |  (21)   (22)   (23)  (24)       
//  C  C  C  C           3 |  (31)   (32)   (33)  (34)     
//  D  D  D  D           4 |  (41)   (42)   (43)  (44)                   
//
//////////////////////////////////////////////////////////////

import java.util.Scanner;


class Patterns
 {
    public void pattern(int iRow, int iColumn)
     {
      int i = 0, j = 0;
      char cChar1 , cChar2;

        for (i = 1, cChar1 = 'A'; i<= iRow ; i++, cChar1++)
          {
            for (j = 1; j <= iColumn ; j++)
              {
                     System.out.print(cChar1+"\t");
                                      
              }
            System.out.println("");   
          }

     }
 }

class Program41
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
