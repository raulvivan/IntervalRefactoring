package intervals.openings;

import intervals.Interval;
import intervals.Opening;
import intervals.puntos.Punto;

public abstract class OpeningType {

	public abstract Opening getOpening();

	public abstract boolean includes(double value, double minimum,
			double maximum);

	public abstract boolean includes(Interval interval, Interval mainInterval);
	
	public abstract Punto asignarMinimo(double value);
	
	public abstract Punto asignarMaximo(double value);

}
