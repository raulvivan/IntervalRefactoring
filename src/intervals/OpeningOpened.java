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
	
	

}
