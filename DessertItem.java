
public abstract class DessertItem {
	public int tax;
	public int price;
	
	public DessertItem(int tax) {
		this.tax=tax;
	}
	 public abstract void getCost();
}
