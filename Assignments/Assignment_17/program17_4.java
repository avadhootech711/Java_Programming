///////////////////////////////////////////////////////////////
//
//  Import Required Packages
//
///////////////////////////////////////////////////////////////

import java.util.*;

///////////////////////////////////////////////////////////////
//
//  Class Name   : Logic
//  Method Name  : FindMin
//  Description  : This method finds and prints the minimum of 
//                 three given integers.
//  Input        : Integer, Integer, Integer
//  Output       : Void
//  Author       : Avadhoot Subhash Pawar
//  Date         : 30/10/2025
//
///////////////////////////////////////////////////////////////

class Logic
{
    public void FindMin(int iNo1, int iNo2, int iNo3)
    {
        int iMin = iNo1;

        if(iNo2 < iMin)
        {
            iMin = iNo2;
        }

        if(iNo3 < iMin)
        {
            iMin = iNo3;
        }

        System.out.println("Minimum number is: " + iMin);
    }
}
//  TIME COMPLEXITY : O(1)

///////////////////////////////////////////////////////////////
//
//  Entry point class of application
//
///////////////////////////////////////////////////////////////

class program17_4
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0, iValue3 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Value1 : ");
        iValue1 = sobj.nextInt();

        System.out.println("Enter Value2 : ");
        iValue2 = sobj.nextInt();

        System.out.println("Enter Value3 : ");
        iValue3 = sobj.nextInt();

        Logic lobj = new Logic();
        lobj.FindMin(iValue1, iValue2, iValue3);

        sobj = null;
        lobj = null;

        System.gc();
    }
}

///////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//  Input  : 5, 7, 9        Output : Minimum of three numbers is: 5
//  Input  : -3, 0, 10      Output : Minimum of three numbers is: -3
//  Input  : 15, 15, 15     Output : Minimum of three numbers is: 15
//  Input  : -5, -15, -1    Output : Minimum of three numbers is: -15
//  Input  : 0, 0, 1        Output : Minimum of three numbers is: 0
//
///////////////////////////////////////////////////////////////