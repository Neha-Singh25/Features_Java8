package in.java8;

@FunctionalInterface
interface MyInterfaceTwo{
	public void m2();
}


public class MyAppTwo {
	public static void main(String[] args) {
		MyInterfaceTwo myintwo = () -> System.out.println("m2 method is called..");
		myintwo.m2();
	}

}
