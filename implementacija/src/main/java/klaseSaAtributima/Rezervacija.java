package klaseSaAtributima;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Rezervacija {
	private Knjiga knjiga;
	private Clan clan;
	private Date datumRezervisanja;

	public Rezervacija(Knjiga knjiga, Clan clan, Date datumRezervisanja) throws IllegalArgumentException {
		super();
		this.setKnjiga(knjiga);
		this.setClan(clan);
		this.setDatumRezervisanja(datumRezervisanja);
	}

	public Knjiga getKnjiga() {
		return knjiga;
	}

	public Clan getClan() {
		return clan;
	}

	public Date getDatumRezervisanja() {
		return datumRezervisanja;
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

	public void setDatumRezervisanja(Date datumRezervisanja) {
		if (datumRezervisanja == null)
			throw new IllegalArgumentException("Datum rezervisanja mora biti prosleđen!");

		this.datumRezervisanja = datumRezervisanja;
	}

	@Override
	public String toString() {
		return knjiga.getNaziv() + " - " + clan.getIme() + " " + clan.getPrezime() + " - "
				+ new SimpleDateFormat("yyyy-MM-dd").format(datumRezervisanja);
	}
}
