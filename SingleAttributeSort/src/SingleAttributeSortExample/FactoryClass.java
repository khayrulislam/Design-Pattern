package SingleAttributeSortExample;

import java.util.HashMap;

public class FactoryClass {

	public HashMap<String, IComparison> compList = new HashMap<String,IComparison>();
	
	public FactoryClass() {
		// TODO Auto-generated constructor stub
		IComparison name = new NameComparison();
		IComparison email = new EmailComparison();
		IComparison roll = new RollComparison();
		IComparison age = new AgeComparison();
		
		compList.put("name", name);
		compList.put("email", email);
		compList.put("roll", roll);
		compList.put("age", age);
	}
}
