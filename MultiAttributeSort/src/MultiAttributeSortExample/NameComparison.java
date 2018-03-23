package MultiAttributeSortExample;

public class NameComparison implements IComparison {

	IComparison next ;
	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		int x = s1.getName().compareTo(s2.getName());
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
