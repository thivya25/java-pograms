package thivyashreepackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;



class Studentt{
	int sid;
	String sname;
	float sfees;
	
	public Studentt(int sid, String sname, int sfees) {
		super();
		this .sid=sid;
		this.sname=sname;
		this.sfees=sfees;
	}
	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return sname;
	}
	public void setName(String sname) {
		this.sname = sname;
	}
	public float getSfees() {
		return sfees;
	}
	public void setSfees(float sfees) {
		this.sfees = sfees;
	}
	@Override
	public String toString() {
		return "Studentt [sid=" + sid + ", name=" + sname + ", sfees=" + sfees + "]";
	}
}
class SortStudentFees implements Comparator<Studentt> {

	@Override
	public int compare(Studentt s1, Studentt s2) {
		if(s1.sfees>s2.sfees) 
			return 1;
		
		else if(s1.sfees<s2.sfees) 
			return -1;
		return 0;
		
	}
	
}
class SortStudentSid implements Comparator<Studentt>{

	@Override
	public int compare(Studentt s1, Studentt s2) {
		if(s1.sid> s2.sid) 
			return 1;
		else if(s1.sid<s2.sid)
			return -1;
		return 0;
	}
	
}
class SortStudentSname implements Comparator<Studentt>{

	@Override
	public int compare(Studentt s1, Studentt s2) {
		
		return s1.sname.compareTo(s2.sname);
	}
	
}


public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Studentt> list=new ArrayList<Studentt>();
		Studentt s1= new Studentt(4,"THIVYA",23455);
		Studentt s2= new Studentt(2,"RAMYA",12345);
		Studentt s3= new Studentt(1,"GEETHA",89345);
		Studentt s4=new Studentt(3,"MEENA",78345);
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		System.out.println(list);
		Iterator<Studentt> sit= list.iterator();
		System.out.println("SID\tFees\tName");
        while(sit.hasNext()) {
        	//System.out.println(sit.next());
        	Studentt sob = sit.next();
        	System.out.println(sob.sid+"\t"+sob.sfees+"\t"+sob.sname);
        }
        
        //sort based on fees 
        
        SortStudentFees sf=new SortStudentFees();
        Collections.sort(list,sf);
        //Collections.sort(list,new SortStudentFees()); //another way 
        System.out.println("AFTER SWAPPING USING FEES");
        Iterator<Studentt> sit1= list.iterator();
		System.out.println("SID\tFees\tName");
        while(sit1.hasNext()) {
        	Studentt sob = sit1.next();
        	System.out.println(sob.sid+"\t"+sob.sfees+"\t"+sob.sname);
        }
        
        // sort based on id 
        
        
        Collections.sort(list,new SortStudentSid());
        System.out.println("AFTER SWAPPING USING ID");
        Iterator<Studentt> sit2=list.iterator();
        System.out.println("SID\tFees\tName");
        while(sit2.hasNext()) {
        	Studentt sob = sit2.next();
        	System.out.println(sob.sid+"\t"+sob.sfees+"\t"+sob.sname);
        }
        
        // sort based on name
        
        
        Collections.sort(list,new SortStudentSname());
        System.out.println("AFTER SWAPPING USING ID");
        Iterator<Studentt> sit3=list.iterator();
        System.out.println("SID\tFees\tName");
        while(sit3.hasNext()) {
        	Studentt sob = sit3.next();
        	System.out.println(sob.sid+"\t"+sob.sfees+"\t"+sob.sname);
        }

	}
}

