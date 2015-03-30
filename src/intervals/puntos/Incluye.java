package intervals.puntos;

public class Incluye extends Punto{

	public Incluye(double value) {
		super(value);
	}

	@Override
	public boolean compararMinimos(Punto punto) {
		return punto.compararMinimos(this);
	}

	@Override
	public boolean compararMinimos(Incluye incluye) {
		return this.getValue() <= incluye.getValue();
	}

}
