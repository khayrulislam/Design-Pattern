package strategyPatternExample;

public class CsvConverter implements IConverter {

	@Override
	public String getStringFromStudent(Student s, int length) {
		// TODO Auto-generated method stub
		String str = s.name+","+s.email+"\n";
		return str;
	}

}
