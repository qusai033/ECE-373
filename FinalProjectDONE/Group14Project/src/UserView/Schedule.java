package UserView;

import java.util.ArrayList;

public class Schedule {
	//fields
	private ArrayList<ArrayList<String>> time;
	
	//constructor
	public Schedule(ArrayList<ArrayList<String>> time) {
		this.time = time;
	}
	public Schedule() {
		this.time = new ArrayList<ArrayList<String>>();
		ArrayList<String> innerTime = new ArrayList<String>();
		int counter = 0;
		for (int i=0; i<8; i++) {
			int curr;
			innerTime = new ArrayList<String>();
			for(int j=0; j<25; j++) {
				if (counter==0) {
					if(j!=24) {
						curr = j+1;
					}
					else {
						curr = 0;
					}
					innerTime.add(j + " to " + curr);
				}
				else {
					innerTime.add("Unavailable");
				}
			}
			counter++;
			this.time.add(innerTime);
		}
	}
	
	//setters and getters
	public ArrayList<ArrayList<String>> getTime() {
		return time;
	}
	public void setTime(ArrayList<ArrayList<String>> time) {
		this.time = time;
	}
	
}
