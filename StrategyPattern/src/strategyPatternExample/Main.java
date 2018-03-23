package strategyPatternExample;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		System.out.print("write the file formate : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		FactoryClass fc = new FactoryClass();
		Controller c = new Controller();
		c.saveStudentInformationInAFile(fc.option.get(str), str);
	}
}
