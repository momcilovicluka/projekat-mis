package klaseSaAtributima;

public class Bibliotekar extends Korisnik {
	public Bibliotekar(String ime, String prezime, String username, String password) {
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
}
