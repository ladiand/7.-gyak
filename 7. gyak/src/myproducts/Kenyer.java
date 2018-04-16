package myproducts;

public class Kenyer extends Products {

	private double mennyiseg;

	public Kenyer(String nev, int netto, int afakulcs) {
		super(nev, netto, afakulcs);
		this.mennyiseg = mennyiseg;
	}
	@Override
	public String toString() {
		return "Kenyer [" + super.toString() + brutto() / mennyiseg + "]";
	}
	public double getMennyiseg() {
		return mennyiseg;
	}
	
	public static boolean elso_kenyer_nagyobb_egysegaru(Kenyer elso_kenyer, Kenyer masodik_kenyer) {
		return elso_kenyer.brutto() / elso_kenyer.mennyiseg > masodik_kenyer.brutto() / masodik_kenyer.brutto();
		
	}


	
}
