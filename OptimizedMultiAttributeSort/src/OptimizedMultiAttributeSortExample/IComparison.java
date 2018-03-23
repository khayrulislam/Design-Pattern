package OptimizedMultiAttributeSortExample;

import java.util.ArrayList;

public interface IComparison {
	public int compare(Student s1, Student s2, ArrayList<String> sortingOrderList,ArrayList<IComparison> sortingOrderObj, int orderNumber);
}
