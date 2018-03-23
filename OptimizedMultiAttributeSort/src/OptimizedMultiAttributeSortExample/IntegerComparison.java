package OptimizedMultiAttributeSortExample;

import java.util.ArrayList;

public class IntegerComparison implements IComparison{

	@Override
	public int compare(Student s1, Student s2, ArrayList<String> sortingOrderList,
			ArrayList<IComparison> sortingOrderObj, int orderNumber) {
		// TODO Auto-generated method stub
		String option = sortingOrderList.get(orderNumber);
		int x = s1.getIntegerAttribute.get(option);
		int y = s2.getIntegerAttribute.get(option);
		if(x>y) return 1;
		else if(x<y) return -1;
		else if(orderNumber+1!= sortingOrderList.size()) 
			return sortingOrderObj.get(orderNumber+1).compare(s1, s2, sortingOrderList,sortingOrderObj,orderNumber+1);

		return 0;
	}

	

}
