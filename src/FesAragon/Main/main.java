package FesAragon.Main;

import java.util.ArrayList;

import FesAragon.Camisa.camisa;
import FesAragon.Tienda.tienda;

public class main {

	public static void main(String[] args) {
		camisa camisa1 = new camisa("corta", "sin tipo");
		camisa camisa2 = new camisa("larga", "casual");
		camisa camisa3 = new camisa("larga", "formal");
		camisa camisa4 = new camisa("larga", "casual");
		
		ArrayList<camisa> lista = new ArrayList<camisa>();
		
		lista.add(camisa1);
		lista.add(camisa2);
		lista.add(camisa3);
		lista.add(camisa4);
		
		System.out.println(tienda.Precio(lista));
	}

}
