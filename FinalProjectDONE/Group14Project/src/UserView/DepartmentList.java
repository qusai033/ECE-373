package UserView;

import java.util.ArrayList;

public class DepartmentList {
	//field
	private ArrayList<Department> departments;
	
	//constructors
	public DepartmentList(ArrayList<Department> departments) {
		this.departments = departments;
	}
	public DepartmentList() {
		this.departments = new ArrayList<Department>();
	}
	
	//Setters and Getters
	public ArrayList<Department> getDepartments() {
		return departments;
	}
	public void setDepartments(ArrayList<Department> departments) {
		this.departments = departments;
	}
	public void addDepartments(Department department) {
		this.departments.add(department);
	}	
}
