package strategyPatternExample;

import java.util.HashMap;

public class FactoryClass {

	HashMap<String, IConverter> option = new HashMap<String,IConverter>();
	public FactoryClass() {		
		IConverter csv = new CsvConverter();
		IConverter tsv = new Tsvconverter();
		IConverter xml = new XmlConverter();
		
		option.put("csv", csv);
		option.put("tsv", tsv);
		option.put("xml", xml);
	}
}
