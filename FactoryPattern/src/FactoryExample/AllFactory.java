package FactoryExample;

import java.util.HashMap;

public class AllFactory {

	public AbstructFactory getAFactory(String choise) {
		
		HashMap<String, AbstructFactory> all = new HashMap<>();
		
		all.put("w", new WoodenFactory());
		all.put("g", new GlassFactory());
		all.put("s", new StealFactory());
		
		return all.get(choise);
	}
	
}
