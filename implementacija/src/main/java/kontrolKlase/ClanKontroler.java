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

public class ClanKontroler {
	public static List<Clan> pretraziClana(String pretraga)
			throws ParseException, NumberFormatException, IllegalArgumentException, IOException {
		if (pretraga == null)
			return null;

		if ("".equals(pretraga))
			throw new IllegalArgumentException("Polje za pretragu ne sme biti prazno!");

		try (BufferedReader br = new BufferedReader(new FileReader("res/korisnici.csv"))) {
			List<Clan> clanovi = new ArrayList<Clan>();
			String line = "";

			while ((line = br.readLine()) != null) {
				if (!line.contains(pretraga))
					continue;

				String[] tokens = line.split(",");
				int idC = Integer.parseInt(tokens[0].trim());
				String ime = tokens[1].trim();
				String prezime = tokens[2].trim();
				String username = tokens[3].trim();
				String password = tokens[4].trim();

				clanovi.add(new Clan(idC, ime, prezime, username, password));
			}

			return clanovi;
		}
	}
}