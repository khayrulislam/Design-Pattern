package SingleAttributeSortExample;

public class AgeComparison implements IComparison {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.getAge()>s2.getAge()) return 1;
		if(s1.getAge()<s2.getAge()) return -1;
		return 0;
	}

}
