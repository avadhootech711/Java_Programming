///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : CountDigits
//  Description  : This method counts the number of digits in the
//                 given integer and prints the count. Handles zero and
//                 negative numbers correctly.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void CountDigits(int iNum)
    {
        int iCnt = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        if(iNum == 0)
        {
            iCnt = 1;
        }

        while(iNum != 0)
        {
            iCnt ++;
            iNum = iNum / 10;
        }

        System.out.println("Number of digits are : " +iCnt);

    }
}

//  TIME COMPLEXITY : O(N), where N is the number of digits

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program16_5
{
    public static void main(String A[])
    {
        int iValue = 0;

        System.out.println("Enter Number : ");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CountDigits(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application:
//
//  Input :  7523        Output : Number of digits are : 4
//  Input : -4089        Output : Number of digits are : 4
//  Input :  0           Output : Number of digits are : 1
//  Input :  10          Output : Number of digits are : 2
//  Input :  1234        Output : Number of digits are : 4
//
//
///////////////////////////////////////////////////////////////