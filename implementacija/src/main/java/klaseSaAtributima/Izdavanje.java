package klaseSaAtributima;

import java.util.Date;

public class Izdavanje {
	private Knjiga knjiga;
	private Clan clan;
	private Date datumIzdavanja, rokZaVracanje;

	public Izdavanje(Knjiga knjiga, Clan clan, Date datumIzdavanja, Date rokZaVracanje)
			throws IllegalArgumentException {
		super();
		this.setKnjiga(knjiga);
		this.setClan(clan);
		this.setDatumIzdavanje(datumIzdavanja);
		this.setRokZaVracanje(rokZaVracanje);
	}

	public Knjiga getKnjiga() {
		return knjiga;
	}

	public Clan getClan() {
		return clan;
	}

	public Date getDatumIzdavanja() {
		return datumIzdavanja;
	}

	public Date getRokZaVracanje() {
		return rokZaVracanje;
	}

	public void setKnjiga(Knjiga knjiga) {
		if (knjiga == null)
			throw new IllegalArgumentException("Knjiga mora biti prosleđena!");

		this.knjiga = knjiga;
	}

	public void setClan(Clan clan) {
		if (clan == null)
			throw new IllegalArgumentException("Član mora biti prosleđen!");

		this.clan = clan;
	}

	public void setDatumIzdavanje(Date datumIzdavanja) {
		if (datumIzdavanja == null)
			throw new IllegalArgumentException("Datum izdavanja mora biti prosleđen!");

		this.datumIzdavanja = datumIzdavanja;
	}

	public void setRokZaVracanje(Date rokZaVracanje) {
		if (rokZaVracanje == null)
			throw new IllegalArgumentException("Rok za vraćanje mora biti prosleđen!");

		this.rokZaVracanje = rokZaVracanje;
	}
}
