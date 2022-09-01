abstract class Shape{
    String color;
    boolean filled;
    Shape(){
        color="green";
        filled=true;
    }
    Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }
    public void setcolor(String color){
        this.color=color;
    }
    public String iscolor(){
        return color;
    }
    public void setfilled(boolean filled){
        this.filled=filled;
    }
    public boolean isfilled(){
        return filled;
    }
    abstract public double getarea();
    public String toString(){
        if(this.filled==true){
        return ("A Shape with color of"+this.color+"is"+this.filled);
        }
        else{
        return ("A Shape with color of"+this.color+"is"+this.notfilled);   
        }
    }
    class Circle extends Shape{
        public double getarea(){
            return 1;
        }  
    }
    final class Rectangle extends Shape{
        double width;
        double length;
        public double getarea(){
            return 1;
        } 
    }
}
//The Rectangle cannot be inherited because it is final 
public class Square extends Rectangle
{
    Square(){
        super(3,7);
        System.out.println("length :"+super.length);
        System.out.println("width :"+super.width);
    }
    public static void name(String[]args) 
    {
    //Shape s1=new Shape();
    //It cannot be because it is an abstract class
    Square sq=new Square();
    if (sq.length==square.width){
        System.out.println("The rectangle is square");
    }

    }    
}
