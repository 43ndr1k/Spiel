import java.util.ArrayList;

public class Spielfeld {
	
	private TxtLesen spielfeld = null;
	private String quelle; // Name der Text-Datei

	public Spielfeld(String q) {	
		quelle = q;
		spielfeld = new TxtLesen(quelle);
	}

	public String getTipp() {
		return spielfeld.getTipp();
	}

	public String getLoesung() {
		return spielfeld.getLoesung();
	}
	
	public ArrayList<Auto> getAutos() {
		return spielfeld.getList();
	}
}
