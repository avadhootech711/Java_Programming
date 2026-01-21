///////////////////////////////////////////////////////////////
//
//  Required Header Files
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : SumOfDigits
//  Description  : This function calculates the sum of digits of a number.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void SumOfDigits(int iNum)
    {
        int iDigit = 0, iSum = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        while (iNum != 0)
        {
            iDigit = iNum % 10;
            iSum = iSum + iDigit;
            iNum = iNum / 10;
        }

        System.out.println("Sum of digits is : "+iSum);
    }
}

//  TIME COMPLEXITY : O(N), where N is the number of digits

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program17_1
{
    public static void main(String A[])
    {
        int iValue = 0;

        System.out.println("Enter Number : ");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.SumOfDigits(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application:
//
//  Input :  7523        Output : Sum of digits is : 17
//  Input : -4089        Output : Sum of digits is : 21
//  Input :  0           Output : Sum of digits is : 0
//  Input :  12345       Output : Sum of digits is : 15
//  Input :  21          Output : Sum of digits is : 3
//
///////////////////////////////////////////////////////////////