///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : CalculateSum
//  Description  : This method calculates the sum of first N
//                 natural numbers
//  Input        : Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 31/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void CalculateSum(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iSum = iSum + iCnt;
        }

        System.out.println("Sum of first " + iNo + " natural numbers is: " + iSum);

    }

}

//  TIME COMPLEXITY : O(N)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program16_1
{
    public static void main(String A[])
    {
        int iValue = 0;

        System.out.println("Enter Number : ");

        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.CalculateSum(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input :  5    Output : Sum of first 5 natural numbers is  : 15
//  Input :  10   Output : Sum of first 10 natural numbers is : 55
//  Input :  1    Output : Sum of first 1 natural numbers is  : 1
//  Input :  0    Output : Sum of first 0 natural numbers is  : 0
//  Input :  12   Output : Sum of first 0 natural numbers is  : 78
//
///////////////////////////////////////////////////////////////