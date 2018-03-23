package MultiAttributeSortExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComparisonController {

	ArrayList<Student> list = new ArrayList<Student>();
	ArrayList<String> parmList = new ArrayList<String>();
	
	public void takeOption() {
		System.out.println("enter the column number : ");
		Scanner sc = new Scanner(System.in);
		Scanner ssc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println("enter the column name : ");
		for(int i=0;i<x;i++) {
			String s = ssc.nextLine();
			parmList.add(s);
		}
		FactoryClass fc = new FactoryClass();
		x = parmList.size();
		IComparison ic1 = fc.compList.get(parmList.get(x-1));
		IComparison ic2;
		for(int i=x-2;i>=0;i--) {
			ic2 = fc.compList.get(parmList.get(i));
			ic2.nextCompare(ic1);
			ic1 = ic2;
		}
		compareBasedOnInput(ic1);
	}
	private void getStudentList() {
		list.add(new Student("toukir", "bsse0806@iit.du.ac.bd", 24, "bsse0806"));
		list.add(new Student("mahir", "bsse0807@iit.du.ac.bd", 30, "bsse0807"));
		list.add(new Student("thamid", "bsse0801@iit.du.ac.bd", 22, "bsse0801"));
		list.add(new Student("jamil", "bsse0802@iit.du.ac.bd", 22, "bsse0802"));
		list.add(new Student("thail", "bsse0803@iit.du.a.bd", 19, "bsse0803"));
		list.add(new Student("ibrahim", "bsse0804@iit.du.ac.bd", 18, "bsse0804"));

	}
	public void compareBasedOnInput(IComparison ic) {
		getStudentList();
		for(int i=0;i<list.size();i++)
			for(int j=0;j<list.size()-1;j++) {
				int x = ic.compare(list.get(j), list.get(j+1));
				if(x==1) Collections.swap(list, j, j+1);
			}
		printStudentInformation();
	}
	private void printStudentInformation() {
		for(Student s:list) {
			System.out.println(s.getName() +"\t"+s.getEmail()+"\t"+s.getRoll()+"\t"+s.getAge());
		}
	}
}
