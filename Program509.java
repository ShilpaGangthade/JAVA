// Count words in a string.
import java.util.*;

class Program509
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();

        str = str.trim();

        str = str.replaceAll(" ",""); // Remove white spaces

        System.out.println("Updated string is : "+str);

    }
}