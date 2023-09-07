package employee;

import java.util.Comparator;

class SortEmployeeAge implements Comparator<Employee>{

	@Override
	public int compare(Employee e1, Employee e2) {
		if(e1.getEage()<e2.getEage())
			return 1;
		else if(e1.getEage()>e2.getEage())
		return -1;
		return 0;
	}
	
}