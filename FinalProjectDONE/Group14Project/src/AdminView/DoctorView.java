package AdminView;

import UserView.Home;

public class DoctorView {
	//field
		public Home MainPage;
		
		//Constructor
		public DoctorView(Home mainPage) {
			MainPage = mainPage;
		}
		public DoctorView() {
			MainPage = new Home();
		}
		
		//setters and getters
		public Home getMainPage() {
			return MainPage;
		}
		public void setMainPage(Home mainPage) {
			MainPage = mainPage;
		}
		
		//Methods
		public String editDoctorInfo(String docName, String newInfo) {
			for(int i=0; i<MainPage.staffList.getDoctorList().size(); i++) {
				if(MainPage.staffList.getDoctorList().get(i).getDoctorName().toUpperCase().equals(docName.toUpperCase())) {
					MainPage.staffList.getDoctorList().get(i).setDoctorInfo(newInfo);
					//System.out.println("Info Updated");
					return "Information Updated";
				}
			}
			//System.out.println("Doctor Not Found!");
			return "Doctor Not Found!";
		}
		public String addDoctorSchedule(String docName, String Week, String time1, String time2) {
//			for(int i=0; i<MainPage.staffList.getDoctorList().size(); i++) {
//				if(MainPage.staffList.getDoctorList().get(i).getDoctorName().toUpperCase().equals(docName.toUpperCase())) {
//					for(int j=0; j<MainPage.staffList.getDoctorList().get(i).getDoctorSchedule().getTime().size();j++) {
//						if(MainPage.staffList.getDoctorList().get(i).getDoctorSchedule().getTime().get(j).equals(time)) {
//							return "Schedule Already Existed.";
//						}
//					}
//					//MainPage.staffList.getDoctorList().get(i).getDoctorSchedule().addTime(time);
//					//System.out.println("Schedule Added");
//					return "Schedule Added";
//				}
//			}
//			//System.out.println("Doctor Not Found!");
//			return "Doctor Not Found!";
			//System.out.println(Week);
			int numWeek = 0;
			switch (Week.toUpperCase()) {
				case "MONDAY":
					numWeek = 1;
					break;
				case "TUESDAY":
					numWeek = 2;
					break;
				case "WEDNESDAY":
					numWeek = 3;
					break;
				case "THURSDAY":
					numWeek = 4;
					break;
				case "FRIDAY":
					numWeek = 5;
					break;
				case "SATURDAY":
					numWeek = 6;
					break;
				case "SUNDAY":
					numWeek = 7;
					break;
				default:
					return "Incorrect Week of the Day";
			}
			for(int i=0; i<MainPage.staffList.getDoctorList().size(); i++) {
				if(MainPage.staffList.getDoctorList().get(i).getDoctorName().toUpperCase().equals(docName.toUpperCase())) {
					for(int j=Integer.parseInt(time1); j<Integer.parseInt(time2); j++) {
						if(MainPage.staffList.getDoctorList().get(i).getDoctorSchedule().getTime().get(numWeek).get(j).equals("Unavailable")) {
							MainPage.staffList.getDoctorList().get(i).getDoctorSchedule().getTime().get(numWeek).set(j, "Available");
						}
					}
					return "Schedule Changed";
				}
			}
			return "Doctor Not Found!";
		}
		public String removeDoctorSchedule(String docName, String Week, String time1, String time2) {
			int numWeek = 0;
			switch (Week.toUpperCase()) {
				case "MONDAY":
					numWeek = 1;
					break;
				case "TUESDAY":
					numWeek = 2;
					break;
				case "WEDNESDAY":
					numWeek = 3;
					break;
				case "THURSDAY":
					numWeek = 4;
					break;
				case "FRIDAY":
					numWeek = 5;
					break;
				case "SATURDAY":
					numWeek = 6;
					break;
				case "SUNDAY":
					numWeek = 7;
					break;
				default:
					return "Incorrect Week of the Day";
			}
			for(int i=0; i<MainPage.staffList.getDoctorList().size(); i++) {
				if(MainPage.staffList.getDoctorList().get(i).getDoctorName().toUpperCase().equals(docName.toUpperCase())) {
					for(int j=Integer.parseInt(time1); j<Integer.parseInt(time2); j++) {
						if(MainPage.staffList.getDoctorList().get(i).getDoctorSchedule().getTime().get(numWeek).get(j).equals("Available")) {
							MainPage.staffList.getDoctorList().get(i).getDoctorSchedule().getTime().get(numWeek).set(j, "Unavailable");
						}
					}
					return "Schedule Changed";
				}
			}
			return "Doctor Not Found!";
		}
}
