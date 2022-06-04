package kontrolKlase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import klaseSaAtributima.Autor;
import klaseSaAtributima.Knjiga;
import klaseSaAtributima.Zanr;

public class KnjigaKontroler {
	public static Map<Integer, Knjiga> pronadjiKnjigu(String pretraga)
			throws FileNotFoundException, IOException, NumberFormatException, ParseException {
		if (pretraga == null)
			return null;

		try (BufferedReader br = new BufferedReader(new FileReader("res/knjige.csv"))) {
			String line = "";
			Map<Integer, Knjiga> knjige = new HashMap<Integer, Knjiga>();

			while ((line = br.readLine()) != null) {
				if (!line.toLowerCase().contains(pretraga.toLowerCase()))
					continue;

				String[] tokens = line.split(",");

				int idK = Integer.parseInt(tokens[0].trim());
				String naziv = tokens[1].trim();
				Autor autor = AutorKontroler.pronadjiAutora(tokens[2].trim()).get(Integer.parseInt(tokens[2].trim()));
				int brojStrana = Integer.parseInt(tokens[3].trim());
				String izdavac = tokens[4].trim();
				int brojNaStanju = Integer.parseInt(tokens[5].trim());
				int ukupanBroj = Integer.parseInt(tokens[6].trim());
				Zanr zanr = ZanrKontroler.pronadjiZanr(tokens[7].trim()).get(Integer.parseInt(tokens[7].trim()));

				knjige.put(idK, new Knjiga(idK, naziv, autor, zanr, izdavac, brojStrana, brojNaStanju, ukupanBroj));
			}

			return knjige;
		}
	}
}
