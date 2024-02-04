import java.util.*;

class Program273
{
    public static boolean CheckBit(int iNo)
    {
        int iMask =0X00004040;
        int iResult = 0;
        iResult = iNo & iMask;

        if(iResult == iMask)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iNo = 0;
        boolean bRet = false;

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        bRet = CheckBit(iNo);

        if(bRet == true)
        {
            System.out.println("7th and 15th bits is ON");
        }
        else
        {
            System.out.println("7th and 15th bits is OFF");
        }
        
    }
}

/*
 0000   0000    0000    0000    0100    0000    0100    0000
  0        0      0        0      4       0       4       0

  0X00004040
*/