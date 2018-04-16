package myproducts;

public class Products {

	private String nev;
	private int netto;
	private int afakulcs;
	
	public int brutto() {
		return (int) (netto * (1 + afakulcs / 100.0));
	}

	@Override
	public String toString() {
		return "Products [nev=" + nev + ", afakulcs=" + afakulcs
				+ ", brutto()=" + brutto() + "]";
	}
	public void netto_novel (int szazalek) {
		netto = (int)(netto * (1+ szazalek / 100.0));
	}
	public int dragabb_e(Products masik_aru) {
		if (brutto() > masik_aru.brutto()){
			return 1;
		} else if (brutto() < masik_aru.brutto()){
				return -1;
			} else {
				return 0;
			}
		
		}
	
	
	
	
}
