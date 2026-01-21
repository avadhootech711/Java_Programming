///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : SumEvenOddDigits
//  Description  : This method calculates the sum of even digits
//                 and sum of odd digits of the given number.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void SumEvenOddDigits(int iNum)
    {
        int iDigit = 0, iSumEven = 0, iSumOdd = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        while(iNum != 0)
        {
            iDigit = iNum % 10;

            if(iDigit % 2 == 0)
            {
                iSumEven = iSumEven + iDigit;
            }
            else
            {
                iSumOdd = iSumOdd + iDigit;
            }

            iNum = iNum / 10;
        }
        System.out.println("Sum of Even Digits : " + iSumEven);

        System.out.println("Sum of Odd Digits  : " + iSumOdd);
    }
}

//  TIME COMPLEXITY : O(N) where N is number of digits

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program18_4
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.SumEvenOddDigits(iValue);

        sobj = null;
        lobj = null;

        System.gc();

    }

}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input :  1234        Output : Sum of Even Digits : 6   Sum of Odd Digits : 4
//  Input :  7711        Output : Sum of Even Digits : 0   Sum of Odd Digits : 16
//  Input : -2468        Output : Sum of Even Digits : 20  Sum of Odd Digits : 0
//  Input :  1357        Output : Sum of Even Digits : 0   Sum of Odd Digits : 16
//  Input :  0           Output : Sum of Even Digits : 0   Sum of Odd Digits : 0
//
///////////////////////////////////////////////////////////////