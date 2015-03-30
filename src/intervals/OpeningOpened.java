package intervals;

public class OpeningOpened extends OpeningType{

	@Override
	public Opening getOpening() {
		return Opening.BOTH_OPENED;
	}

	@Override
	public boolean includes(double value, double minimum, double maximum) {
		return value > minimum && value < maximum;
	}

	@Override
	public boolean includes(Interval interval, Interval mainInterval) {
		switch(interval.getOpening()){
		case BOTH_OPENED:
			return interval.getMinimumValue()>= mainInterval.getMinimumValue() && interval.getMaximum() <= mainInterval.getMaximum();
		case UNOPENED:
			return interval.getMinimumValue() > mainInterval.getMinimumValue() && interval.getMaximum() < mainInterval.getMaximum();
		case RIGHT_OPENED:
			return interval.getMinimumValue() > mainInterval.getMinimumValue() && interval.getMaximum() <= mainInterval.getMaximum();
		case LEFT_OPENED:
			return interval.getMinimumValue() >= mainInterval.getMinimumValue() && interval.getMaximum() < mainInterval.getMaximum();
		default:
			return false;
		}
	}
	
	
	
	

}
