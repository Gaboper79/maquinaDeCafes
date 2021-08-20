package maquinasDeCafe;

public class MaquinaEconomica extends MaquinaDeCafe {

	private int contadorDeServicios = 0;

	@Override
	public void restarCafe() {
		this.contadorDeServicios++;
		if (contadorDeServicios % 3 == 0) {
			super.restarCafe();
			this.contadorDeServicios = 0;
		}

	}

}
