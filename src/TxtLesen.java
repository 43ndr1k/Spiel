import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 */

/**
 * @author hendrik
 *
 */
public class TxtLesen {

	private String quelle;
	private ArrayList<Auto> autos = new ArrayList<Auto>();
	private String loesung = null;
	private String tipp = null;
	private String[] paths = {"Spielfelder","Tipps","Loesungen"};

	public TxtLesen(String quelle) {
		super();
		this.quelle = quelle;
		lese();
	}

	public ArrayList<Auto> getList() {
		return autos;
	}
	
	public String getTipp() {
		return tipp;
	}
	
	public String getLoesung() {
		return loesung;
	}
	
	private void lese(){

		FileReader lvl;
		try {
			try {
				for (String path: paths){
					lvl = new FileReader(path + "/" + quelle);
					BufferedReader in = new BufferedReader(lvl);
					String zeile = null;
					while ((zeile = in.readLine()) != null) {
						//System.out.println("Gelesene Zeile: " + zeile);
						if (path.equals(paths[0])){
							zeile = zeile.replace(" ","");
							String[] items = zeile.split(",");	
							autos.add(new Auto(items[0],Integer.parseInt(items[1]),Integer.parseInt(items[2]),items[3].charAt(0),Integer.parseInt(items[4])));
						}
						else if (path.equals(paths[1])){
							tipp = zeile;
						}
						else if (path.equals(paths[2])) {
							loesung = zeile;
						}
					}
				}
			}

			catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}