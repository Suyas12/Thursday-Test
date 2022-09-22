import java.util.stream.Stream;
class FruitBasket{
  String fruitName;
	int weightInKgs;
	int PricePerKgs;
	public string getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getWeightInKgs() {
		return weightInKgs;
	}
	public void setWeightInKgs(int weightInKgs) {
		this.weightInKgs = weightInKgs;
	}
	public int getPricePerKgs() {
		return PricePerKgs;
	}
	public void setPricePerKgs(int pricePerKgs) {
		pricePerKgs = pricePerKgs;
	}
}
class FruitBasketUtility
{
	String fruitName;
	int weightInKgs;
	int PricePerKgs;
	private FruitBasket tbObj;
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public int getWeightInKgs() {
		return weightInKgs;
	}
	public void setWeightInKgs(int weightInKgs) {
		this.weightInKgs = weightInKgs;
	}
	public int getPricePerKgs() {
		return PricePerKgs;
	}
	public void setPricePerKgs(int pricePerKgs) {
		pricePerKgs = pricePerKgs;
	}
	public void addToBasket(FruitBasket tbObj)
	{
		this.tbObj=tbObj;	
    }
	public int calculateBill(Stream<FruitBasket> fruitBasketStream)
	{
		return PricePerKgs;
	}
}
public class GroceryCustomer {
	public static void main(String[] args) {
		FruitBasket fru=new FruitBasket();
		fru.setFruitName("Apple");
		System.out.println("The name of the fruit is :"+fru.getFruitName());
		
		fru.setPricePerKgs(150);
		System.out.println("The price of the fruit per kg is:"+fru.getPricePerKgs());
		
		fru.setWeightInKgs(3);
		System.out.println("The weight of the fruit in kg is :"+fru.getWeightInKgs());
		
		
		FruitBasketUtility fbu=new FruitBasketUtility();
		uti.setFruitName("Watermelon");
		System.out.println("The name of the fruit is:"+uti.getFruitName());
		
		uti.setPricePerKgs(15);
		System.out.println("The Price of the fruit per kg is:"+uti.getPricePerKgs());
		
		uti.setWeightInKgs(3);
		System.out.println("The weight of fruit in kg is:"+uti.getWeightInKgs());
	}
}

