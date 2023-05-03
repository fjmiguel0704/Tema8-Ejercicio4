package ejercicio4;

public class Lavadora extends Electrodomestico {
	double carga = 5;

	/**
	 * Constructor por defecto
	 */
	public Lavadora() {

	}

	/**
	 * 
	 * @param precio
	 * @param peso
	 */
	public Lavadora(double precio, double peso) {
		super(precio, peso);
	}

	/**
	 * 
	 * @param precio
	 * @param peso
	 * @param carga
	 */
	public Lavadora(Color color, Consumo consumo, double precio, double peso, double carga) {
		super(precio, peso);
		this.carga = carga;
	}

	public double getCarga() {
		return carga;
	}

	@Override
	public void precioFinal() {
		super.precioFinal();
		if (carga > 30) {
			precioBase += 50;
		}
	}
}
