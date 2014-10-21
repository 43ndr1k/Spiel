import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Spielfeld {
	
	private ArrayList<Auto> autos = new ArrayList<Auto>();
	private String tipp;
	private String loesung;
	private String item;
	private String quelle; // Name der Text-Datei
	// path = Ordner
	private String path1 = "Spielfelder";
	private String path2 = "Tipps";
	private String path3 = "Loesungen";

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
	
	public ArrayList<Auto> getAutos() {
		return autos;
	}
	
	// TODO auto
	public void restart() {
		/**
		 * Jedes Spielfeld als eigene Text-Datei speichern. Die Autos mit ihren
		 * Eigenschaften sind dort aufgelistet. Hier muss noch das Einlesen
		 * erg�nzt werden!
		 */

		TxtLesen a = new TxtLesen(quelle, path1, autos);
		TxtLesen t = new TxtLesen(quelle, path2);
		TxtLesen q = new TxtLesen(quelle, path3);
		
		autos = a.getAutos();
		
		

		
		// Auch der Tipp und die L�sung stehen mit in der txt.
		tipp = t.getItem();
		loesung = q.getItem();
		System.out.println("tipp:"+tipp+"\n"+"loesung:"+loesung);
		
	}


	


}
