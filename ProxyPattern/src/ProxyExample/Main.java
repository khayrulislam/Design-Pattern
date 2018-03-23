package ProxyExample;

public class Main {

	public static void main(String[] args) {
		
		ClassA ca = new ClassA();
		
		Proxy p = new Proxy(ca);
		
		p .function1();
		
	}
}
