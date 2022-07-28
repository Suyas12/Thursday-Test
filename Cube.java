import java.util.Scanner;
class Cube{

   public static void main(String[] args)

{
    int i,n;
    System.out.print("Input number of terms : ");
    Scanner multi = new Scanner(System.in);
	 n = multi.nextInt();

     for(i=1;i<=n;i++)
     {
     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
    }
 }
}






