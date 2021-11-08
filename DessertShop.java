import java.util.Scanner;

public class DessertShop {
	public static void owner() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome, What you want to add");
		String add=scan.nextLine();
		
		if(add.equalsIgnoreCase("Candy")) {
			System.out.println("Candy added to Dessert item");
		}
		else if(add.equalsIgnoreCase("Cookie")) {
			System.out.println("Cookie added to Dessert item");
		}
		else if(add.equalsIgnoreCase("IceCream")) {
			System.out.println("Ice Cream added to Dessert item");
		}
		
	}
	public static void customer() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome, What you want to place?");
		String order=scan.nextLine();
		if(order.equalsIgnoreCase("candy")) {
			Candy c1=new Candy(10,10);
			c1.getCost();
			System.out.println("Candy Placed");
		}
		else if(order.equalsIgnoreCase("Cookie")) {
			Cookie c2=new Cookie(20,20);
			c2.getCost();
			System.out.println("Cookie placed");	
		}
		else if(order.equalsIgnoreCase("Icecream")) {
			IceCream i1=new IceCream(50,10);
			i1.getCost();
			System.out.println("Icecream placed");
		}
		
		
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Role: ");
		String role=scan.nextLine();
		
		if(role.equals("owner")) {
			owner();
		}
		else if(role.equals("customer")) {
			customer();
		}
		
	}

}
