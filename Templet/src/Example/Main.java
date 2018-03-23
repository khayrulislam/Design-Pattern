package Example;

public class Main {

	public static void main(String[] args) {
		
		Trip lp = new LuxaryPackage();
		lp.execute();
		
		Trip ep = new EconomyPackage();
		ep.execute();
		
		Trip rp = new RelaxPackage();
		rp.execute();
		
	}
	
}
