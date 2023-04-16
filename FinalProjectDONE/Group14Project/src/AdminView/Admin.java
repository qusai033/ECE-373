package AdminView;

import java.util.ArrayList;

import UserView.*;

public class Admin {
	//field
	public Home MainPage;
	
	//Constructor
	public Admin(Home mainPage) {
		MainPage = mainPage;
	}
	public Admin() {
		MainPage = new Home();
	}
	
	//setters and getters
	public Home getMainPage() {
		return MainPage;
	}
	public void setMainPage(Home mainPage) {
		MainPage = mainPage;
	}
	
	//methods
	public String addDepartment(String name, String detail) {
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		int count = MainPage.departList.getDepartments().size();
		if (count >= 16) {
			return "Too many departments";
		}
		for(int i=0; i<MainPage.departList.getDepartments().size(); i++) {
			if(MainPage.departList.getDepartments().get(i).getDepartName().toUpperCase().equals(name.toUpperCase())) {
				//System.out.println("Repeated Department");
				return "Department already existed";
			}
		}
		Department depart = new Department(doctors, name, detail);
		MainPage.departList.addDepartments(depart);
		//System.out.println("Successful Implement of Department: "+name);
		return "Successfully Added Department: "+name;
	}
	public String addDoctors(String name, String info, String departName) {
		int i=0;
		Doctor Doc = new Doctor(); 
		Doc.setDoctorName(name);
		Doc.setDoctorInfo(info);
		Doc.setDoctorSchedule(new Schedule());
		int count = MainPage.staffList.getDoctorList().size();
		if (count >= 16) {
			return "Too many doctors";
		}
		for (i=0; i<MainPage.departList.getDepartments().size(); i++) {
			if (MainPage.departList.getDepartments().get(i).getDepartName().toUpperCase().equals(departName.toUpperCase())) {
				for(int f=0; f<MainPage.departList.getDepartments().get(i).getDepartDoctors().size(); f++) {
					if((MainPage.departList.getDepartments().get(i).getDepartDoctors().get(f).getDoctorName().toUpperCase().equals(name.toUpperCase()))) {
						//System.out.println("Doctor Already existed");
						return "Doctor Already existed";
					}
				}
				MainPage.staffList.addDoctorList(Doc);
				MainPage.departList.getDepartments().get(i).addDepartDoctors(Doc);
			}
		}
		return "Doctor "+name+" has been added to "+departName;
	}
	public String addTreatment(String name, String method) {
		int count = MainPage.emergencyPage.getTreatmentList().size();
		if (count >= 16) {
			return "Too many treatments";
		}
		for(int i=0; i < MainPage.emergencyPage.getTreatmentList().size();i++) {
			if (MainPage.emergencyPage.getTreatmentList().get(i).getTreatmentName().equals(name)) {
				//System.out.println("Repeated Type of Treatment");
				return "Repeated Type of Treatment";
			}
		}
		Treatment type = new Treatment(name, method);
		MainPage.emergencyPage.addTreatmentList(type);
		//System.out.println("Successful Implement of Treatment: "+name);
		return "Successfully added Treatment for "+name;
	}
	public String removeDoctor(String docName) {
		for(int i=0; i<MainPage.staffList.getDoctorList().size(); i++) {
			if(MainPage.staffList.getDoctorList().get(i).getDoctorName().toUpperCase().equals(docName.toUpperCase())) {
				MainPage.staffList.getDoctorList().remove(i);
				for(int f=0; f<MainPage.departList.getDepartments().size();f++) {
					for(int j=0; j<MainPage.departList.getDepartments().get(f).getDepartDoctors().size();j++) {
						if(MainPage.departList.getDepartments().get(f).getDepartDoctors().get(j).getDoctorName().toUpperCase().equals(docName.toUpperCase())) {
							MainPage.departList.getDepartments().get(f).getDepartDoctors().remove(j);
							//System.out.println("Removed Doctor "+docName);
							return "Removed Doctor "+docName;
						}
					}
				}
			}
		}
		return "Doctor "+ docName +" Not Found";
	}
	public String removeDepartment(String departName) {
		for(int i=0; i<MainPage.departList.getDepartments().size();i++) {
			if(MainPage.departList.getDepartments().get(i).getDepartName().toUpperCase().equals(departName.toUpperCase())) {
				MainPage.departList.getDepartments().remove(i);
				//System.out.println("Removed Department "+departName);
				return "Removed Department "+departName;
			}
		}
		return departName + " Not Found.";
	}
	public String removeTreatment(String treatmentName) {
		for(int i=0; i<MainPage.emergencyPage.getTreatmentList().size();i++) {
			if(MainPage.emergencyPage.getTreatmentList().get(i).getTreatmentName().toUpperCase().equals(treatmentName.toUpperCase())) {
				MainPage.emergencyPage.getTreatmentList().remove(i);
				//System.out.println("Removed Treatment "+treatmentName);
				return "Removed Treatment "+treatmentName;
			}
		}
		return treatmentName + " Not Found.";
	}
}
