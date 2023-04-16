package MainFrame;

import AdminView.Admin;
import AdminView.DoctorView;
import Software.HospitalMainGUI;
import UserView.Department;
import UserView.DepartmentList;
import UserView.Doctor;
import UserView.Emergency;
import UserView.Home;
import UserView.Information;
import UserView.Schedule;
import UserView.StaffList;
import UserView.Treatment;

public class HospitalSystemStartUp {
	public static void main(String[] args) {
	//initializations
			MainWindow mw1 = new MainWindow();
			
			//User Side
			Department depart1 = new Department();
			Department depart2 = new Department();
			Department depart3 = new Department();
			Department depart4 = new Department();//ALL THE DEPARTMENTS
			Department depart5 = new Department();
			Department depart6 = new Department();
			Department depart7 = new Department();
			DepartmentList departList1 = new DepartmentList();
			Doctor doctor1 = new Doctor();
			Doctor doctor2 = new Doctor();
			Doctor doctor3 = new Doctor();
			Doctor doctor4 = new Doctor();
			Doctor doctor5 = new Doctor();
			Doctor doctor6 = new Doctor();
			Doctor doctor7 = new Doctor();
			Doctor doctor8 = new Doctor();//ALL THE DOCTORS
			Emergency emer1 = new Emergency();
			Home h1 = new Home();
			Information info1 = new Information();//INFO
			Schedule schedule1 = new Schedule();//SCHEDULES PEOPLE
			StaffList stafflist1 = new StaffList();//STAFF LIST
			Treatment treat1 = new Treatment();
			Treatment treat2 = new Treatment();
			Treatment treat3 = new Treatment();
			Treatment treat4 = new Treatment();
			Treatment treat5 = new Treatment();
			Treatment treat6 = new Treatment();
			Treatment treat7 = new Treatment();
			Treatment treat8 = new Treatment();
			Treatment treat9 = new Treatment();
			Treatment treat10 = new Treatment();
			Treatment treat11 = new Treatment();
			Treatment treat12 = new Treatment();
			Treatment treat13 = new Treatment();
			Treatment treat14 = new Treatment();
			Treatment treat15 = new Treatment();//ALL THE TREATMENTS
			//Admin Side
			Admin admin1 = new Admin();
			DoctorView Dv1 = new DoctorView();
			
			//initialization (setters check and add check)
			treat1.setTreatmentName("Cuts");
			treat1.setTreatmentMethod("Clean wound and Apply Bandage.");
			treat2.setTreatmentName("HeadAche");
			treat2.setTreatmentMethod("Advil,if Headache continues,get to a Hospital or Call 911,it may be a Tumor");
			treat3.setTreatmentName("Broken Arm or Leg");
			treat3.setTreatmentMethod("Ducktape,"+"What are you doing either get yourself to the Hospital or Call 911,Your Arm or Leg is Broken");
			treat4.setTreatmentName("Depression");
			treat4.setTreatmentMethod("Schedule a Threapy Session with Dr.Brisket,you will need it");
			treat5.setTreatmentName("Dehydration");
			treat5.setTreatmentMethod("Drink 1 part water and 1 part Sports Drink");
			treat6.setTreatmentName("Constipation");
			treat6.setTreatmentMethod("Take a Laxative");
			treat7.setTreatmentName("Concusion");
			treat7.setTreatmentMethod("Take some Physical and Mental Rest");
			treat8.setTreatmentName("Covid");
			treat8.setTreatmentMethod("Stay Away from everyone and look yourself in your room for a week");
			treat9.setTreatmentName("Burns");
			treat9.setTreatmentMethod("Hold burned area over cool water,apply an icepack if need,Bandage the wound.");
			treat10.setTreatmentName("Muscle Pains");
			treat10.setTreatmentMethod("Stop Excersizing immediately,and let the muscle relax,if it doesn't get better take a pain killer,or go schedule a Hospital Visit.");
			treat11.setTreatmentName("Choking");
			treat11.setTreatmentMethod("Help dislodge the item with the heimlich  Manuver,Call 911 if this doesn't work immediately");
			treat12.setTreatmentName("Drowing");
			treat12.setTreatmentMethod("Take Person Out of the Water and Apply CPR,Call 911 if this doesn't work immediately");
			treat13.setTreatmentName("alcoholism");
			treat13.setTreatmentMethod("Go talk to the Doctor,and get started in a 12-step Program,and maybe Therapy");
			treat14.setTreatmentName("Drug Use");
			treat14.setTreatmentMethod("Go talk to the Doctor,and get started in a 12-step Program,and definitly a Therapist Visit Immediately");
			treat15.setTreatmentName("Cancer");
			treat15.setTreatmentMethod("WHAT ARE YOU DOING LOOKING THIS UP,GET TO THE HOSPITAL");
			emer1.addTreatmentList(treat1);
			emer1.addTreatmentList(treat2);
			emer1.addTreatmentList(treat3);
			emer1.addTreatmentList(treat4);
			emer1.addTreatmentList(treat5);
			emer1.addTreatmentList(treat6);
			emer1.addTreatmentList(treat7);
			emer1.addTreatmentList(treat8);
			emer1.addTreatmentList(treat9);
			emer1.addTreatmentList(treat10);
			emer1.addTreatmentList(treat11);
			emer1.addTreatmentList(treat12);
			emer1.addTreatmentList(treat13);
			emer1.addTreatmentList(treat14);
			emer1.addTreatmentList(treat15);
			
			
			//schedule1.addTime("Monday 9 to 12");
			//schedule1.addTime("Thursday 1 to 5");
			
			doctor1.setDoctorName("Oscar");
			doctor1.setDoctorInfo("Specialist in the department of cardiacology with more than 10 years of experience.");
			doctor1.setDoctorSchedule(schedule1);
			
			doctor2.setDoctorName("Logan");
			doctor2.setDoctorInfo("Specialist in the department of emergency with more than 10 years of experience.");
			
			doctor3.setDoctorName("Q");
			doctor3.setDoctorInfo("Specialist in the department of radiology with more than 5 years of experience.");
			doctor4.setDoctorName("Brisket");
			doctor4.setDoctorInfo("Specialist in the department of Therapy with more than 5 years of experience.,May or May not be a Dog");
			doctor5.setDoctorName("Abe");
			doctor5.setDoctorInfo("Specialist in the department of radiology with more than 3 years of experience,and is the Assistant Doctor for Q");
			doctor6.setDoctorName("Bell");
			doctor6.setDoctorInfo("The Man who has all the Meds to take away pain,Sickness and that Stuff and has been working for over 10 years in this field");
			doctor7.setDoctorName("Julia");
			doctor7.setDoctorInfo("The Man who has all the Meds to take away pain,Sickness and that Stuff and has been working for over 10 years in this field");
			doctor8.setDoctorName("Michelle");
			doctor8.setDoctorInfo("Specialist in Pediatrics,and has been working in it for over 13 years.");
			
			stafflist1.addDoctorList(doctor1);
			stafflist1.addDoctorList(doctor2);
			stafflist1.addDoctorList(doctor3);
			stafflist1.addDoctorList(doctor4);
			stafflist1.addDoctorList(doctor5);
			stafflist1.addDoctorList(doctor6);
			stafflist1.addDoctorList(doctor7);
			stafflist1.addDoctorList(doctor8);
			stafflist1.addNurseList("Victoria");
			stafflist1.addNurseList("Nikki");
			stafflist1.addStaffList("Alex");
			stafflist1.addStaffList("David");
			
			depart1.setDepartName("Emergency");
			depart1.setDepartDetail("This is an integral part of a hospital that caters to life-or-death situations that need immediate medical attention. This department may be divided into sub-units for trauma, burn, trauma surgery, and urgent care.");
			depart1.addDepartDoctors(doctor2);
			
			depart2.setDepartName("Cardiology");
			depart2.setDepartDetail("This ward caters to patients diagnosed with heart problems that need constant monitoring and observation due to fluctuations and abnormalities in the blood circulation and cardiac function.");
			depart2.addDepartDoctors(doctor1);
			
			depart3.setDepartName("Radiology");
			depart3.setDepartDetail("This is where imaging tests are performed. X-rays, CT-scans, MRI, ultrasounds are just some of the diagnostic procedures that are performed in this department.");
			depart3.addDepartDoctors(doctor3);
			
			depart4.setDepartName("Pharmacy");
			depart4.setDepartDetail("All medications prescribed to be taken in or out of the hospital can be purchased in this department. Licensed pharmacists manage the distribution, dispensing, use, and supply of medications within the entire hospital facility.");
			depart4.addDepartDoctors(doctor6);
			depart5.setDepartName("Therapy");
			depart5.setDepartDetail("This is where people go to talk about Experience from the past or their current Emotions and where a Therapist will talk with them in order to Help Them,");
			depart5.addDepartDoctors(doctor4);
			depart6.setDepartName("NeuroScience");
			depart6.setDepartDetail("This is the Department where nervous systems of People are studied,and where research is done for prostetics,and the research the Physiology of the Nervous System");
			depart6.addDepartDoctors(doctor7);
			depart7.setDepartName("Pediatrics");
			depart7.setDepartDetail("This is the department that deals with Children and their diseases and to new cures for these diseases.");
			depart7.addDepartDoctors(doctor8);
			
			
			departList1.addDepartments(depart1);
			departList1.addDepartments(depart2);
			departList1.addDepartments(depart3);
			departList1.addDepartments(depart4);
			departList1.addDepartments(depart5);
			departList1.addDepartments(depart6);
			departList1.addDepartments(depart7);
			
			info1.setDepartment(departList1);
			info1.setInformation("Welcome to ECE 373 Hospital, for your medical care, treatment and recovery. Your comfort and recovery is important to our entire staff, which is dedicated to creating a healing environment for you and your family. As an academic medical center focused on clinical excellence, research and teaching, the goal of our entire team is focused on ensuring you receive the very best care from top-notch medical experts.");
			
			h1.setDepartList(departList1);
			h1.setEmergencyPage(emer1);
			h1.setInfoPage(info1);
			h1.setStaffList(stafflist1);
			
			admin1.setMainPage(h1);
			
			Dv1.setMainPage(h1);
			Dv1.addDoctorSchedule("Logan", "Monday", "8", "18");
			Dv1.addDoctorSchedule("Logan", "Tuesday", "8", "18");
			Dv1.addDoctorSchedule("Logan", "Wednesday", "8", "18");
			Dv1.addDoctorSchedule("Logan", "Thursday", "8", "18");
			Dv1.addDoctorSchedule("Logan", "Friday", "8", "18");
			Dv1.addDoctorSchedule("Logan", "Saturday", "9", "18");
			Dv1.addDoctorSchedule("Logan", "Sunday", "9", "18");
			Dv1.addDoctorSchedule("Oscar", "Monday", "2", "12");
			Dv1.addDoctorSchedule("Oscar", "Tuesday", "2", "12");
			Dv1.addDoctorSchedule("Oscar", "Wednesday", "2", "12");
			Dv1.addDoctorSchedule("Oscar", "Thursday", "2", "12");
			Dv1.addDoctorSchedule("Oscar", "Friday", "2", "12");
			Dv1.addDoctorSchedule("Oscar", "Saturday", "4", "14");
			Dv1.addDoctorSchedule("Oscar", "Sunday", "4", "14");
			Dv1.addDoctorSchedule("Q", "Monday", "7", "16");
			Dv1.addDoctorSchedule("Q", "Tuesday", "7", "16");
			Dv1.addDoctorSchedule("Q", "Wednesday", "7", "16");
			Dv1.addDoctorSchedule("Q", "Thursday", "7", "16");
			Dv1.addDoctorSchedule("Q", "Friday", "7", "16");
			Dv1.addDoctorSchedule("Q", "Saturday", "8", "17");
			Dv1.addDoctorSchedule("Q", "Sunday", "8", "17");
			Dv1.addDoctorSchedule("Brisket", "Monday", "8", "18");
			Dv1.addDoctorSchedule("Brisket", "Tuesday", "8", "18");
			Dv1.addDoctorSchedule("Brisket", "Wednesday", "8", "18");
			Dv1.addDoctorSchedule("Brisket", "Thursday", "8", "18");
			Dv1.addDoctorSchedule("Brisket", "Friday", "8", "18");
			Dv1.addDoctorSchedule("Brisket", "Saturday", "10", "20");
			Dv1.addDoctorSchedule("Brisket", "Sunday", "10", "20");
			Dv1.addDoctorSchedule("Abe", "Monday", "9", "19");
			Dv1.addDoctorSchedule("Abe", "Tuesday", "9", "19");
			Dv1.addDoctorSchedule("Abe", "Wednesday", "9", "19");
			Dv1.addDoctorSchedule("Abe", "Thursday", "9", "19");
			Dv1.addDoctorSchedule("Abe", "Friday", "9", "19");
			Dv1.addDoctorSchedule("Abe", "Saturday", "11", "21");
			Dv1.addDoctorSchedule("Abe", "Sunday", "11", "21");
			Dv1.addDoctorSchedule("Julia", "Monday", "8", "18");
			Dv1.addDoctorSchedule("Julia", "Tuesday", "8", "18");
			Dv1.addDoctorSchedule("Julia", "Wednesday", "8", "18");
			Dv1.addDoctorSchedule("Julia", "Thursday", "8", "18");
			Dv1.addDoctorSchedule("Julia", "Friday", "8", "18");
			Dv1.addDoctorSchedule("Julia", "Saturday", "9", "18");
			Dv1.addDoctorSchedule("Julia", "Sunday", "9", "18");
			Dv1.addDoctorSchedule("Bell", "Monday", "2", "12");
			Dv1.addDoctorSchedule("Bell", "Tuesday", "2", "12");
			Dv1.addDoctorSchedule("Bell", "Wednesday", "2", "12");
			Dv1.addDoctorSchedule("Bell", "Thursday", "2", "12");
			Dv1.addDoctorSchedule("Bell", "Friday", "2", "12");
			Dv1.addDoctorSchedule("Bell", "Saturday", "0", "10");
			Dv1.addDoctorSchedule("Bell", "Sunday", "0", "10");
			Dv1.addDoctorSchedule("Michelle", "Monday", "8", "18");
			Dv1.addDoctorSchedule("Michelle", "Tuesday", "8", "18");
			Dv1.addDoctorSchedule("Michelle", "Wednesday", "8", "18");
			Dv1.addDoctorSchedule("Michelle", "Thursday", "8", "18");
			Dv1.addDoctorSchedule("Michelle", "Friday", "8", "18");
			Dv1.addDoctorSchedule("Michelle", "Saturday", "9", "19");
			Dv1.addDoctorSchedule("Michelle", "Sunday", "9", "19");
			
			mw1.setAdminWindow(admin1);
			mw1.setUserWindow(h1);
			mw1.setDoctorWindow(Dv1);
			HospitalMainGUI gui = new HospitalMainGUI("Hospital", mw1);
	}
}
