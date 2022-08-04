import java.util.Scanner;
class Transpose_of_matrix 
{
    public static void main(String args[])
    {
    int i,j;
    System.out.println("Total number of rows and column are: ");
    Scanner input = new Scanner(System.in);
    int row = input.nextInt();
    int column = input.nextInt();
    int array[][] = new int [row][column];
    System.out.println("Enter matrix: ");
    for (i=0;i<row;i++)
    {
        for(j=0;j<column;j++)
        {
            array[i][j]=input.nextInt();
            System.out.println(" ");
        }
    }
    System.out.println("Matrix before transpose: ");
    for (i=0;i<row;i++)
    {
        for(j=0;j<column;j++)
        {
            System.out.println(array[i][j]+"");
        }
        System.out.println(" "); 
    }
    System.out.println("Matrix after transpose: ");
    for (i=0;i<column;i++)
    {
        for(j=0;j<row;j++)
        {
            System.out.println(array[j][i]+"");
        }
        System.out.println(" "); 
    }
    }    
}
