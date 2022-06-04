package klaseSaAtributima;

public class Clan extends Korisnik {
	public Clan(String ime, String prezime, String username, String password) throws IllegalArgumentException {
		super(ime, prezime, username, password);
	}

	public String toStringFile() {
		StringBuilder stringZaFile = new StringBuilder();
		String separator = ",";

		stringZaFile.append(this.getIme());
		stringZaFile.append(separator);
		stringZaFile.append(this.getPrezime());
		stringZaFile.append(separator);
		stringZaFile.append(this.getUsername());
		stringZaFile.append(separator);
		stringZaFile.append(this.getPassword());
		stringZaFile.append("\n");

		return stringZaFile.toString();
	}

	public String toString() {
		return ime + " " + prezime + " - " + username;
	}
}
