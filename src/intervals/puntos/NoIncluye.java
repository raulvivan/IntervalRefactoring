package intervals.puntos;

public class NoIncluye extends Punto{

	public NoIncluye(double value) {
		super(value);
	}

	@Override
	public boolean compararMinimos(Punto punto) {
		return punto.compararMinimos(this);
	}

	@Override
	public boolean compararMinimos(Incluye incluye) {
		return this.getValue() < incluye.getValue();
	}

	@Override
	public boolean compararMinimos(NoIncluye noIncluye) {
		return this.getValue() <= noIncluye.getValue();
	}

}
