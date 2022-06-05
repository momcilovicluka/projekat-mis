package kontrolKlase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import klaseSaAtributima.Izdavanje;

public class IzdavanjeRezervacijeKontroler {
	public static boolean sacuvajIzdavanje(Izdavanje i) {
		try {
			Files.write(Paths.get("res/izdavanja.csv"), i.toStringFile().getBytes(), StandardOpenOption.APPEND);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
