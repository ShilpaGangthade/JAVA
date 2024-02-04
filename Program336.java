//Problems on Strings in Java -replace all function

import java.util.*;
import java.io.*; // for file handling

class Program336
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String str = "Hello World";

       str=str.replaceAll("l","_");// kashala kashane replace

       System.out.println(str);
    }

}