package inheritance;

public class Manager extends Employee{

	Address add = new Address();
	
	public void displayManagerDetails() {
		System.out.println("Display Manager details");
		add.addressDetails();
	}
}
