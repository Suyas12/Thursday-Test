import java.util.Random;
class RandomNumberThread extends Thread {
	public void run() {
        // Creating a random class object 
		Random random = new Random();   
			int randomInteger = random.nextInt(70);     
			System.out.println("The random generated integer is : " +randomInteger);
			if((randomInteger%2) == 0) {   
				Square squThread = new Square(randomInteger);
				squThread.start();  
			}
			else {
				Cube cubeThread = new Cube(randomInteger);  
				cubeThread.start(); 
			}
            //For Exception Handling
			try {
                // Sleeps for 1 second
				Thread.sleep(1000);  
			} 
			catch (Exception e) {
				System.out.println(e);
			}
		}
	}

//Creating a Square class that extends Thread class 
class Square extends Thread { 
	int num;

	Square(int number) {   
		this.num=num;
	}

	public void run() {  
		System.out.println("The Square of " + num +"="+ (num * num));
	}
}

//Creating a cube class that extends Thread class 
class Cube extends Thread {   
	int num;

	Cube(int number) {   
		this.num=number;
	}

	public void run() { 
		System.out.println("The Cube of " + num +"="+ (num * num * num));
	}
}

public class Random_Thread {

    //Main method
	public static void main(String[] args) {
		RandomNumberThread oThread = new RandomNumberThread();  
		oThread.start();   

	}

}
