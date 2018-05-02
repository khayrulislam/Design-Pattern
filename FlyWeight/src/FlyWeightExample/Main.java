package FlyWeightExample;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("Enter String : ");
		s = sc.nextLine();
		Random r = new Random();
		
		FlyWeightFactory flf = new FlyWeightFactory();
		ArrayList<Letter> letterList = new ArrayList<>();
		
		for(int i=0;i<s.length();i++) {
			Letter letter = flf.getLetter(String.valueOf(s.charAt(i)));
			letter.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
			letter.setSize(r.nextInt(50)+25);
			letterList.add(letter);
		}
		
		WindowView wv = new WindowView(letterList);
	}
	
	
}
