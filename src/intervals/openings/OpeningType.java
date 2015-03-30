package intervals.openings;

import intervals.Interval;
import intervals.Opening;

public abstract class OpeningType {

	public abstract Opening getOpening();

	public abstract boolean includes(double value, double minimum,
			double maximum);

	public abstract boolean includes(Interval interval, Interval mainInterval);

}
