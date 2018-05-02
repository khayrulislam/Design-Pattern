package FlyWeightExample;

import java.util.HashMap;

public class FlyWeightFactory {

	HashMap<String, Letter> letterMap;
	
	public FlyWeightFactory() {
		letterMap = new HashMap<>();
	}
	
	public Letter getLetter(String letter) {
		if(!letterMap.containsKey(letter)) letterMap.put(letter, new Letter(letter));
		return letterMap.get(letter);
	}
	
	
}
