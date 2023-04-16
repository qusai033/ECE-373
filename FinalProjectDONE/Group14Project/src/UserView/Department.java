package UserView;

import java.util.ArrayList;

public class Department {
	//fields
	private ArrayList<Doctor> departDoctors;
	private String departName;
	private String departDetail;
	
	//constructors
	public Department(ArrayList<Doctor> departDoctors, String departName, String departDetail) {
		this.departDoctors = departDoctors;
		this.departName = departName;
		this.departDetail = departDetail;
	}
	public Department() {
		this.departDoctors = new ArrayList<Doctor>();
		this.departName = null;
		this.departDetail = null;
	}
	
	//setters and getters
	public ArrayList<Doctor> getDepartDoctors() {
		return departDoctors;
	}
	public void setDepartDoctors(ArrayList<Doctor> departDoctors) {
		this.departDoctors = departDoctors;
	}
	public void addDepartDoctors(Doctor departDoctors) {
		this.departDoctors.add(departDoctors);
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public String getDepartDetail() {
		return departDetail;
	}
	public void setDepartDetail(String departDetail) {
		this.departDetail = departDetail;
	}
}
