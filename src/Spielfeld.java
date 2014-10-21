import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Spielfeld {
	private ArrayList<Auto> autos = new ArrayList<Auto>();
	private ArrayList<String> tipps = new ArrayList<String>();
	private ArrayList<String> loesungen = new ArrayList<String>();
	
	
	
	private String tipp;
	private String loesung;
	private String quelle; // Name der Text-Datei
	private String path = "Spielfelder";

	public Spielfeld(String q) {
		
		quelle = q;
		restart();
	}

	public String getTipp() {
		return tipp;
	}

	public String getLoesung() {
		return loesung;
	}

	// TODO auto
	public void restart() {
		/**
		 * Jedes Spielfeld als eigene Text-Datei speichern. Die Autos mit ihren
		 * Eigenschaften sind dort aufgelistet. Hier muss noch das Einlesen
		 * erg�nzt werden!
		 */

		

		
		// Auch der Tipp und die L�sung stehen mit in der txt.
		tipp = "";
		quelle = "";
	}

	public ArrayList<Auto> getAutos() {
		return autos;
	}

}
