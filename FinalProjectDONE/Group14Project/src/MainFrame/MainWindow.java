package MainFrame;

import AdminView.*;
import UserView.*;

public class MainWindow {
	//fields
	private Admin adminWindow;
	private Home userWindow;
	private DoctorView doctorWindow;
	
	//constructor
	public MainWindow(Admin adminWindow, Home userWindow, DoctorView doctorWindow) {
		this.adminWindow = adminWindow;
		this.userWindow = userWindow;
		this.doctorWindow = doctorWindow;
	}
	public MainWindow() {
		this.adminWindow = new Admin();
		this.userWindow = new Home();
		this.doctorWindow = new DoctorView();
	}
	public MainWindow(Home userWindow) {
		this.adminWindow = new Admin();
		this.userWindow = userWindow;
	}
	
	//setters and getters
	public Admin getAdminWindow() {
		return adminWindow;
	}
	public void setAdminWindow(Admin adminWindow) {
		this.adminWindow = adminWindow;
	}
	public Home getUserWindow() {
		return userWindow;
	}
	public void setUserWindow(Home userWindow) {
		this.userWindow = userWindow;
	}
	public DoctorView getDoctorWindow() {
		return doctorWindow;
	}
	public void setDoctorWindow(DoctorView doctorWindow) {
		this.doctorWindow = doctorWindow;
	}
	
	//methods
	public boolean authenticateAdmin(String password) {
		String key = "123";
		if(password.equals(key)) {
			return true;
		}
		return false;
	}
	public boolean authenticateDoctor(String password) {
		String key = "321";
		if(password.equals(key)) {
			return true;
		}
		return false;
	}
}
