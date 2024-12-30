package in.java8;

interface MyInterfaceOne{
	public void m1();
}

public class MyAppOne implements MyInterfaceOne {
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method called");
	}
	public static void main(String[] args) {
		MyAppOne myapp = new MyAppOne();
		myapp.m1();
	}

}
