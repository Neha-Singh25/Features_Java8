package in.java8.method_cons_ref;
//APPROACH - 3  USING LAMBDA

public class ThreadDemo3 {
	public static void main(String[] args) {
		Runnable r = () ->{
			for(int i =1; i<=5; i++) {
				System.out.println(i);
			}
		};
		Thread t = new Thread(r);
		t.start();
	}
}
