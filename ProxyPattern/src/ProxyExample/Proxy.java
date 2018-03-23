package ProxyExample;

public class Proxy {
	
	ClassA ca;
	
	public Proxy(ClassA ca) {
		// TODO Auto-generated constructor stub
		this.ca = ca;
	}
	
	public void function1() {
		System.out.println("function 1 is calling");
		ca.function1();
	}

}
