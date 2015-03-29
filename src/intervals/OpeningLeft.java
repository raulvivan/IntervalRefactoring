package intervals;

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
		return super.includes(interval, mainInterval);
	}
	
	

}
