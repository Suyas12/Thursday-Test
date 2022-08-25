class Circle {
	private static int count;  
	float center;
    float radius;

	Circle(float c,float r) {
		this.center=c;
		this.radius=r;
        count++;
	}
	Circle(){
		System.out.println("It has default constructor");
        count++;  
	}
    void display(){
	    System.out.println("The center is: "+center+" and the radius is: "+radius);
}
public class circle{    
}
	public static void main(String[] args) {
		Circle c1=new Circle(7.3f,3.7f);
		Circle c2=new Circle(8.4f,4.8f);
        Circle c3=new Circle();
		c1.display();
		c2.display();
		System.out.print("Number of instance are : "+ Circle.count); 
		
	}
}
