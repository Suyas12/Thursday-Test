class SavingAccount{
	public static double annualInterestRate;
	private double savingsBalance;
	public double monthlyInterest;

	public void calculateMonthlyInterest(){
		monthlyInterest = this.savingsBalance*this.annualInterestRate/12.0;
		savingsBalance += monthlyInterest;
	}

	public SavingAccount(double savingsBalance){
		this.savingsBalance = savingsBalance;
	}

	public void getsavingsBalance(){
		System.out.println("The updated account balance is "+ this.savingsBalance);		
	}
}
public class Interest_account{
	public static void main(String args[]){

		SavingAccount sip1 = new SavingAccount(2000.00);
		SavingAccount sip2 = new SavingAccount(3000.00);
		SavingAccount.annualInterestRate = 4;
		sip1.calculateMonthlyInterest();
		sip2.calculateMonthlyInterest();
		System.out.println("For saver1 the monthly interest is "+sip1.monthlyInterest);
		sip1.getsavingsBalance();
		System.out.println("For saver2 the monthly interest is "+sip2.monthlyInterest);
		sip2.getsavingsBalance();

		SavingAccount.annualInterestRate = 5;
		sip1.calculateMonthlyInterest();
		sip2.calculateMonthlyInterest();
		System.out.println("For saver1 the upgraded monthly interest is "+sip1.monthlyInterest);
		sip1.getsavingsBalance();
		System.out.println("For saver2 the upgraded monthly interest is "+sip2.monthlyInterest);
		sip2.getsavingsBalance();


	}
}

