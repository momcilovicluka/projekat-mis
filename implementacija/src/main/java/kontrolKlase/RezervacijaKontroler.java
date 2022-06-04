package kontrolKlase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import klaseSaAtributima.Clan;
import klaseSaAtributima.Knjiga;
import klaseSaAtributima.Rezervacija;

public class RezervacijaKontroler {
	public static List<Rezervacija> pretraziRezervaciju(String pretraga) throws IOException, ParseException {
		if (pretraga == null)
			return null;

		try (BufferedReader br = new BufferedReader(new FileReader("res/rezervacije.csv"))) {
			String line = "";
			List<Rezervacija> rezervacije = new ArrayList<Rezervacija>();

			while ((line = br.readLine()) != null) {
				if (!line.contains(pretraga))
					continue;

				String[] tokens = line.split(",");

				Knjiga knjiga = KnjigaKontroler.pronadjiKnjigu(tokens[0].trim())
						.get(Integer.parseInt(tokens[0].trim()));
				Clan clan = (Clan) ClanKontroler.pretraziClana(tokens[1].trim()).get(tokens[1].trim());

				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
				Date datumRezervisanja = formatter.parse(tokens[2].trim());

				rezervacije.add(new Rezervacija(knjiga, clan, datumRezervisanja));
			}

			return rezervacije;
		}
	}
}
