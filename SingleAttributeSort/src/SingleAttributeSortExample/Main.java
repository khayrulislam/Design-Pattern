package SingleAttributeSortExample;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("enter the column name : ");
		Scanner sc = new Scanner(System.in);
		String option = sc.nextLine();
		FactoryClass fc = new FactoryClass();
		ComparisonController cc = new ComparisonController();
		cc.compareBasedOnInput(fc.compList.get(option));
	}

}
