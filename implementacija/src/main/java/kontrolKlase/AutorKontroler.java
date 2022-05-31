package kontrolKlase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import klaseSaAtributima.Autor;

public class AutorKontroler {
	public static List<Autor> pronadjiAutora(String pretraga)
			throws ParseException, IllegalArgumentException, FileNotFoundException, IOException {
		if (pretraga == null)
			return null;

		if ("".equals(pretraga))
			throw new IllegalArgumentException("Polje za pretragu ne sme biti prazno!");

		try (BufferedReader br = new BufferedReader(new FileReader("res/autori.csv"))) {
			List<Autor> autori = new ArrayList<Autor>();
			String line = "";

			while ((line = br.readLine()) != null) {
				if (!line.contains(pretraga))
					continue;

				String[] tokens = line.split(",");
				int idA = Integer.parseInt(tokens[0].trim());
				String ime = tokens[1].trim();
				String prezime = tokens[2].trim();

				SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");
				Date datumRodjenja = formatter.parse(tokens[3].trim());

				autori.add(new Autor(idA, ime, prezime, datumRodjenja));
			}

			return autori;
		}
	}
}
