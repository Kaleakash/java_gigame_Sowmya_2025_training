package abstractkeyword;



abstract class Bike {
	int wheel;
	public abstract void speed();
	public Bike() {
		this.wheel=4;
	}
}
abstract class Honda extends Bike {
	public void mailage() {
		System.out.println("Honda Mailage : 70km/lt");
	}
}
class Activa extends Honda {
	@Override
	public void speed() {
		System.out.println("Activa Speed  Override : 90km/hr");
	}
}
class Pulsar extends Bike {
	public void mailage() {
		System.out.println("Pulsar Mailage : 50km/lt");
	}
	@Override
	public void speed() {
		System.out.println("Pulsar Speed  Override : 90km/hr");
	}
}
public class AbstractExample {

	public static void main(String[] args) {
	

	}

}
