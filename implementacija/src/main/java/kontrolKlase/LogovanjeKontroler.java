Spackage kontrolKlase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import klaseSaAtributima.Admin;
import klaseSaAtributima.Bibliotekar;
import klaseSaAtributima.Clan;
import klaseSaAtributima.Korisnik;

public class LogovanjeKontroler {
	public static Korisnik prijava(String paramUsername, String paramPassword)
			throws IOException, IllegalArgumentException {
		if (paramUsername == null || paramPassword == null)
			return null;

		if ("".equals(paramUsername))
			throw new IllegalArgumentException("Username polje ne sme biti prazno!");

		if ("".equals(paramPassword))
			throw new IllegalArgumentException("Password polje ne sme biti prazno!");

		try (BufferedReader br = new BufferedReader(new FileReader("res/korisnici.csv"))) {
			String line = "";

			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(",");

				String ime = tokens[0].trim();
				String prezime = tokens[1].trim();
				String username = tokens[2].trim();
				String password = tokens[3].trim();
				String tip = tokens[4].trim();

				Korisnik korisnik = switch (tip) {
				case "A" -> new Admin(ime, prezime, username, password);
				case "B" -> new Bibliotekar(ime, prezime, username, password);
				default -> new Clan(ime, prezime, username, password);
				};

				if (korisnik.getUsername().equals(paramUsername) && korisnik.getPassword().equals(paramPassword))
					return korisnik;
			}
		}

		return null;
	}
}
