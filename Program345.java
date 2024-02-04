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
        str = str.replaceAll("\\s+"," "); // replace two white spaces with single white space
        String words[] = str.split(" ");

        for(String s : words)  //foreach
        {
            System.out.println(s);
        }
    }

}