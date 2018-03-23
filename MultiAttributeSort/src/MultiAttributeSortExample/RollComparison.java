package MultiAttributeSortExample;

public class RollComparison implements IComparison {

	IComparison next = new NullComparison();
	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		int x = s1.getRoll().compareTo(s2.getRoll());
		if(x>0) return 1;
		if(x<0) return -1;
		return next.compare(s1, s2);
	}

	@Override
	public void nextCompare(IComparison ic) {
		// TODO Auto-generated method stub
		this.next = ic;
	}

}
