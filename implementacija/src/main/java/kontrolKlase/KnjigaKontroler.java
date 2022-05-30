package kontrolKlase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import klaseSaAtributima.Autor;
import klaseSaAtributima.Knjiga;
import klaseSaAtributima.Zanr;

public class KnjigaKontroler {
	public static List<Knjiga> pronadjiKnjigu(String pretraga) throws FileNotFoundException, IOException {
		if (pretraga == null)
			return null;

		if ("".equals(pretraga))
			throw new IllegalArgumentException("Polje za pretragu ne sme biti prazno!");

		try (BufferedReader br = new BufferedReader(new FileReader("res/knjige.txt"))) {
			String line = "";
			List<Knjiga> knjige = new ArrayList<Knjiga>();

			while ((line = br.readLine()) != null) {
				if (!line.contains(pretraga))
					continue;

				String[] tokens = line.split(",");

				int idk = Integer.parseInt(tokens[0].trim());
				String naziv = tokens[1].trim();
				Autor autor = AutorKontroler.pronadjiAutora(tokens[2].trim());
				int brojStrana = Integer.parseInt(tokens[3].trim());
				String izdavac = tokens[4].trim();
				int brojNaStanju = Integer.parseInt(tokens[5].trim());
				int ukupanBroj = Integer.parseInt(tokens[6].trim());
				Zanr zanr = ZanrKontroler.pronadjiZanr(tokens[7].trim());

				knjige.add(new Knjiga(idk, naziv, autor, zanr, izdavac, brojStrana, brojNaStanju, ukupanBroj));
			}

			return knjige;
		}
	}
}
