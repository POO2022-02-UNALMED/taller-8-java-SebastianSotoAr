package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;

	public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
		super(nombre, edad, posicion);
		this.golesMarcados = golesMarcados;
		this.dorsal = dorsal;
	}

	public Jugador(String nombre, int edad, String posicion) {
		super(nombre, edad, posicion);
		this.golesMarcados = 289;
		this.dorsal = 7;
	}

	public Jugador() {
		this.golesMarcados = 289;
		this.dorsal = 7;
	}

	@Override
	public boolean jugarConLasManos() {
		return false;
	}

	@Override
	public int compareTo(Object o) {
		Jugador j = (Jugador) o;
		return Math.abs(this.getEdad() - j.getEdad());
	}

	@Override
	public String toString() {
		return super.toString() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados;
	}
	
}
