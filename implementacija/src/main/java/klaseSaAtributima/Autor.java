package klaseSaAtributima;

import java.util.Date;

public class Autor {
	private static int brojId = 0;

	private int idA;
	private String ime;
	private String prezime;
	private Date datumRodjenja;

	public Autor(String ime, String prezime, Date datumRodjenja) throws IllegalArgumentException {
		super();
		this.idA = noviId();
		this.setIme(ime);
		this.setPrezime(prezime);
		this.setDatumRodjenja(datumRodjenja);
	}

	public Autor(int idA, String ime, String prezime, Date datumRodjenja) {
		this.idA = idA;
		this.setIme(ime);
		this.setPrezime(prezime);
		this.setDatumRodjenja(datumRodjenja);
	}

	public int getIdA() {
		return idA;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public Date getDatumRodjenja() {
		return datumRodjenja;
	}

	public void setIme(String ime) {
		if (ime == null || "".equals(ime))
			throw new IllegalArgumentException("Ime ne sme biti prazno!");
		this.ime = ime;
	}

	public void setPrezime(String prezime) {
		if (prezime == null || "".equals(prezime))
			throw new IllegalArgumentException("Prezime ne sme biti prazno!");

		this.prezime = prezime;
	}

	public void setDatumRodjenja(Date datumRodjenja) {
		if (datumRodjenja == null)
			throw new IllegalArgumentException("Datum rođenja ne sme biti prazan!");

		this.datumRodjenja = datumRodjenja;
	}

	private static int noviId() {
		return brojId++;
	}
}
