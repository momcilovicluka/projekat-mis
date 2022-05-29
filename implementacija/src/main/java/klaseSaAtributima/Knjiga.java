package klaseSaAtributima;

public class Knjiga {
	private static int brojId = 0;

	private int idk;
	private String naziv;
	private Autor autor;
	private Zanr zanr;
	private String izdavac;
	private int brojStrana;
	private int brojNaStanju;
	private int ukupanBroj;

	public Knjiga(String naziv, Autor autor, Zanr zanr, String izdavac, int brojStrana, int brojNaStanju,
			int ukupanBroj) throws IllegalArgumentException {
		super();
		this.idk = noviId();
		this.setNaziv(naziv);
		this.setAutor(autor);
		this.setZanr(zanr);
		this.setIzdavac(izdavac);
		this.setBrojStrana(brojStrana);
		this.setBrojNaStanju(brojNaStanju);
		this.setUkupanBroj(ukupanBroj);
	}

	public int getIdk() {
		return idk;
	}

	public String getNaziv() {
		return naziv;
	}

	public Autor getAutor() {
		return autor;
	}

	public Zanr getZanr() {
		return zanr;
	}

	public String getIzdavac() {
		return izdavac;
	}

	public int getBrojStrana() {
		return brojStrana;
	}

	public int getBrojNaStanju() {
		return brojNaStanju;
	}

	public int getUkupanBroj() {
		return ukupanBroj;
	}

	public void setNaziv(String naziv) {
		if (naziv == null || naziv.equals(""))
			throw new IllegalArgumentException("Naziv ne sme biti prazan!");

		this.naziv = naziv;
	}

	public void setAutor(Autor autor) {
		if (autor == null)
			throw new IllegalArgumentException("Autor nije prosledjen!");

		this.autor = autor;
	}

	public void setZanr(Zanr zanr) {
		if (zanr == null)
			throw new IllegalArgumentException("Žanr nije prosleđen!");

		this.zanr = zanr;
	}

	public void setIzdavac(String izdavac) {
		if (izdavac == null || izdavac.equals(""))
			throw new IllegalArgumentException("Izdavač ne sme biti prazan!");

		this.izdavac = izdavac;
	}

	public void setBrojStrana(int brojStrana) {
		if (brojStrana <= 0)
			throw new IllegalArgumentException("Knjiga ne može imati prosleđen broj strana!");

		this.brojStrana = brojStrana;
	}

	public void setBrojNaStanju(int brojNaStanju) {
		if (brojNaStanju < 0)
			throw new IllegalArgumentException("Prosleđen broj na stanju je nedozvoljen!");

		this.brojNaStanju = brojNaStanju;
	}

	public void setUkupanBroj(int ukupanBroj) {
		if (ukupanBroj <= 0)
			throw new IllegalArgumentException("Prosleđen ukupan broj knjige je nedozvoljen!");
		this.ukupanBroj = ukupanBroj;
	}

	private static int noviId() {
		return brojId++;
	}
}
