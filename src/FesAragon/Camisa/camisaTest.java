package FesAragon.Camisa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class camisaTest {

	@Test
	void testCamisa() {
		camisa camisa1 = new camisa("corta", "sin tipo");
		assertEquals(camisa1, camisa1);
	}

	@Test
	void testGetPrecio() {
		camisa camisa1 = new camisa("corta", "sin tipo");		
		camisa camisa2 = new camisa("larga", "casual");		
		camisa camisa3 = new camisa("larga", "formal");
		
		float realidad [] = {camisa1.getPrecio(),camisa2.getPrecio(),camisa3.getPrecio()};
		float expectativa [] = {190.0f,230.0f,310.0f};
		
		assertTrue(expectativa[0]==realidad[0]&&
				expectativa[1]==realidad[1]&&
				expectativa[2]==realidad[2]);
	}

	@Test
	void testGetManga() {
		camisa camisa1 = new camisa("corta", "sin tipo");		
		assertEquals("corta", camisa1.getManga());
	}

	@Test
	void testSetManga() {
		camisa camisa1 = new camisa("corta", "sin tipo");	
		camisa1.setManga("larga");
		assertEquals("larga", camisa1.getManga());
	}

	@Test
	void testGetTipo() {
		camisa camisa1 = new camisa("corta", "sin tipo");
		assertEquals("sin tipo", camisa1.getTipo());
	}

	@Test
	void testSetTipo() {
		camisa camisa1 = new camisa("corta", "sin tipo");	
		camisa1.setTipo("formal");
		assertEquals("formal", camisa1.getTipo());
	}

}
