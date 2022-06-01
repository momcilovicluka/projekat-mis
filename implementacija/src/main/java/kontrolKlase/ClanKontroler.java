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

public class ClanKontroler {
	public static Map<Integer, Clan> pretraziClana(String pretraga)
			throws ParseException, NumberFormatException, IllegalArgumentException, IOException {
		if (pretraga == null)
			return null;

		if ("".equals(pretraga))
			throw new IllegalArgumentException("Polje za pretragu ne sme biti prazno!");

		try (BufferedReader br = new BufferedReader(new FileReader("res/korisnici.csv"))) {
			Map<Integer, Clan> clanovi = new HashMap<Integer, Clan>();
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

				clanovi.put(idC, new Clan(idC, ime, prezime, username, password));
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
