public class Appointment {
	
	private TimeInterval time;
	
	public TimeInterval getTime() {
		return time;
	}
	
	public boolean conflictsWith(Appointment other) {
		return getTime().overlapsWith(other.getTime());
	}
}
