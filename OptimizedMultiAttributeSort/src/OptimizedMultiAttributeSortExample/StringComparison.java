package OptimizedMultiAttributeSortExample;

import java.util.ArrayList;

public class StringComparison implements IComparison{

	@Override
	public int compare(Student s1, Student s2, ArrayList<String> sortingOrder,ArrayList<IComparison> sortingOrderObj,int orderNumber) {
		// TODO Auto-generated method stub
		String option = sortingOrder.get(orderNumber);
		int x = s1.getStringAttribute.get(option).compareTo(s2.getStringAttribute.get(option));	
		if(x>0) return 1;
		else if(x<0) return -1;
		else if(orderNumber+1!= sortingOrder.size() && x==0) 
			return sortingOrderObj.get(orderNumber+1).compare(s1, s2, sortingOrder,sortingOrderObj,orderNumber+1);

		return 0;
	}

}
