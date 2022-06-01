package klaseSaAtributima;

import kontrolKlase.ZanrKontroler;

public class Zanr {
	private static int brojId = 0;

	static {
		try {
			Zanr.brojId = ZanrKontroler.pronadjiZanr("").keySet().size();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int idZ;
	private String naziv;

	public Zanr(String naziv) throws IllegalArgumentException {
		super();
		this.idZ = noviId();
		this.setNaziv(naziv);
	}

	public Zanr(int idZ, String naziv) {
		this.setNaziv(naziv);
		this.idZ = idZ;
	}

	private static int noviId() {
		return brojId++;
	}

	public int getIdZ() {
		return idZ;
	}

	public String getNaziv() {
		return naziv;
	}

	public static void setBrojId(int brojId) {
		Zanr.brojId = brojId;
	}

	public void setNaziv(String naziv) {
		if (naziv == null || "".equals(naziv))
			throw new IllegalArgumentException("Naziv žanra ne sme biti prazan!");

		this.naziv = naziv;
	}

	public String toStringFile() {
		StringBuilder stringZaFile = new StringBuilder();
		String separator = ",";

		stringZaFile.append(this.getIdZ());
		stringZaFile.append(separator);
		stringZaFile.append(this.getNaziv());
		stringZaFile.append("\n");

		return stringZaFile.toString();
	}
}