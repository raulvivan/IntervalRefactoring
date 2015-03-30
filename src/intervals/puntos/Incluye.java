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
		return incluye.getValue() <= this.getValue();
	}

	@Override
	public boolean compararMinimos(NoIncluye noIncluye){
		return noIncluye.getValue() < this.getValue();
	}

	@Override
	public boolean compararMaximos(Punto punto) {
		return punto.compararMaximos(this);
	}

	@Override
	public boolean compararMaximos(Incluye incluye) {
		return incluye.getValue() >= this.getValue();
	}

	@Override
	public boolean compararMaximos(NoIncluye noIncluye) {
		return noIncluye.getValue() > this.getValue();
	}

}
