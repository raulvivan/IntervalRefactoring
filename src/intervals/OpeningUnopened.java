package intervals;

public class OpeningUnopened extends OpeningType{

	@Override
	public Opening getOpening() {
		return Opening.UNOPENED;
	}

	@Override
	public boolean includes(double value, double minimum, double maximum) {
		return value >= minimum && value <= maximum;
	}

	@Override
	public boolean includes(Interval interval, Interval mainInterval) {
		return interval.getMinimumValue()>= mainInterval.getMinimumValue() && interval.getMaximumValue() <= mainInterval.getMaximumValue();
	}
	
	

}
