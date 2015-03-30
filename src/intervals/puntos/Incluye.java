package intervals.puntos;

public class Incluye extends Punto{

	public Incluye(double value) {
		super(value);
	}

	@Override
	public boolean compararMinimos(Punto punto) {
		return false;
	}

	@Override
	public boolean compararMinimos(Incluye incluye) {
		return false;
	}

	@Override
	public boolean compararMinimos(NoIncluye noIncluye) {
		return false;
	}

}
