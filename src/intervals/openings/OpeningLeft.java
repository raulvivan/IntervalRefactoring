package intervals.openings;

import intervals.Interval;
import intervals.Opening;

public class OpeningLeft extends OpeningType{

	@Override
	public Opening getOpening() {
		return Opening.LEFT_OPENED;
	}

	@Override
	public boolean includes(double value, double minimum, double maximum) {
		return value > minimum && value <= maximum;
	}

	@Override
	public boolean includes(Interval interval, Interval mainInterval) {
		switch(interval.getOpening()){
		case BOTH_OPENED:
			return interval.getMinimumValue()>= mainInterval.getMinimumValue() && interval.getMaximumValue() <= mainInterval.getMaximumValue();
		case UNOPENED:
			return interval.getMinimumValue() > mainInterval.getMinimumValue()&& interval.getMaximumValue() <= mainInterval.getMaximumValue();
		case LEFT_OPENED:
			return interval.getMinimumValue()>= mainInterval.getMinimumValue() && interval.getMaximumValue() <= mainInterval.getMaximumValue();
		case RIGHT_OPENED:
			return interval.getMinimumValue() > mainInterval.getMinimumValue()&& interval.getMaximumValue() <= mainInterval.getMaximumValue();
			default:
				return false;
		}
	}
	
	

}