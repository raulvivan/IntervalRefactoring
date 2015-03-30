package intervals.openings;

import intervals.Opening;
import intervals.puntos.Incluye;
import intervals.puntos.NoIncluye;
import intervals.puntos.Punto;

public class OpeningRight extends OpeningType{

	@Override
	public Opening getOpening() {
		return Opening.RIGHT_OPENED;
	}

	@Override
	public boolean includes(double value, double minimum, double maximum) {
		return value >= minimum && value < maximum;
	}

	@Override
	public Punto asignarMinimo(double value) {
		return new Incluye(value);
	}

	@Override
	public Punto asignarMaximo(double value) {
		return new NoIncluye(value);
	}
	
	

}
