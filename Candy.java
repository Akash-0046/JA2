
public class Candy extends DessertItem{
	int doller;
	public Candy(int tax, int doller) {
		super(tax);
		this.doller=doller;
	}

	@Override
	public void getCost() {
		// TODO Auto-generated method stub
		price=tax+doller;
		System.out.println("Price of Candy is: "+price+"$");
	}

}
