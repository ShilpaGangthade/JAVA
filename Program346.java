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

        for(int i = 0; i < words.length; i++)  
        {
            System.out.println("Word is : "+words[i]+" having length : "+words[i].length());
        }
    }

}