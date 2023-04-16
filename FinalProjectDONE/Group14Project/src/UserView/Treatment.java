package UserView;

public class Treatment {
	//fields
	private String treatmentName;
	private String treatmentMethod;
	
	//constructors
	public Treatment(String treatmentName, String treatmentMethod) {
		this.treatmentName = treatmentName;
		this.treatmentMethod = treatmentMethod;
	}
	public Treatment() {
		this.treatmentName = null;
		this.treatmentMethod = null;
	}
	
	//setters and getters
	public String getTreatmentName() {
		return treatmentName;
	}
	public void setTreatmentName(String treatmentName) {
		this.treatmentName = treatmentName;
	}
	public String getTreatmentMethod() {
		return treatmentMethod;
	}
	public void setTreatmentMethod(String treatmentMethod) {
		this.treatmentMethod = treatmentMethod;
	}
	
}
