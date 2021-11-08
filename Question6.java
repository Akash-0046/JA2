
public class Question6 {
	public static void main(String[] args) {
		
		Persistance clint1=new DatabasePersistance();
		clint1.persist();
		
		Persistance clint2=new FilePersistance();
		clint2.persist();
		
	}

}

class FilePersistance extends Persistance{

	@Override
	public void persist() {
		// TODO Auto-generated method stub
		System.out.println("Data being saved in File Persistance");
		
	}
}

class DatabasePersistance extends Persistance{

	@Override
	public void persist() {
		// TODO Auto-generated method stub
		System.out.println("Data being saved in Database persistance");
		
	}	
}


