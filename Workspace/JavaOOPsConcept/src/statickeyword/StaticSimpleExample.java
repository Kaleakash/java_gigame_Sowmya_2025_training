package statickeyword;
class Abc {
	int a;			// instance variable 
	static int b;	// static variable 
	
	void dis1() {
		System.out.println("non static method");
	}
	static void dis2() {
		System.out.println("static methdo");
	}
}
public class StaticSimpleExample {

	public static void main(String[] args) {
		Abc obj = new Abc();
		obj.a=100;
			Abc.b=200;		// static with class name 
		obj.dis1();
			Abc.dis2();      // method is static 
			obj.b=300;			// access static variable using object 
		obj.dis2();     // access through object also possible 
	}  

}
