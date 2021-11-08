
public class Cookie extends DessertItem {
	
	int euro;
	public Cookie(int tax, int euro) {
		super(tax);
		this.euro=euro;
	}

	@Override
	public void getCost() {
		// TODO Auto-generated method stub
		price=tax+euro;
		System.out.println("Price of Cookie is: "+price+" euros");
		
	}

}
