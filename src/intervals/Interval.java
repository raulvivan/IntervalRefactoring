package intervals;

public class Interval {

	private double minimum;
	private double maximum;
	private OpeningType openingType;

	public double getMinimum() {
		return minimum;
	}

	public double getMaximum() {
		return maximum;
	}

	public Interval(Opening opening) {
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
		return openingType.includes(value, minimum, maximum);
	} 

	public boolean includes(Interval interval) {
		if (this.getOpening().equals(
				interval.getOpening())
				|| this.getOpening().equals(Opening.UNOPENED)
				|| interval.getOpening().equals(Opening.BOTH_OPENED)) {
			return interval.minimum >= minimum && interval.maximum <= maximum;
		} else {
			if ((this.getOpening().equals(Opening.BOTH_OPENED) && interval
					.getOpening().equals(Opening.UNOPENED))) {
				return interval.minimum > minimum && interval.maximum < maximum;
			} else if ((this.getOpening().equals(
					Opening.BOTH_OPENED) && interval.getOpening().equals(
					Opening.LEFT_OPENED))
					|| (this.getOpening().equals(
							Opening.RIGHT_OPENED) && interval.getOpening()
							.equals(Opening.UNOPENED))
					|| (this.getOpening().equals(
							Opening.RIGHT_OPENED) && interval
							.getOpening().equals(Opening.LEFT_OPENED))) {

				return interval.minimum >= minimum
						&& interval.maximum < maximum;

			} else if ((this.getOpening().equals(
					Opening.BOTH_OPENED) && interval.getOpening().equals(
					Opening.RIGHT_OPENED))
					|| (this.getOpening().equals(
							Opening.LEFT_OPENED) && interval.getOpening()
							.equals(Opening.UNOPENED))
					|| (this.getOpening().equals(
							Opening.LEFT_OPENED) && interval
							.getOpening().equals(Opening.RIGHT_OPENED))) {

				return interval.minimum > minimum
						&& interval.maximum <= maximum;

			} else
				return false;
		}

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
