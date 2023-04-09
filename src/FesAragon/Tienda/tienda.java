package FesAragon.Tienda;

import java.util.ArrayList;
import FesAragon.Camisa.camisa;

public class tienda {
	
	public static String Descuento(ArrayList<camisa> carrito) {
		int no_Camisas = 0;
		String descuento = "";
		for (camisa camisa : carrito) {
			no_Camisas++;			
		}
		if (no_Camisas <= 2) {
			descuento = "sin descuento";
			System.out.println(descuento);
		} else if (no_Camisas >= 3 && no_Camisas <= 5) {
			descuento = "Descuento del 5%";
			System.out.println(descuento);
		} else if (no_Camisas > 5) {
			descuento = "Descuento del 8%";
			System.out.println(descuento);
		}
		return descuento;
	}
	
	public static float Precio(ArrayList<camisa> carrito) {
		float descuento = 0;
		int no_Camisas = 0;
		float precio = 0;
		for (camisa camisa : carrito) {
			no_Camisas++;	
			precio += camisa.getPrecio();	
		}
		if (no_Camisas <= 2) {
			System.out.println("sin descuento\nDescuento: $0");
		} else if (no_Camisas >= 3 && no_Camisas <= 5) {
			System.out.println("Descuento del 5%");
			descuento = precio * 0.05f;
			System.out.println("Descuento: $" + descuento);
			precio = precio-descuento;
		} else if (no_Camisas > 5) {
			System.out.println("Descuento del 8%");
			descuento = precio * 0.08f;
			System.out.println("Descuento: $" + descuento);
			precio = precio-descuento;
		}
		return precio;
	}
}
