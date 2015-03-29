package intervals;

public abstract class OpeningType {
	
	public abstract Opening getOpening();
	
	public abstract boolean includes(double value, double minimum, double maximum);

	public boolean includes(Interval interval, Interval mainInterval) {
		if (this.getOpening().equals(
				interval.getOpening())
				|| this.getOpening().equals(Opening.UNOPENED)
				|| interval.getOpening().equals(Opening.BOTH_OPENED)) {
			return interval.getMinimum()>= mainInterval.getMinimum() && interval.getMaximum() <= mainInterval.getMaximum();
		} else {
			if ((this.getOpening().equals(Opening.BOTH_OPENED) && interval
					.getOpening().equals(Opening.UNOPENED))) {
				return interval.getMinimum() > mainInterval.getMinimum() && interval.getMaximum() < mainInterval.getMaximum();
			} else if ((this.getOpening().equals(
					Opening.BOTH_OPENED) && interval.getOpening().equals(
					Opening.LEFT_OPENED))
					|| (this.getOpening().equals(
							Opening.RIGHT_OPENED) && interval.getOpening()
							.equals(Opening.UNOPENED))
					|| (this.getOpening().equals(
							Opening.RIGHT_OPENED) && interval
							.getOpening().equals(Opening.LEFT_OPENED))) {

				return interval.getMinimum() >= mainInterval.getMinimum()
						&& interval.getMaximum() < mainInterval.getMaximum();

			} else if ((this.getOpening().equals(
					Opening.BOTH_OPENED) && interval.getOpening().equals(
					Opening.RIGHT_OPENED))
					|| (this.getOpening().equals(
							Opening.LEFT_OPENED) && interval.getOpening()
							.equals(Opening.UNOPENED))
					|| (this.getOpening().equals(
							Opening.LEFT_OPENED) && interval
							.getOpening().equals(Opening.RIGHT_OPENED))) {

				return interval.getMinimum() > mainInterval.getMinimum()
						&& interval.getMaximum() <= mainInterval.getMaximum();

			} else
				return false;
		}

	}
}
