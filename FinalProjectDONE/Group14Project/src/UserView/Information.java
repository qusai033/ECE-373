package UserView;

public class Information {
	//fields
	private DepartmentList department;
	private String information;
	
	//constructors
	public Information(DepartmentList department, String information) {
		this.department = department;
		this.information = information;
	}
	public Information() {
		this.department = new DepartmentList();
		this.information = null;
	}
	
	//setters and getters
	public DepartmentList getDepartment() {
		return department;
	}
	public void setDepartment(DepartmentList department) {
		this.department = department;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
}
