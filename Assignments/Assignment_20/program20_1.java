///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : SumEvenNumbers
//  Description  : This method calculates the sum of all even 
//                 numbers up to the given number N.
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 31/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void SumEvenNumbers(int iNum)
    {
        int iCnt = 0, iSum = 0;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        for(iCnt = 2; iCnt <= iNum; iCnt += 2)
        {
            iSum = iSum + iCnt;
        }

        System.out.println("Sum of even numbers up to " + iNum + " is : " + iSum);
    }
}

//  TIME COMPLEXITY : O(N/2)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program20_1
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.SumEvenNumbers(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input :  10      Output : Sum of even numbers up to 10 is : 30
//  Input :  6       Output : Sum of even numbers up to 6 is  : 12
//  Input : -8       Output : Sum of even numbers up to 8 is  : 20
//  Input :  1       Output : Sum of even numbers up to 1 is  : 0
//  Input :  100     Output : Sum of even numbers up to 100 is  : 2550
//
///////////////////////////////////////////////////////////////