package employee;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class EmployeeMain {

	public static void main(String[] args) {
		ArrayList<Employee> elist=new ArrayList<Employee>();
		Employee e1= new Employee(1,"THIVA",25,20000);
		Employee e2=new Employee(4,"GEETHA",30,25000);
		Employee e3=new Employee(5,"MEENA",27,15000);
		Employee e4=new Employee(3,"ILANGO",35,90000);
		Employee e5=new Employee(6,"RAMYA",20,65000);
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		elist.add(e4);
		elist.add(e5);
		System.out.println(elist);
		Iterator<Employee> eit= elist.iterator();
		System.out.println("EID\tNAME\tAGE\tSALARY");
        while(eit.hasNext()) {
        	//System.out.println(sit.next());
        	Employee sob = eit.next();
        	System.out.println(sob.getEid()+"\t"+sob.getEname()+"\t"+sob.getEage()+"\t"+sob.getEsalary());
        }
        	//sort based on age
        
        SortEmployeeAge ef =new SortEmployeeAge();
        Collections.sort(elist,ef);
        //Collections.sort(list,new SortStudentFees()); //another way 
        System.out.println("AFTER SWAPPING USING AGE");
        Iterator<Employee> sit1= elist.iterator();
		System.out.println("SID\tFees\tName");
        while(sit1.hasNext()) {
        	Employee sob = sit1.next();
        	System.out.println(sob.getEid()+"\t"+sob.getEname()+"\t"+sob.getEage()+"\t"+sob.getEsalary());
        }
        
        //sort based on name
        
        SortEmployeeName ef2 =new SortEmployeeName();
        Collections.sort(elist,ef2);
        //Collections.sort(list,new SortStudentFees()); //another way 
        System.out.println("AFTER SWAPPING USING NAME");
        Iterator<Employee> sit2= elist.iterator();
		System.out.println("SID\tFees\tName");
        while(sit2.hasNext()) {
        	Employee sob = sit2.next();
        	System.out.println(sob.getEid()+"\t"+sob.getEname()+"\t"+sob.getEage()+"\t"+sob.getEsalary());
        }
        

	}

}
