package SingleAttributeSortExample;

public class RollComparison implements IComparison {

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		int x = s1.getRoll().compareTo(s2.getRoll());
		if(x>0) return 1;
		if(x<0) return -1;
		return 0;
	}

}
