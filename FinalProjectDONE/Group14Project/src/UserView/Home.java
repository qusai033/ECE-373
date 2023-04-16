package UserView;

public class Home {
	//fields
	public Information infoPage;
	public DepartmentList departList;
	public StaffList staffList;
	public Emergency emergencyPage;
	
	//constructor
	public Home(Information infoPage, DepartmentList departList, StaffList staffList, Emergency emergencyPage) {
		this.infoPage = infoPage;
		this.departList = departList;
		this.staffList = staffList;
		this.emergencyPage = emergencyPage;
	}
	public Home() {
		this.infoPage = new Information();
		this.departList = new DepartmentList();
		this.staffList = new StaffList();
		this.emergencyPage = new Emergency();
	}
	
	//setters and getters
	public Information getInfoPage() {
		return infoPage;
	}
	public void setInfoPage(Information infoPage) {
		this.infoPage = infoPage;
	}
	public DepartmentList getDepartList() {
		return departList;
	}
	public void setDepartList(DepartmentList departList) {
		this.departList = departList;
	}
	public StaffList getStaffList() {
		return staffList;
	}
	public void setStaffList(StaffList staffList) {
		this.staffList = staffList;
	}
	public Emergency getEmergencyPage() {
		return emergencyPage;
	}
	public void setEmergencyPage(Emergency emergencyPage) {
		this.emergencyPage = emergencyPage;
	}
}
