package statickeyword;

class Employee {
	int id;		// instance variable : number of object equal to number of copy 
	static int mgrId;	// static : only one copy 0 , 300, 400, 500
	void dis() {
		System.out.println("id is "+id);
		System.out.println("Mgrid is "+mgrId);
	}
}
public class StaticEmployeeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee emp1 = new Employee();  // heap memory created id =0;, 100
	Employee emp2 = new Employee(); // heap memory created id=0;, 200 
	emp1.id=100;
	emp2.id=200;
	emp1.mgrId=300;
	emp2.mgrId=400;
	Employee.mgrId=500;
	emp1.dis();   //id = 100, mgrId= 500
	emp2.dis(); // id = 200, mgrId = 500
	}

}
