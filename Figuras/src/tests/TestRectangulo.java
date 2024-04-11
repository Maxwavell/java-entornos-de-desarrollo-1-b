package tests;
import modelos.Rectangulo;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class TestRectangulo {

	static Rectangulo r1;
	static Rectangulo r2;
	
	@BeforeAll
	static void setup() {
		r1 = new Rectangulo();
		r2 = new Rectangulo(3,2);
	}
	@Test
	void areaR1() {
		double areaEsperada = 1;
		double areaObtenida = r1.area();
		assertEquals(areaEsperada, areaObtenida);
	}
	
	@Test
	void areaR2() {
		double areaEsperada = 6;
		double areaObtenida = r2.area();
		assertEquals(areaEsperada, areaObtenida);
	}
	@Test
	void perimetroR1() {
		double areaEsperada = 4;
		double areaObtenida = r1.perimetro();
		assertEquals(areaEsperada, areaObtenida);
	}
	
	@Test
	void perimetroR2() {
		double areaEsperada = 10;
		double areaObtenida = r2.perimetro();
		assertEquals(areaEsperada, areaObtenida);
	}
	}
