///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name    : Logic
//  Method Name   : ProductOfDigits
//  Description   : This method calculates and prints the product 
//                  of all digits present in the given number.
//  Input         : Integer
//  Output        : Void
//  Author        : Avadhoot Subhash Pawar
//  Date          : 31/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void ProductOfDigits(int iNum)
    {
        int iDigit = 0, iProduct = 1;

        if(iNum < 0)
        {
            iNum = -iNum;
        }

        while(iNum != 0)
        {
            iDigit = iNum % 10;
            iProduct = iProduct * iDigit;
            iNum = iNum / 10;
        }

        System.out.println("Product of Digits : " + iProduct);
    }
}


//  TIME COMPLEXITY : O(N) where N is number of digits

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program21_1
{
    public static void main(String A[]) 
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.ProductOfDigits(iValue);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input  : 752        Output : Product of Digits : 70
//  Input  : 103        Output : Product of Digits : 0
//  Input  : 9          Output : Product of Digits : 9
//  Input  : -432       Output : Product of Digits : 24
//  Input  : 1002       Output : Product of Digits : 0
//
///////////////////////////////////////////////////////////////