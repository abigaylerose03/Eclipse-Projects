public class TimeInterval {
	
	private int start;
	private int end;
	
	public TimeInterval(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public boolean overlapsWith(TimeInterval interval) {
		if(interval.start > this.end || interval.end < this.start) {
			return true;
		} else {
			return false;
		}
	}

}
