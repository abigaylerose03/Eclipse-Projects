import java.util.ArrayList;

public class DailySchedule {
	
	private ArrayList<Appointment> apptList;
	
	public DailySchedule() {
		apptList = new ArrayList<Appointment>();
	}
	
	public void clearConflicts(Appointment appt) {
		for(Appointment a : apptList) {
			if(a.conflictsWith(appt)) {
				apptList.remove(a);
			}
		}
	}
	
	public boolean addAppt(Appointment appt, boolean emergency) {
		for(Appointment a : apptList) {
			if(a.conflictsWith(appt)) {
				return false;
			} else if(emergency) {
				clearConflicts(appt);
				apptList.add(appt);
				return true;
			}
		}
		apptList.add(appt);
		return true;
	} 

}
