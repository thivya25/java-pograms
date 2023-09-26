package thivyapacakge;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column ;

@Entity //to convert class to table
@Table(name="studenttable")
public class Student {
@Id  //to make studentid as primary key
private int studentid;
@Column(name="cn", nullable=false,unique=true)
private String studentname;
private int studentage;
private float studentfees;


//1.generate constructor(no argument /superclass construtor)
public Student() {
	super();
	// TODO Auto-generated constructor stub
}

//2.generate constructor with arguments
public Student(int studentid, String studentname, int studentage, float studentfees) {
	super();
	this.studentid = studentid;
	this.studentname = studentname;
	this.studentage = studentage;
	this.studentfees = studentfees;
}

//3.generate setter and getter methods
public int getStudentid() {
	return studentid;
}
public void setStudentid(int studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public int getStudentage() {
	return studentage;
}
public void setStudentage(int studentage) {
	this.studentage = studentage;
}
public float getStudentfees() {
	return studentfees;
}
public void setStudentfees(float studentfees) {
	this.studentfees = studentfees;
}

//4.generate toString method (mandatory)
@Override
public String toString() {
	return "Student [studentid=" + studentid + ", studentname=" + studentname + ", studentage=" + studentage
			+ ", studentfees=" + studentfees + "]";
}










}
