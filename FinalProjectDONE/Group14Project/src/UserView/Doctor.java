package UserView;

public class Doctor {
	//fields
	private String doctorName;
	private String doctorInfo;
	private Schedule doctorSchedule;
	
	//constructors
	public Doctor(String doctorName, String doctorInfo, Schedule doctorSchedule) {
		this.doctorName = doctorName;
		this.doctorInfo = doctorInfo;
		this.doctorSchedule = doctorSchedule;
	}
	public Doctor() {
		this.doctorName = null;
		this.doctorInfo = null;
		this.doctorSchedule = new Schedule();
	}
	
	//setters and getters
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getDoctorInfo() {
		return doctorInfo;
	}
	public void setDoctorInfo(String doctorInfo) {
		this.doctorInfo = doctorInfo;
	}
	public Schedule getDoctorSchedule() {
		return doctorSchedule;
	}
	public void setDoctorSchedule(Schedule doctorSchedule) {
		this.doctorSchedule = doctorSchedule;
	}
	
}
