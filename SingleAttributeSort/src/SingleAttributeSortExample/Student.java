package SingleAttributeSortExample;

public class Student {
	private String name,email,roll;
	private int age;
	
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
	public Student(String name, String email, int age, String roll) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.roll = roll;
	}
}
