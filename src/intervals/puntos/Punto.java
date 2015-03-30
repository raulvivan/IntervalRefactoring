package intervals.puntos;

public abstract class Punto {
	
	private final double value;

	public Punto(double value) {
		super();
		this.value = value;
	}

	public double getValue() {
		return value;
	}
	
	public abstract boolean compararMinimos(Punto punto);
	
	public abstract boolean compararMinimos(Incluye incluye);
	
	public abstract boolean compararMinimos(NoIncluye noIncluye);
	
	

}
