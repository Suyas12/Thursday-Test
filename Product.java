class Wrong_exception extends Exception {
	public Wrong_exception (String s)
	{
		super(s);
	}
}
class ProductCheck
{
	int weight;
	
	public ProductCheck(int weight)
	{
		this.weight=weight;
	}

	void display() {
		System.out.println("The product is valid");
	}
}
public class Product {

	public static void main(String[] args) {
		try {
		int ProductWeight = 37;
        //In this if the product weight is greater than 100 then it will print the ProductWeight
		if(ProductWeight >100)  
		{
			System.out.println("The product weight is "+ProductWeight);
		}
		}
        //In this if the product weight is less then 100  it will show an exception 
		catch(Exception e)		
		{
			System.out.println(e);
		}
		System.out.println("The product weight is invalid");	
	}
}


