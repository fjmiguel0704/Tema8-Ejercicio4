package ejercicio4;

public class Electrodomestico {
	double precioBase = 100;
	Color color = Color.blanco;
	Consumo consumoEnergetico = Consumo.F;
	double peso = 5;

	enum Color {
		blanco, negro, rojo, azul, gris
	};

	enum Consumo {
		A, B, C, D, E, F
	}

	public Electrodomestico() {

	};

	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	};

	public Electrodomestico(double precioBase, Color color, Consumo consumoEnergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public double getPrecioBase() {
		return precioBase;
	}

	public Color getColor() {
		return color;
	}

	public Consumo getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	private boolean comprobarConsumoEnergetico(char letra) {
		boolean estado = false;
		if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
			estado = true;
		}

		return estado;
	}

	private boolean comprobarColor(String color) {
		boolean estado = false;
		switch (color) {
		case "blanco", "negro", "rojo", "azul", "gris": {
			estado = true;
		}
		}

		return estado;
	}

	public void precioFinal() {
		switch (consumoEnergetico) {
		case A: {
			precioBase += 100;
		}
		case B: {
			precioBase += 80;
		}
		case C: {
			precioBase += 60;
		}
		case D: {
			precioBase += 50;
		}
		case E: {
			precioBase += 30;
		}
		case F: {
			precioBase += 10;
		}
		}

		if (peso >= 0 && peso <= 19) {
			precioBase += 10;
		} else if (peso >= 20 && peso <= 49) {
			precioBase += 50;
		} else if (peso >= 50 && peso <= 79) {
			precioBase += 80;
		} else if (peso > 80) {
			precioBase += 100;
		}
	}

}
