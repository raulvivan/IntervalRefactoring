package intervals;

public abstract class OpeningType {
	
	public abstract Opening getOpening();
	
	public abstract boolean includes(double value, double minimum, double maximum);

}
