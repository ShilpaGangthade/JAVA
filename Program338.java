//Problems on Strings in Java

import java.util.*;
import java.io.*; // for file handling

class Program338
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sobj.nextLine();

        str = str.trim();

        System.out.println("After trim : "+str);
    }

}