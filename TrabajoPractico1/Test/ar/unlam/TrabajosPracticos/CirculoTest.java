package ar.unlam.TrabajosPracticos;
import org.junit.Assert;
import org.junit.Test;

public class CirculoTest {
	
	@Test
	public void testMostrarRadioDe2Punto0(){
		// preparacion
		Double radio=2.0;
		Circulo miCirculo = new Circulo(2.0);
		Double valorEsperado;
		Double valorCalculado;
		// ejecucion
		valorEsperado=2.0;
		valorCalculado=miCirculo.mostrarRadio();
		//constrastacion
		Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
	}
		
		@Test
		public void testMostrarRadioDe3punto7(){
			// preparacion
			Double radio=3.7;
			Circulo miCirculo = new Circulo(3.7);
			Double valorEsperado;
			Double valorCalculado;
			// ejecucion
			valorEsperado=3.7;
			valorCalculado=miCirculo.mostrarRadio();
			//constrastacion
			Assert.assertEquals(valorEsperado, valorCalculado, 0.01);	
		
	}
		
		@Test
		public void testMostrarRadioDe5Punto0(){
			// preparacion
			Double radio=5.0;
			Circulo miCirculo = new Circulo(5.0);
			Double valorEsperado;
			Double valorCalculado;
			// ejecucion
			valorEsperado=5.0;
			valorCalculado=miCirculo.mostrarRadio();
			//constrastacion
			Assert.assertEquals(valorEsperado, valorCalculado, 0.01);	
	}
	
		@Test
		public void testMostrarRadioDe10Punto9(){
			// preparacion
			Double radio=10.9;
			Circulo miCirculo = new Circulo(10.9);
			Double valorEsperado;
			Double valorCalculado;
			// ejecucion
			valorEsperado=10.9;
			valorCalculado=miCirculo.mostrarRadio();
			//constrastacion
			Assert.assertEquals(valorEsperado, valorCalculado, 0.01);	
	}	
	
		@Test
		public void testMostrarRadioDe9Punto8(){
			// preparacion
			Double radio=9.8;
			Circulo miCirculo = new Circulo(9.8);
			Double valorEsperado;
			Double valorCalculado;
			// ejecucion
			valorEsperado=9.8;
			valorCalculado=miCirculo.mostrarRadio();
			//constrastacion
			Assert.assertEquals(valorEsperado, valorCalculado, 0.01);	
	}	
		
		@Test
		public void testMostrarRadioDe16Punto6(){
			// preparacion
			Double radio=16.6;
			Circulo miCirculo = new Circulo(16.6);
			Double valorEsperado;
			Double valorCalculado;
			// ejecucion
			valorEsperado=16.6;
			valorCalculado=miCirculo.mostrarRadio();
			//constrastacion
			Assert.assertEquals(valorEsperado, valorCalculado, 0.01);	
	}	
		
	@Test
	public void testDeQueElPerimetroSeaElEsperadoParaUnCirculoDeRadio9Punto8(){
		//preparacion
		Double radio=9.80;
		Circulo miCirculo = new Circulo(9.80);
		Double valorEsperado;
		Double valorCalculado;
		//ejecucion
		valorEsperado=615.73;
		valorCalculado=miCirculo.calcularPerimetro();
		//contrastacion
		Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
	}
	
	@Test
	public void testDeQueElPerimetroSeaElEsperadoParaUnCirculoDeRadio16Punto6(){
		//preparacion
		Double radio=16.6;
		Circulo miCirculo = new Circulo(16.6);
		Double valorEsperado;
		Double valorCalculado;
		//ejecucion
		valorEsperado=865.67;
		valorCalculado=miCirculo.calcularPerimetro();
		//contrastacion
		Assert.assertEquals(valorEsperado, valorCalculado, 0.01);
	}
	
}
