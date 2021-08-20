package maquinasDeCafe;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class MaquinaEstafadoraTEst {
	MaquinaDeCafe maquina;

	@Before
	public void setup() {
		maquina = new MaquinaEstafadora();
	}

	@Test
	public void puedeDevolverunVaso() {
		VasoDeCafe vaso = maquina.servirCafe();
		assertNotNull(vaso);
	}

}
