
public class Question3 {
	public static void main(String[] args) {
		SavingAccount s1=new SavingAccount(5000,3000);
		s1.balance();
		
		System.out.println("=========================================================");
		
		CurrentAccount c1=new CurrentAccount(5000,5000);
		c1.balance();
	}

}

class Bank{
	int totalCash;
	
	public Bank(int totalCash)
	{
		this.totalCash=totalCash;
	}
	
	public void balance() {
		totalCash+=totalCash;
	}
	
}

class SavingAccount extends Bank{
	int fixedDeposits;
	public SavingAccount(int totalCash, int fixedDeposits) {
		super(totalCash);
		this.fixedDeposits=fixedDeposits;
	}
	
	@Override
	public void balance() {
		totalCash=totalCash+fixedDeposits;
		System.out.println("Total Cash at Bank wrt Savings account holder: "+totalCash);
	}

	
	
}

class CurrentAccount extends Bank{
	int cashCredits;
	public CurrentAccount(int totalCash, int cashCredits) {
		super(totalCash);
		this.cashCredits=cashCredits;
	}
	
	@Override
	public void balance() {
		totalCash=totalCash+cashCredits;
		
		System.out.println("Total Cash at Bank wrt Current account holder: "+totalCash);
	}
	
	
}
