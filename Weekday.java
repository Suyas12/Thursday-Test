import java.util.Scanner;
class Weekday{
    public static void main(String[] args) {
        System.out.println("Enter weekday number : ");
        Scanner day = new Scanner(System.in);
        int weekday = day.nextInt();

        if(weekday == 1) {

            System.out.println("Monday");

        } 
        else if(weekday == 2) {

            System.out.println("Tuesday");

        } 
        else if(weekday == 3) {

            System.out.println("Wednesday");

        } 
        else if(weekday == 4) {

            System.out.println("Thursday");

        } 
        else if(weekday == 5) {

            System.out.println("Friday");

        } 
        else if(weekday == 6) {

            System.out.println("Saturday");

        } 
        else if(weekday == 7) {

            System.out.println("Sunday");

        } 
        else {

            System.out.println("Please enter valid number.");
        }
    }
}

