package intervals;

public class Interval {

	private double minimum;
	private double maximum;
	private Opening opening;

	public Interval(double minimum, double maximum, Opening opening) {
		this.minimum = minimum;
		this.maximum = maximum;
		this.opening = opening;
	} 

	public double midPoint() {
		return (maximum + minimum) / 2;
	}

	public boolean includes(double value) {
		switch (opening) {
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
		if (this.opening.equals(interval.opening)) {
			return interval.minimum >= minimum && interval.maximum <= maximum;
		} else {
			if ((this.opening.equals(Opening.BOTH_OPENED)
					&& interval.opening.equals(Opening.UNOPENED) || (interval.opening
					.equals(Opening.BOTH_OPENED) && this.opening
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
