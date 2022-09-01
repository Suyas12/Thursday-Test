import java.util.Scanner;
public class Swapping
{
    void Swap(int A,int B){
        A=A+B;
        B=A-B;
        A=A-B;
        System.out.println("The value of A and B after swapping : "+A+" and "+B);
    }
    public static void main(String args[])
    {
    Swapping sw=new Swapping();
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the value of A before swapping: ");
    int A=input.nextInt();
    System.out.println("Enter the value of B before swapping: ");
    int B=input.nextInt();
    sw.Swap(A,B);
    }

}
