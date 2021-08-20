package maquinasDeCafe;

public class MaquinaEstafadora extends MaquinaPremium {
	private boolean yaEstafe = false;

	@Override
	public VasoDeCafe servirCafe() {
		if (yaEstafe) {
			this.yaEstafe = false;
			return super.servirCafe();
		} else {
			this.yaEstafe = true;
			return new VasoDeCafe(false);
		}
	}

	private void syso() {
		// TODO Auto-generated method stub

	}
}
