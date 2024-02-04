//Problems on Strings in Java

import java.util.*;
import java.io.*; // for file handling

class Program328
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String str = "     Hello     ";

        System.out.println("Length of str is : "+str.length());

        str = str.trim();

        System.out.println("Length of str is : "+str.length());
    }   

}