package klaseSaAtributima;

import kontrolKlase.ClanKontroler;

public class Clan extends Korisnik {
	private static int brojId = 0;

	static {
		try {
			Clan.brojId = ClanKontroler.pretraziClana("").keySet().size();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private int idc;

	public Clan(String ime, String prezime, String username, String password) throws IllegalArgumentException {
		super(ime, prezime, username, password);
		this.idc = noviId();
	}

	public Clan(int idC, String ime, String prezime, String username, String password) throws IllegalArgumentException {
		super(ime, prezime, username, password);
		this.idc = idC;
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

	public String toStringFile() {
		StringBuilder stringZaFile = new StringBuilder();
		String separator = ",";

		stringZaFile.append(this.getIdc());
		stringZaFile.append(separator);
		stringZaFile.append(this.getIme());
		stringZaFile.append(separator);
		stringZaFile.append(this.getPrezime());
		stringZaFile.append(separator);
		stringZaFile.append(this.getUsername());
		stringZaFile.append(separator);
		stringZaFile.append(this.getPassword());
		stringZaFile.append("\n");

		return stringZaFile.toString();
	}
}
