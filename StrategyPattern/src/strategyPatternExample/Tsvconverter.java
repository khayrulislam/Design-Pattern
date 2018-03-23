package strategyPatternExample;

public class Tsvconverter implements IConverter {

	@Override
	public String getStringFromStudent(Student s, int length) {
		// TODO Auto-generated method stub
		String str = s.name+"\t"+s.email+"\n";
		return str;
	}

}
