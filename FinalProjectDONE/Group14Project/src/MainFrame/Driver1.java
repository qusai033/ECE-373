package MainFrame;

import AdminView.*;
import Software.HospitalMainGUI;
import UserView.*;

public class Driver1 {
	public static void main(String[] args) {
		
		//initializations
		MainWindow mw1 = new MainWindow();
		
		//User Side
		Department depart1 = new Department();
		DepartmentList departList1 = new DepartmentList();
		Doctor doctor1 = new Doctor();
		Emergency emer1 = new Emergency();
		Home h1 = new Home();
		Information info1 = new Information();
		Schedule schedule1 = new Schedule();
		StaffList stafflist1 = new StaffList();
		Treatment treat1 = new Treatment();

		//Admin Side
		Admin admin1 = new Admin();
		DoctorView Dv1 = new DoctorView();
		
		//initialization (setters check and add check)
		treat1.setTreatmentName("Cuts");
		treat1.setTreatmentMethod("Clean wound");
		
		emer1.addTreatmentList(treat1);
		
		//schedule1.addTime("Monday 9 to 12");
		//schedule1.addTime("Thursday 1 to 5");
		
		doctor1.setDoctorName("Max");
		doctor1.setDoctorInfo("Specialist in cardiac operations");
		doctor1.setDoctorSchedule(schedule1);
		
		stafflist1.addDoctorList(doctor1);
		stafflist1.addNurseList("Victoria");
		stafflist1.addNurseList("Nikki");
		stafflist1.addStaffList("Alex");
		stafflist1.addStaffList("David");
		
		depart1.setDepartName("Cardiac");
		depart1.setDepartDetail("Very good at cardiac issues and operations");
		depart1.addDepartDoctors(doctor1);
		
		departList1.addDepartments(depart1);
		
		info1.setDepartment(departList1);
		info1.setInformation("The hospital specializes in to quality care for patients");
		
		h1.setDepartList(departList1);
		h1.setEmergencyPage(emer1);
		h1.setInfoPage(info1);
		h1.setStaffList(stafflist1);
		
		admin1.setMainPage(h1);
		
		Dv1.setMainPage(h1);
		
		mw1.setAdminWindow(admin1);
		mw1.setUserWindow(h1);
		mw1.setDoctorWindow(Dv1);
		
		//testing 
		System.out.println(treat1.getTreatmentName()+" "+treat1.getTreatmentMethod());
		System.out.println(emer1.getTreatmentList().get(0).getTreatmentName());
		System.out.println(schedule1.getTime().get(0)+" "+schedule1.getTime().get(1));
		System.out.println(doctor1.getDoctorName()+" "+doctor1.getDoctorInfo()+" "+doctor1.getDoctorSchedule().getTime().get(0));
		System.out.println(stafflist1.getDoctorList().get(0).getDoctorName());
		System.out.println(stafflist1.getNurseList().get(0)+" "+stafflist1.getNurseList().get(1));
		System.out.println(stafflist1.getNurseList().get(0)+" "+stafflist1.getNurseList().get(1));
		System.out.println(depart1.getDepartName()+" "+depart1.getDepartDetail()+" "+depart1.getDepartDoctors().get(0).getDoctorName());
		System.out.println(departList1.getDepartments().get(0).getDepartName());
		System.out.println(info1.getDepartment().getDepartments().get(0).getDepartName()+" "+info1.getInformation());
		System.out.println(h1.getDepartList()+" "+h1.getEmergencyPage()+" "+h1.getInfoPage()+" "+h1.getStaffList());
		
		//methods tests
		System.out.println("\nChecking methods for admin 1");
		System.out.println("Admin add department");
		System.out.println(departList1.getDepartments().size()+" "+departList1.getDepartments().get(0).getDepartName());
		admin1.addDepartment("Dentistry", "Look after oral health");
		System.out.println(departList1.getDepartments().get(0).getDepartName()+" "+departList1.getDepartments().get(1).getDepartName());
		
		System.out.println("\nChecking methods for admin 1");
		System.out.println("Admin add department");
		System.out.println(departList1.getDepartments().size()+" "+departList1.getDepartments().get(0).getDepartName());
		admin1.addDepartment("Dentistry", "Look after oral health");
		System.out.println(departList1.getDepartments().get(0).getDepartName()+" "+departList1.getDepartments().get(1).getDepartName());
		
		//second method
		System.out.println("\nChecking methods for admin 2");
		System.out.println("Admin add doctor");
		System.out.println(stafflist1.getDoctorList().size()+" "+stafflist1.getDoctorList().get(0).getDoctorName());
		System.out.println(departList1.getDepartments().get(1).getDepartDoctors().size());
		admin1.addDoctors("Daniel", "Dentist/Oral Expert", "Dentistry");
		System.out.println(stafflist1.getDoctorList().size());
		System.out.println(departList1.getDepartments().get(1).getDepartDoctors().size()+" "+departList1.getDepartments().get(1).getDepartDoctors().get(0).getDoctorName());
		
		System.out.println("\nChecking methods for admin 2");
		System.out.println("Admin add doctor");
		System.out.println(stafflist1.getDoctorList().size()+" "+stafflist1.getDoctorList().get(0).getDoctorName());
		System.out.println(departList1.getDepartments().get(1).getDepartDoctors().size());
		admin1.addDoctors("Daniel", "Dentist/Oral Expert", "Dentistry");
		System.out.println(stafflist1.getDoctorList().size()+" "+stafflist1.getDoctorList().get(1).getDoctorName());
		System.out.println(departList1.getDepartments().get(1).getDepartDoctors().size()+" "+departList1.getDepartments().get(1).getDepartDoctors().get(0).getDoctorName());
		
		//third method
		System.out.println("\nChecking methods for admin 3");
		System.out.println("Admin add treatment");
		System.out.println(emer1.getTreatmentList().size()+" "+emer1.getTreatmentList().get(0).getTreatmentName());
		admin1.addTreatment("Burns", "Apply Cold Water");
		System.out.println(emer1.getTreatmentList().size()+" "+emer1.getTreatmentList().get(1).getTreatmentName());
		
		System.out.println("\nChecking methods for admin 3");
		System.out.println("Admin add treatment");
		System.out.println(emer1.getTreatmentList().size()+" "+emer1.getTreatmentList().get(0).getTreatmentName());
		admin1.addTreatment("Burns", "Apply Cold Water");
		System.out.println(emer1.getTreatmentList().size()+" "+emer1.getTreatmentList().get(1).getTreatmentName()+" "+emer1.getTreatmentList().get(1).getTreatmentMethod());
		
		//fourth method
		System.out.println("\nChecking methods for admin 4");
		System.out.println("Admin remove doctor");
		System.out.println(stafflist1.getDoctorList().size()+" "+stafflist1.getDoctorList().get(0).getDoctorName());
		System.out.println(departList1.getDepartments().get(1).getDepartDoctors().size());
		admin1.removeDoctor("Daniel");
		System.out.println(stafflist1.getDoctorList().size());
		System.out.println(departList1.getDepartments().get(1).getDepartDoctors().size());
		
		//fifth method
		System.out.println("\nChecking methods for admin 5");
		System.out.println("Admin remove department");
		System.out.println(departList1.getDepartments().size()+" "+departList1.getDepartments().get(0).getDepartName());
		admin1.removeDepartment("Dentistry");
		System.out.println(departList1.getDepartments().size());
		
		//sixth method
		System.out.println("\nChecking methods for admin 6");
		System.out.println("Admin remove treatment");
		System.out.println(emer1.getTreatmentList().size()+" "+emer1.getTreatmentList().get(0).getTreatmentName());
		admin1.removeTreatment("Burns");
		System.out.println(emer1.getTreatmentList().size());
		
		//seventh method
		System.out.println("\nChecking methods for mainWindow admin authentication 7");
		System.out.println(mw1.authenticateAdmin("321"));
		System.out.println(mw1.authenticateAdmin("123"));
		
		//eighth method
		System.out.println("\nChecking methods for mainWindow doctor authentication 8");
		System.out.println(mw1.authenticateDoctor("321"));
		System.out.println(mw1.authenticateDoctor("123"));
		
		//ninth method
		System.out.println("\nChecking methods for doctorView edit doctor information 9");
		System.out.println(h1.staffList.getDoctorList().get(0).getDoctorInfo());
		Dv1.editDoctorInfo("Max", "Finished over 100 cardiac operations");
		System.out.println(h1.staffList.getDoctorList().get(0).getDoctorInfo());
		
		//tenth method
		System.out.println("\nChecking methods for doctorView add doctor schedule 10");
		for (int i=0; i< h1.staffList.getDoctorList().get(0).getDoctorSchedule().getTime().size(); i++) {
			System.out.println(h1.staffList.getDoctorList().get(0).getDoctorSchedule().getTime().get(i));
		}
		//Dv1.addDoctorSchedule("Max", "Tuesday 3 to 6");
		for (int i=0; i< h1.staffList.getDoctorList().get(0).getDoctorSchedule().getTime().size(); i++) {
			System.out.println(h1.staffList.getDoctorList().get(0).getDoctorSchedule().getTime().get(i));
		}
		admin1.addTreatment("Burns", "Apply Cold Water");
		admin1.addTreatment("Durns", "Apply Cold Water");
		admin1.addTreatment("Eurns", "Apply Cold Water");
		admin1.addTreatment("qurns", "Apply Cold Water");
		admin1.addDepartment("Dentistry", "Look after oral health");
		admin1.addDoctors("Daniel", "Dentist/Oral Expert", "Dentistry");
		admin1.addDoctors("Caniel", "Dentist/Oral Expert", "Dentistry");
		for(int i=0; i<schedule1.getTime().get(0).size(); i++) {
			System.out.println(schedule1.getTime().get(0).get(i));
		}
		
		
		HospitalMainGUI gui = new HospitalMainGUI("Hospital", mw1);
		
	}
}
