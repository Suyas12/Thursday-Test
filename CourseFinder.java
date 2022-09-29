// To write a program to find whether a course is available or not 
import java.util.Scanner;
public class CourseFinder {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter no of course: ");
		int totalCourse = input.nextInt();
		String[] courseName = new String[totalCourse];
		
		if(totalCourse <= 0) {
			System.out.println("Out of Range");
		}
		else{
			System.out.print("Enter course names: ");
			for(int i = 0; i < totalCourse; i++) {
				courseName[i] = input.next();
			}
			
			String s ="";
			for(String n : courseName) {
				s += n;
			}
			char[] c = s.toCharArray();
			

			System.out.print("Enter the Course to be Searched: ");
			String searchCourse = input.next();
			
			if(new String(c).contains(searchCourse)){
				System.out.println(searchCourse+" course is available");
			}
			else {
				System.out.println(searchCourse+" course is not available");
			}
		}

	}
}
