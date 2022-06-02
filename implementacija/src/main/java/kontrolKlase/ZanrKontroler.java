package kontrolKlase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.HashMap;
import java.util.Map;

import klaseSaAtributima.Zanr;

public class ZanrKontroler {
	public static Map<Integer, Zanr> pronadjiZanr(String pretraga)
			throws FileNotFoundException, IOException, IllegalArgumentException {
		if (pretraga == null)
			return null;

		try (BufferedReader br = new BufferedReader(new FileReader("res/zanrovi.csv"))) {
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

	public static boolean sacuvajZanr(Zanr z) {
		try {
			if (pronadjiZanr("").values().toString().contains(z.getNaziv()))
				return false;
			Files.write(Paths.get("res/zanrovi.csv"), z.toStringFile().getBytes(), StandardOpenOption.APPEND);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
