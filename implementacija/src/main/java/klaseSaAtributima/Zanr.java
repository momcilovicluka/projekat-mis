package klaseSaAtributima;

public class Zanr {
	private static int brojId = 0;

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
}
