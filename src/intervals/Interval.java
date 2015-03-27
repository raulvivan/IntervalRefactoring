package intervals;

public class Interval {

	private double minimum;
	private double maximum;
	private OpeningType openingType;
	
	public Interval(Opening opening){
		this.openingType = opening.getType();
	}

	public Opening getOpening() {
		return openingType.getOpening();
	}

	public void setOpening(Opening opening) {
		this.openingType = opening.getType();
	}

	public Interval(double minimum, double maximum, Opening opening) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.openingType = opening.getType();
	} 

	public double midPoint() {
		return (maximum + minimum) / 2;
	}

	public boolean includes(double value) {
		switch (this.getOpening()) {
		case BOTH_OPENED:
			return value > minimum && value < maximum;
		case RIGHT_OPENED:
			return value >= minimum && value < maximum;
		case LEFT_OPENED:
			return value > minimum && value <= maximum;
		case UNOPENED:
			return value >= minimum && value <= maximum;
		default:
			return false;
		}
	}

	public boolean includes(Interval interval) {
		if (this.openingType.getOpening().equals(interval.openingType.getOpening())) {
			return interval.minimum >= minimum && interval.maximum <= maximum;
		} else {
			if ((this.openingType.getOpening().equals(Opening.BOTH_OPENED)
					&& interval.openingType.getOpening().equals(Opening.UNOPENED) || (interval.openingType.getOpening()
					.equals(Opening.BOTH_OPENED) && this.openingType.getOpening()
					.equals(Opening.UNOPENED)))) {
				return interval.minimum > minimum && interval.maximum < maximum;
			}
		}
		return false;
	}

	public boolean intersectsWith(Interval interval) {
		// TODO
		return false;
	}

	public Interval intersection(Interval interval) {
		// TODO
		return null;
	}

	@Override
	public String toString() {
		// TODO
		return null;
	}

	@Override
	public boolean equals(Object object) {
		// TODO
		return false;
	}
}
