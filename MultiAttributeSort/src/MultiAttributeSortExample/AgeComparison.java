package MultiAttributeSortExample;

public class AgeComparison implements IComparison {

	IComparison next= new NullComparison();
	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.getAge()>s2.getAge()) return 1;
		if(s1.getAge()<s2.getAge()) return -1;
		return next.compare(s1, s2);
	}
	@Override
	public void nextCompare(IComparison ic) {
		// TODO Auto-generated method stub
		this.next = ic;
	}

}
