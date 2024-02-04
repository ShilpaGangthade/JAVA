//Problems on Strings in Java -replace all function

import java.util.*;
import java.io.*; // for file handling

class Program337
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        String str = "     Hello     World  Demo     ";

       str=str.replaceAll(" ","");// replace white space with nothing so that string sgli chitkun yeil

       System.out.println(str);
    }

}