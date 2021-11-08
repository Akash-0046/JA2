
public class IceCream extends DessertItem{
	int rupees;

	public IceCream(int tax, int rupees) {
		super(tax);
		this.rupees=rupees;
	}

	@Override
	public void getCost() {
		// TODO Auto-generated method stub
		price=tax+rupees;
		System.out.println("Price of IceCream is: "+price+" Rupees");
		
	}

}
