package employee;

import java.util.Comparator;

public class SortEmployeeName implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getEname().compareTo(e2.getEname()) ;
	}
	

}
