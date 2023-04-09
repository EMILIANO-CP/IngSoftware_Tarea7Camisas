package FesAragon.Tienda;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import FesAragon.Camisa.camisa;

class tiendaTest {

	@Test
	void testDescuento() {
		camisa camisa1 = new camisa("corta", "sin tipo");
		camisa camisa2 = new camisa("larga", "casual");
		camisa camisa3 = new camisa("larga", "formal");
		camisa camisa4 = new camisa("larga", "casual");
		camisa camisa5 = new camisa("larga", "formal");
		camisa camisa6 = new camisa("corta", "sin tipo");
		
		ArrayList<camisa> lista = new ArrayList<camisa>();
		ArrayList<camisa> lista1 = new ArrayList<camisa>();
		ArrayList<camisa> lista2 = new ArrayList<camisa>();
		
		lista.add(camisa1);
		lista.add(camisa2);
		
		lista1.add(camisa1);
		lista1.add(camisa2);
		lista1.add(camisa3);
		
		lista2.add(camisa1);
		lista2.add(camisa2);
		lista2.add(camisa3);
		lista2.add(camisa4);
		lista2.add(camisa5);
		lista2.add(camisa6);
		
		String expectativa [] = {tienda.Descuento(lista),tienda.Descuento(lista1),tienda.Descuento(lista2)};
		String realidad [] = {"sin descuento", "Descuento del 5%","Descuento del 8%"};
		
		assertTrue(expectativa[0]==realidad[0]&&
				expectativa[1]==realidad[1]&&
				expectativa[2]==realidad[2]);
	}

	@Test
	void testPrecio() {
		camisa camisa1 = new camisa("corta", "sin tipo");
		camisa camisa2 = new camisa("larga", "casual");
		camisa camisa3 = new camisa("larga", "formal");
		
		ArrayList<camisa> lista = new ArrayList<camisa>();
		
		lista.add(camisa1);
		lista.add(camisa2);
		lista.add(camisa3);
		
		assertEquals(693.5f, tienda.Precio(lista));
	}

}
