// no of lowercase letters
import java.util.*;

class Program523
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String str = sobj.nextLine();
        str = str.replaceAll("\\s+","");

        str = str.toLowerCase();

        char Arr[] = str.toCharArray();

        int Frequency[] = new int[26];
        int iCnt = 0;

        for(iCnt = 0; iCnt <Arr.length; iCnt++)
        {
            Frequency[((int)Arr[iCnt]) - 'a']++;
        }
        
    }
}