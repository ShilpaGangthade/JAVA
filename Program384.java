import java.util.*;

class Program384
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);
        int iRow = 0,iCol = 0;

        System.out.println("Enter number of rows : ");
        iRow = sobj.nextInt();

        System.out.println("Enter number of columns : ");
        iCol = sobj.nextInt();

        int Arr[][]=new int[iRow][iCol];
        int i = 0,j=0;

        System.out.println("Enter the elements : ");
        for(i = 0; i<iRow;i++)
        {
            for(j = 0; j<iCol;j++)
            {
                Arr[i][j]=sobj.nextInt();
            }
        }
    }
}