package ejercicio4;

import ejercicio4.Electrodomestico.Color;
import ejercicio4.Electrodomestico.Consumo;

public class Main {

	public static void main(String[] args) {
		double precioElect = 0;
		double precioLava = 0;
		double precioTele = 0;
		double precioSumaElectrodomesticos;

		Electrodomestico productos[] = new Electrodomestico[10];

		productos[0] = new Electrodomestico(10.5, 18);
		productos[1] = new Electrodomestico(100, Color.blanco, Consumo.A, 25);
		productos[2] = new Electrodomestico(90, Color.negro, Consumo.B, 100);
		productos[3] = new Electrodomestico(80, Color.rojo, Consumo.C, 41);
		productos[4] = new Electrodomestico(90, Color.azul, Consumo.D, 63);
		productos[5] = new Electrodomestico(5, Color.gris, Consumo.E, 12);
		productos[6] = new Lavadora(50, 60);
		productos[7] = new Lavadora(Color.blanco, Consumo.F, 60, 90, 35);
		productos[8] = new Television(5, 5);
		productos[9] = new Television(Color.azul, Consumo.D, 200, 50, 45, true);

		for (int i = 0; i < productos.length; i++) {
			productos[i].precioFinal();
			System.out.println("Precio: " + productos[i].precioBase);
			if (productos[i].getClass().getName().equals("ejercicio4.Electrodomestico")) {
				precioElect += productos[i].getPrecioBase();
			} else if (productos[i].getClass().getName().equals("ejercicio4.Lavadora")) {
				precioLava += productos[i].getPrecioBase();
			} else if (productos[i].getClass().getName().equals("ejercicio4.Television")) {
				precioTele += productos[i].getPrecioBase();
			}
		}

		System.out.println();
		System.out.println("Precio clase Electrodomésticos: " + precioElect);
		System.out.println("Precio clase Lavadora: " + precioLava);
		System.out.println("Precio clase Televisión: " + precioTele);
		System.out.println();
		precioSumaElectrodomesticos = precioElect + precioLava + precioTele;
		System.out.println("Precio suma Electrodomésticos: " + precioSumaElectrodomesticos);

	}

}
