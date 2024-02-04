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

        str = str.replaceAll("\\s+"," "); // replace two white spaces with single white space

        System.out.println("After replaceall : "+ str);

        String words[] = str.split(" ");

        System.out.println("Number of words in the sentence are : "+words.length);
    }

}