package interfaceexample;

interface Abc {
	int A=10;
	void dis1();
}
interface Mno {
	int B=20;
	void dis2();
}
interface Xyz extends Abc,Mno{
	int C=30;
	void dis3();
}
class Test implements Xyz{
	@Override
	public void dis1() {
	System.out.println("Abc interfac method");	
	}
	@Override
	public void dis2() {
		System.out.println("Mno interfac method");	
	}
	@Override
	public void dis3() {
		// TODO Auto-generated method stub
		System.out.println("Xyz interfac method");	
	}
}


public class InterfaceDemoExample {

	public static void main(String[] args) {
	Test tt = new Test();
	tt.dis1();
	tt.dis2();
	tt.dis3();
	}

}
