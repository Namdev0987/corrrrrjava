package in.com.thread;

public class TestHello {
public static void main(String[] args) {
	Hello h = new Hello() {
		public void sum() {
			System.out.println("sum mrthod!!!1");
		}
	};
	h.sum();
}
}
