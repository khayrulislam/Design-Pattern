package SingleAttributeSortExample;

public class EmailComparison implements IComparison{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		int x = s1.getEmail().compareTo(s2.getEmail());
		if(x>0) return 1;
		if(x<0) return -1;
		return 0;
	}

}
