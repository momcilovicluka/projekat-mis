package kontrolKlase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import klaseSaAtributima.Clan;
import klaseSaAtributima.Korisnik;

public class ClanKontroler {
	public static Map<String, Korisnik> pretraziClana(String pretraga)
			throws ParseException, NumberFormatException, IllegalArgumentException, IOException {
		if (pretraga == null)
			return null;

		try (BufferedReader br = new BufferedReader(new FileReader("res/korisnici.csv"))) {
			Map<String, Korisnik> clanovi = new HashMap<String, Korisnik>();
			String line = "";

			while ((line = br.readLine()) != null) {
				if (!line.contains(pretraga))
					continue;

				String[] tokens = line.split(",");
				String ime = tokens[0].trim();
				String prezime = tokens[1].trim();
				String username = tokens[2].trim();
				String password = tokens[3].trim();
				String tip = tokens[4].trim();

				if ("C".equals(tip))
					clanovi.put(username, new Clan(ime, prezime, username, password));
			}

			return clanovi;
		}
	}

	public static boolean sacuvajClana(Clan c) {
		try {
			Files.write(Paths.get("res/korisnici.csv"), c.toStringFile().getBytes(), StandardOpenOption.APPEND);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
