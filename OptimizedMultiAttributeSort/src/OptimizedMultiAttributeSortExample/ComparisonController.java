package OptimizedMultiAttributeSortExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ComparisonController {

	ArrayList<Student> list = new ArrayList<Student>();
	ArrayList<String> parmList = new ArrayList<String>();
	ArrayList<IComparison> parmComList = new ArrayList<IComparison>();
	int order;
	public void takeOption() throws FileNotFoundException {
		Scanner sc = new Scanner(System.in);
		Scanner ssc = new Scanner(System.in);
		System.out.println("enter the column number : ");
		int x = sc.nextInt();
		System.out.println("enter the column name : ");
		FactoryClass fc = new FactoryClass();
		for(int i=0;i<x;i++) {
			String s = ssc.nextLine();
			parmList.add(s);
			parmComList.add(fc.comparisonMaping.get(s));
		}
		System.out.println("enter 1 for ascending sort 2 for descending sort");
		order = sc.nextInt();
		compareBasedOnInput();
		sc.close();
		ssc.close();
	}
	private void getStudentList() throws FileNotFoundException {
		File f = new File("student.txt");
		Scanner sc = new Scanner(f);
		String str ;
		String [] input = new String[6];
		while(sc.hasNext()) {
			str = sc.next();
			input = str.split(",");
			list.add(new Student(input[0], input[1], Integer.parseInt(input[2]) , input[3], input[4], Double.parseDouble(input[5]) ));			
		}
		sc.close();
	}
	
	public void compareBasedOnInput() throws FileNotFoundException {
		getStudentList();
		IComparison ic = parmComList.get(0);
		for(int i=0;i<list.size();i++)
			for(int j=0;j<list.size()-1;j++) {
				int x = ic.compare(list.get(j), list.get(j+1),parmList,parmComList,0);
				if(x==1 && order==1) Collections.swap(list, j, j+1);
				if(x==-1 && order==2) Collections.swap(list, j, j+1);
			}
		printStudentInformation();
	}
	private void printStudentInformation() {
		for(Student s:list) {
			System.out.println(s.getName() +"\t"+s.getRoll()+"\t"+s.getAge()+"\t"+s.getEmail()+"\t"+s.getDistrict()+"\t"+s.getBalance());
		}
	}
}
