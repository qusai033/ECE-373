package edu.ece373.hw_1;
import java.util.*;
import java.util.ArrayList;

public class Course {
	
	private String Dep_N;
	private String Cou_Num;
	private String Cou_N;
	private List<Student> Cou_StudentList = new ArrayList<Student>();
	private String[] Week = {"Mon", "Tue", "Wen", "Thu", "Fri"};
	private String[] Slot = {"8:00 AM to 9:15 AM", "9:30 AM to 10:45 AM", "11:00 AM to 12:15 PM",
							"12:30 PM to 1:45 PM", "2:00 PM to 3:15 PM", "3:30 PM to 4:45 AM"};
	private String Cou_Sch;


	public Course(String CouNum, String CouN, String DepN) {
		setCouNum(CouNum);
		setCouN(CouN);
		setDepN(DepN);
	}
	
	public void setCouNum(String CouNum) {
		Cou_Num = CouNum;
	}
	public void setCouN(String CouN) {
		Cou_N = CouN;
	}
	public void setDepN(String DepN) {
		Dep_N = DepN;
	}
	public String getCouNum() {
		return Cou_Num;
	}
	public String getCouN() {
		return Cou_N;
	}
	public String getDepN() {
		return Dep_N;
	}
	public void setCouStudentList(List<Student> StudentList){
		Cou_StudentList = StudentList;
	}
	public void addStudentToCou(Student student) {
		Cou_StudentList.add(student);
	}
	public void setCouSch(String CouSch){
		Cou_Sch = CouSch;
	}
	public String getCouSch() {
		return Cou_Sch;
	}
}
class Department{
	private String Dep_N;
	private List<Course> Dep_CouList = new ArrayList<Course>();
	private List<Student> Dep_StudentList = new ArrayList<Student>();
	
	public Department(String DepN) {
		setDepN(DepN);
	}
	public void setDepN(String DepN) {
		Dep_N = DepN;
	}
	public void addStudentToDep(Student student) {
		Dep_StudentList.add(student);
	}
	public void addCouToDep(Course course) {
		Dep_CouList.add(course);
	}
	public String getDepN() {
		return Dep_N;
	}
	public List<Course> getDepCouList(){
		return Dep_CouList;
	}
	public List<Student> getDepStudentList(){
		return Dep_StudentList;
	}
}
class Student{
	
	private String _Name;
	private Sring Dep_N;
	private List<Course> student_CouList = new ArrayList<Course>();
	
	public Student(String Name, String DepN) {
		setStudentN(Name);
		setDepN(DepN);
	}
	public void setStudentN(String Name) {
		_Name = Name;
	}
	public void setDepN(String DepN) {
		Dep_N = DepN;
	}
	public String getStudentN() {
		return _Name;
	}
	public String getDepN() {
		return Dep_N;
	}
	public List<Course> getStudentCouList(){
		return student_CouList;
	}
	public void setStudentCouList(List<Course> courseList) {
		student_CouList= courseList;
	}
	public void addCouToStudent(Course course) {
		student_CouList.add(course);
	}	
}
