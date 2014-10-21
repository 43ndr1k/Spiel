import java.io.BufferedReader;
import java.io.File;
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

	
	private String quelle="",path="";
	private ArrayList<Auto> autos = new ArrayList<Auto>();
	private String item="";
	
	public TxtLesen(){
		super();
	}
	
	public TxtLesen(String quelle, String path, ArrayList<Auto> a) {
		super();
		this.quelle = quelle;
		this.path = path;
		this.autos = a;
		
	}
	
	
	
	public TxtLesen(String quelle, String path, String item) {
		super();
		this.quelle = quelle;
		this.path = path;
		this.item = item;
	}



	private void lese(){
		
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
		
	}
	
	
}
