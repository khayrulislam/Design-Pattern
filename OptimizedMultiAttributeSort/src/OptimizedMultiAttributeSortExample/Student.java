package OptimizedMultiAttributeSortExample;

import java.util.HashMap;

public class Student {
	private String name,email,roll,district;
	private int age;
	private double balance;
	HashMap<String, String> getStringAttribute = new HashMap<String,String>();
	HashMap<String, Integer> getIntegerAttribute = new HashMap<String,Integer>();
	HashMap<String, Double> getDoubleAttribute = new HashMap<String,Double>();
	
	public Student(String name,String roll,int age,String email, String district, double balance) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.roll = roll;
		this.district = district;
		this.balance = balance;
		
		getStringAttribute.put("name", name);
		getStringAttribute.put("email", email);
		getStringAttribute.put("district", district);
		getStringAttribute.put("roll", roll);
		
		getIntegerAttribute.put("age", age);
		
		getDoubleAttribute.put("balance", balance);		
	}
		
	public String getDistrict() {
		return district;
	}

	public double getBalance() {
		return balance;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getRoll() {
		return roll;
	}

	public int getAge() {
		return age;
	}


}
