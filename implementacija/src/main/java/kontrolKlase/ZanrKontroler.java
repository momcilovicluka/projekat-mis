package kontrolKlase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import klaseSaAtributima.Zanr;

public class ZanrKontroler {
	public static Map<Integer, Zanr> pronadjiZanr(String pretraga)
			throws FileNotFoundException, IOException, IllegalArgumentException {
		if (pretraga == null)
			return null;

		if ("".equals(pretraga))
			throw new IllegalArgumentException("Polje za pretragu ne može biti prazno!");

		try (BufferedReader br = new BufferedReader(new FileReader("res/zanrovi.txt"))) {
			Map<Integer, Zanr> zanrovi = new HashMap<Integer, Zanr>();
			String line = "";

			while ((line = br.readLine()) != null) {
				if (!line.contains(pretraga))
					continue;

				String[] tokens = line.split(",");
				int idZ = Integer.parseInt(tokens[0].trim());
				String naziv = tokens[1].trim();

				zanrovi.put(idZ, new Zanr(idZ, naziv));
			}

			return zanrovi;
		}
	}
}
