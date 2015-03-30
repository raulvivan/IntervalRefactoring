package intervals;

public class Interval {

	private Punto minimum;
	private Punto maximum;
	private OpeningType openingType;

	public double getMinimum() {
		return this.getMinimumValue();
	} 
	public double getMinimumValue() {
		return minimum.getValue();
	} 

	public double getMaximum() {
		return maximum.getValue();
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
		this.minimum = new Punto(minimum);
		this.maximum = new Punto(maximum);
		this.openingType = opening.getType();
	}

	public double midPoint() {
		return (maximum.getValue() + minimum.getValue()) / 2;
	}

	public boolean includes(double value) {
		return openingType.includes(value, minimum.getValue(), maximum.getValue());
	} 

	public boolean includes(Interval interval) {
		return this.openingType.includes(interval, this);

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
