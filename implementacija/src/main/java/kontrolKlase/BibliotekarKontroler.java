package kontrolKlase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import klaseSaAtributima.Bibliotekar;

public class BibliotekarKontroler {
	public static boolean sacuvajBibliotekara(Bibliotekar b) {
		try {
			Files.write(Paths.get("res/korisnici.csv"), b.toStringFile().getBytes(), StandardOpenOption.APPEND);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}