
public class Question2{
	public static void main(String[] args) {
		Manager m1=new Manager();
		
		m1.incentive=5000;
		m1.salary=25000;
		m1.totalSalary();
		
		Labour l1=new Labour();
		l1.salary=15000;
		l1.overTime=3000;
		l1.totalSalary();
	}

}

class Employee{
	int totalSal;
	int salary;
	
	public void totalSalary() {
		totalSal=+salary;
	}	
}

class Manager extends Employee{
	
	int incentive;
	@Override
	public void totalSalary() {
		totalSal=salary+incentive;
		System.out.println("Total Salary for Manager: "+totalSal);
	}
	
}

class Labour extends Employee{
	int overTime;
	@Override
	public void totalSalary() {
		totalSal=salary+overTime;
		System.out.println("Total Salary for Labour: "+totalSal);
	}
	
}
