package strategyPatternExample;

public class XmlConverter implements IConverter{

	
	int count=0;
	private String getHeaderPart() {
		String str = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "\n"+"<STUDENTINFO>"+"\n";
		return str;
	}
	@Override	
	public String getStringFromStudent(Student s, int length) {
		// TODO Auto-generated method stub
		String str;
		str = "<STUDENT>"+"\n" + "<NAME>"+s.name+"</NAME>" +"\n"+"<EMAIL>"+s.email+"</EMAIL>"+"\n"+"</STUDENT>\n";
		if(count==0)
			str = getHeaderPart() + str;
		else if(length==count)
			str += "</STUDENTINFO>"+"\n";
		count++;
		return str;
	}

}
