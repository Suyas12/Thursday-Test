// To write a program for Password generator
import java.util.*;
import java.util.Scanner;
import java.util.regex.*;

public class PasswordGenerator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Password Generator: ");
		String password = input.next();
		String regex = "^(?=.*[@*#])(?=.*[a-z])(?=.*[A-Z])[A-Za-z0-9@*#]{8,}$";
		Pattern pa = Pattern.compile(regex);
		Matcher ma = pa.matcher(password);
		boolean match = ma.find();
		
		if(match) {
			System.out.println("Valid code");
		}
		else {
			System.out.println("Invalid Code");
		}
	}
}
