package klaseSaAtributima;

public class Clan extends Korisnik {
	private static int brojId = 0;
	private int idc;

	public Clan(String ime, String prezime, String username, String password) throws IllegalArgumentException {
		super(ime, prezime, username, password);
		this.idc = noviId();
	}

	public int getIdc() {
		return idc;
	}

	public void setIdc(int idc) {
		this.idc = idc;
	}

	private static int noviId() {
		return brojId++;
	}
}
