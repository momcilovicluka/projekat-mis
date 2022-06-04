package klaseSaAtributima;

import java.text.SimpleDateFormat;
import java.util.Date;

import kontrolKlase.AutorKontroler;

public class Autor {
	private static int brojId = 0;

	static {
		try {
			Autor.brojId = AutorKontroler.pronadjiAutora("").keySet().size();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("[").append(idA).append("] ");
		if (ime != null)
			builder.append(ime + " ");
		if (prezime != null)
			builder.append(prezime).append(", ");
		if (datumRodjenja != null)
			builder.append(new SimpleDateFormat("yyyy-MM-dd").format(this.getDatumRodjenja()));
		return builder.toString();
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

	public String toStringFile() {
		StringBuilder stringZaFile = new StringBuilder();
		String separator = ",";

		stringZaFile.append(this.getIdA());
		stringZaFile.append(separator);
		stringZaFile.append(this.getIme());
		stringZaFile.append(separator);
		stringZaFile.append(this.getPrezime());
		stringZaFile.append(separator);
		stringZaFile.append(new SimpleDateFormat("yyyy-MM-dd").format(this.getDatumRodjenja()));
		stringZaFile.append("\n");

		return stringZaFile.toString();
	}
}
