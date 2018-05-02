package FlyWeightExample;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WindowView {
	ArrayList<Letter> letterList;
	JFrame frame;
	
	public WindowView(ArrayList<Letter> letterList) {
		this.letterList = letterList;
		frame = new JFrame("FlyWeightPattern");
		frame.setSize(800, 800);
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		showString();
	}

	private void showString() {
		
		for(int i=0;i<letterList.size();i++) {
			JLabel jl = new JLabel(letterList.get(i).getName());
			
			jl.setFont(new Font("verdana", Font.PLAIN, letterList.get(i).getSize()));
			jl.setForeground(letterList.get(i).getColor());
			frame.add(jl);
		}
		
	}
	
}
