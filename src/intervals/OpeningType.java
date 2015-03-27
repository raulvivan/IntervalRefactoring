package intervals;

public abstract class OpeningType {
	
	public abstract Opening getOpening();
	
	public boolean includes(double value, double minimum, double maximum) {
		switch (this.getOpening()) {
		case BOTH_OPENED:
			throw new RuntimeException ("Should be being overridden");
		case RIGHT_OPENED:
			throw new RuntimeException ("Should be being overridden");
		case LEFT_OPENED:
			throw new RuntimeException ("Should be being overridden");
		case UNOPENED:
			throw new RuntimeException ("Should be being overridden");
		default:
			return false;
		}
	}

}
