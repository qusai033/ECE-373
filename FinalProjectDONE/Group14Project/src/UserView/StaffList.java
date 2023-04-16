package UserView;

import java.util.ArrayList;

public class StaffList {
	//fields
	private ArrayList<Doctor> doctorList;
	private ArrayList<String> nurseList;
	private ArrayList<String> staffList;
	
	//constructors
	public StaffList(ArrayList<Doctor> doctorList, ArrayList<String> nurseList, ArrayList<String> staffList) {
		this.doctorList = doctorList;
		this.nurseList = nurseList;
		this.staffList = staffList;
	}
	public StaffList() {
		this.doctorList = new ArrayList<Doctor>();
		this.nurseList = new ArrayList<String>();
		this.staffList = new ArrayList<String>();
	}
	
	//setters and getters
	public ArrayList<Doctor> getDoctorList() {
		return doctorList;
	}
	public void setDoctorList(ArrayList<Doctor> doctorList) {
		this.doctorList = doctorList;
	}
	public void addDoctorList(Doctor doctorList) {
		this.doctorList.add(doctorList);
	}
	public ArrayList<String> getNurseList() {
		return nurseList;
	}
	public void setNurseList(ArrayList<String> nurseList) {
		this.nurseList = nurseList;
	}
	public void addNurseList(String nurseList) {
		this.nurseList.add(nurseList);
	}
	public ArrayList<String> getStaffList() {
		return staffList;
	}
	public void setStaffList(ArrayList<String> staffList) {
		this.staffList = staffList;
	}
	public void addStaffList(String staffList) {
		this.staffList.add(staffList);
	}
}
