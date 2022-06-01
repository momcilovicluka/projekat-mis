package kontrolKlase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import klaseSaAtributima.Knjiga;

public class DodavanjeKnjigeKontroler {
	public static boolean sacuvajKnjigu(Knjiga k) {
		// PrintWriter append = new PrintWriter(new BufferedWriter(new
		// FileWriter("Knjige.csv", true)))
		try {
			Files.write(Paths.get("res/knjige.csv"), k.toStringFile().getBytes(), StandardOpenOption.APPEND);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
}
