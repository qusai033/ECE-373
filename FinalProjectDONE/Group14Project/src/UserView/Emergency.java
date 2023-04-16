package UserView;

import java.util.ArrayList;

public class Emergency {
	//fields
	private ArrayList<Treatment> treatmentList;
	
	//constructors
	public Emergency(ArrayList<Treatment> treatmentList) {
		this.treatmentList = treatmentList;
	}
	public Emergency() {
		this.treatmentList = new ArrayList<Treatment>();
	}
	
	//setters and getters
	public ArrayList<Treatment> getTreatmentList() {
		return treatmentList;
	}
	public void setTreatmentList(ArrayList<Treatment> treatmentList) {
		this.treatmentList = treatmentList;
	}
	public void addTreatmentList(Treatment treatmentList) {
		this.treatmentList.add(treatmentList);
	}
}
