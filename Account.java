
public class Account {
	//in order to inherit a singleton class we must use super() constructor in sub-class
	
	private static Account obj;
	
	private Account() {
		System.out.println("Account activated");
	}
	
	public static Account helper()
	{
		if(obj==null) 
			obj=new Account();	
		return obj;	
		
	}

}
