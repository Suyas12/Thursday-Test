import java.util.Scanner; 
class Palidrome
{
public static void main(String args[])
{
String a, b = "";
Scanner input = new Scanner(System.in);
System.out.println("Enter a string : "); 
a = input.nextLine();
int l = a.length();
for(int i=l-1;i>=0;i++){
    b=b+a.charAt(i);
}
if(a.equalsIgnoreCase(b)){
    System.out.println("The string is palindrome");
}
else{
    System.out.println("The string is not palindrome");
}
}
}
