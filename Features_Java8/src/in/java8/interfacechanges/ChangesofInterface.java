package in.java8.interfacechanges;

interface Vehicle{
	public void start();
	public default void m1() {
		System.out.println("this is default m1..");
	}
	public default void m2() {
		System.out.println("hi! i am default m2 method...");
	}
	public static void wash() {
		System.out.println("cleaning of the car...");
	}
}

class Car implements Vehicle{
	public void start() {
		System.out.println("i am the abstract start method....");
	}
    // DEFAULT METHOD OVERRIDE HERE...
	public void m1() {
		System.out.println("i am default m1 method..");
	}
}


public class ChangesofInterface {
	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		car.m1();
		car.m2();
		Vehicle.wash();
	}

}
