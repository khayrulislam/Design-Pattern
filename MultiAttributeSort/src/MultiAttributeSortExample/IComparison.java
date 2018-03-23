package MultiAttributeSortExample;

public interface IComparison {
	public void nextCompare(IComparison ic);
	public int compare(Student s1, Student s2);
}
