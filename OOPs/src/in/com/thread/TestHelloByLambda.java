package in.com.thread;

public class TestHelloByLambda {
public static void main(String[] args) {
	Hello1 h = (a,b) -> {
		int c = a+b;
		System.out.println("sum =" + c);
	};
	h.sum(10,20);
}
}
