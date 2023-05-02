package ejercicio4;

public class Television extends Electrodomestico {
	double resolucion = 20;
	boolean tdt = false;

	public Television() {
	}

	public Television(double precio, double peso) {
		super(precio, peso);
	}

	public Television(double precio, double peso, double resolucion, boolean tdt) {
		super(precio, peso);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	public double getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

	@Override
	public void precioFinal() {
		double sumaPorcentaje;
		super.precioFinal();
		if (resolucion > 40) {
			sumaPorcentaje = precioBase *0.3;
			precioBase+=sumaPorcentaje;
		}
		if (tdt) {
			precioBase+=50;
		}
	}

}
