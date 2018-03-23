package strategyPatternExample;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Controller {

	private ArrayList<Student> slist = new ArrayList<Student>();
	private void getAltheStudentInformation() {
		Student s1 = new Student("thamid", "bsse0801@iit.du.ac.bd");
		Student s2 = new Student("jamil", "bsse0802@iit.du.ac.bd");
		Student s3 = new Student("thalil", "bsse0803@iit.du.ac.bd");
		Student s4 = new Student("ibrahim", "bsse0804@iit.du.ac.bd");
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
	}
	
	public void saveStudentInformationInAFile(IConverter c, String type) throws IOException {
		getAltheStudentInformation();
		FileWriter fw = new FileWriter("student."+type);
		BufferedWriter bw = new BufferedWriter(fw);
		for(Student s:slist) {
			fw.write(c.getStringFromStudent(s, slist.size()));
		}
		fw.close();
		bw.close();
	}
}
