package intervals;

public abstract class OpeningType {
	
	public abstract Opening getOpening();
	
	public abstract boolean includes(double value, double minimum, double maximum);

	public boolean includes(Interval interval) {
		if (this.openingType.getOpening().equals(
				interval.openingType.getOpening())
				|| this.getOpening().equals(Opening.UNOPENED)
				|| interval.getOpening().equals(Opening.BOTH_OPENED)) {
			return interval.minimum >= minimum && interval.maximum <= maximum;
		} else {
			if ((this.openingType.getOpening().equals(Opening.BOTH_OPENED) && interval.openingType
					.getOpening().equals(Opening.UNOPENED))) {
				return interval.minimum > minimum && interval.maximum < maximum;
			} else if ((this.openingType.getOpening().equals(
					Opening.BOTH_OPENED) && interval.getOpening().equals(
					Opening.LEFT_OPENED))
					|| (this.openingType.getOpening().equals(
							Opening.RIGHT_OPENED) && interval.getOpening()
							.equals(Opening.UNOPENED))
					|| (this.openingType.getOpening().equals(
							Opening.RIGHT_OPENED) && interval.openingType
							.getOpening().equals(Opening.LEFT_OPENED))) {

				return interval.minimum >= minimum
						&& interval.maximum < maximum;

			} else if ((this.openingType.getOpening().equals(
					Opening.BOTH_OPENED) && interval.getOpening().equals(
					Opening.RIGHT_OPENED))
					|| (this.openingType.getOpening().equals(
							Opening.LEFT_OPENED) && interval.getOpening()
							.equals(Opening.UNOPENED))
					|| (this.openingType.getOpening().equals(
							Opening.LEFT_OPENED) && interval.openingType
							.getOpening().equals(Opening.RIGHT_OPENED))) {

				return interval.minimum > minimum
						&& interval.maximum <= maximum;

			} else
				return false;
		}

	}
}
