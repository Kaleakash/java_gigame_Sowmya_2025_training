package inheritance;

public class InheritanceDemoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.disEmployee();
		
		System.out.println("------------");
		Manager mgr = new Manager();
		mgr.displayManagerDetails();
		mgr.disEmployee();
	}

}
