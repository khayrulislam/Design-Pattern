package ObserverExample;

public class Main {

	public static void main(String[] args) {
		
		Subject a = new CompanyA();
		
		ObserverClass ua = new UserA();
		ObserverClass ub = new UserB();
		
		a.register(ua);
		a.register(ub);
		
		//a.unRegister(ua);
		
		((CompanyA)a).salePriceIncrease("price fall 10 taka");
		
	}
	
}
