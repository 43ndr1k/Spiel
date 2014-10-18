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

			File dir = new File(path);

			FileReader lvl;
			try {
				try {
					lvl = new FileReader(path + "/" + quelle);
					BufferedReader in = new BufferedReader(lvl);
					String zeile = null;
					while ((zeile = in.readLine()) != null) {
						System.out.println("Gelesene Zeile: " + zeile);

						String[] items = zeile.split(";");	
						//TODO
						// Hier muss noch die richtige Dastellung eingepflegt werden. Wie soll die Autoliste dagestellt werden.
						autos.add(new Auto(items[0],Integer.parseInt(items[1]),Integer.parseInt(items[2]),items[3].charAt(0),Integer.parseInt(items[4])));
						
					}
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		
		// Auch der Tipp und die L�sung stehen mit in der txt.
		tipp = "";
		quelle = "";
	}

	public ArrayList<Auto> getAutos() {
		return autos;
	}

}
