package ar.edu.unlam.tp1;

import static org.junit.Assert.*;
import org.junit.Test;

public class CirculoTest {

	@Test
	public void crearUnCirculoConRadio2() {
		Circulo circulo = new Circulo(2.0);
		Double valorRadioEsperado = 2.0;
		Double valorRadioObtenido = circulo.getRadio();
		assertEquals(valorRadioEsperado.doubleValue(), valorRadioObtenido.doubleValue(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo circulo = new Circulo(3.7);
		Double valorRadioEsperado = 3.7;
		Double valorRadioObtenido = circulo.getRadio();
		assertEquals(valorRadioEsperado.doubleValue(), valorRadioObtenido.doubleValue(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo circulo = new Circulo(5.0);
		Double valorRadioEsperado = 5.0;
		Double valorRadioObtenido = circulo.getRadio();
		assertEquals(valorRadioEsperado.doubleValue(), valorRadioObtenido.doubleValue(), 0.01);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo circulo = new Circulo(10.9);
		Double valorRadioEsperado = 10.9;
		Double valorRadioObtenido = circulo.getRadio();
		assertEquals(valorRadioEsperado.doubleValue(), valorRadioObtenido.doubleValue(), 0.01);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio9Punto8Es61Punto57() {
		Circulo circulo = new Circulo(9.8);
		Double valorRadioEsperado = 61.57;//
		Double valorRadioObtenido = circulo.getPerimetro();
		assertEquals(valorRadioEsperado.doubleValue(), valorRadioObtenido.doubleValue(), 0.01);
	}
	
	@Test
	public void queElPerimetroDeUnCirculoConRadio16Punto6Es104Punto3() {
		Circulo circulo = new Circulo(16.6);
		Double valorRadioEsperado = 104.30;
		Double valorRadioObtenido = circulo.getPerimetro();
		assertEquals(valorRadioEsperado.doubleValue(), valorRadioObtenido.doubleValue(), 0.01);
	}
}
