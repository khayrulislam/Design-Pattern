package OptimizedMultiAttributeSortExample;

import java.util.HashMap;

public class FactoryClass {
	
	public HashMap<String, IComparison> comparisonMaping = new HashMap<String,IComparison>();
	public FactoryClass() {
		// TODO Auto-generated constructor stub
		
		IComparison s = new StringComparison();
		IComparison i = new IntegerComparison();
		IComparison d = new DoubleComparison();
		
		comparisonMaping.put("name", s);
		comparisonMaping.put("email", s);
		comparisonMaping.put("roll", s);
		comparisonMaping.put("age", i);
		comparisonMaping.put("balance", d);
	}

}
