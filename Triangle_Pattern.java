import java.util.Scanner;
class Triangle_Pattern{

   public static void main(String[] args)

{
   int i,j,n;
   System.out.print("Input number of rows : ");
   Scanner angle = new Scanner(System.in);
   n = angle.nextInt();

   for(i=1;i<=n;i++)
   {
	for(j=1;j<=i;j++)
	  System.out.print(j);

    System.out.println("");
    }
}
}
