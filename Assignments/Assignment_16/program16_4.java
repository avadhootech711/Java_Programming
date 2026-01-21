///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : ReverseNumber
//  Description  : This method reverses the digits of the given
//                 number and prints the reversed number.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void ReverseNumber(int iNum)
    {
        int iDigit = 0;

        if (iNum < 0)
        {
            iNum = -iNum;
        }

        while(iNum != 0)
        {
            iDigit = (iNum % 10);
            System.out.println(iDigit);
            iNum = iNum / 10;
        }
    }
}

//  TIME COMPLEXITY : O(N), where N is the number of digits in iNum

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program16_4
{
    public static void main(String A[])
    {
        int iValue = 0;

        System.out.println("Enter Number : ");

        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.ReverseNumber(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application:
//
//  Input : 7523
//  Output:
//  3
//  2
//  5
//  7
//
//  Input : -4089
//  Output:
//  9
//  8
//  0
//  4
//
//  Input : 0
//  Output:
//  0
//
///////////////////////////////////////////////////////////////

