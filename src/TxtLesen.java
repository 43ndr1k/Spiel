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

	private String quelle="",path="";
	private ArrayList<Auto> autos = null;
	private String item=null;

	public TxtLesen(){
		super();
	}

	public TxtLesen(String quelle, String path, ArrayList<Auto> a) {
		super();
		this.quelle = quelle;
		this.path = path;
		this.autos = a;
		lese();
	}

	public TxtLesen(String quelle, String path) {
		super();
		this.quelle = quelle;
		this.path = path;
		lese();
	}

	public ArrayList<Auto> getAutos() {
		return autos;
	}

	public String getItem() {
		return item;
	}

	private void lese(){

		FileReader lvl;
		try {
			try {
				lvl = new FileReader(path + "/" + quelle);
				BufferedReader in = new BufferedReader(lvl);
				String zeile = null;

				if(autos != null){
					while ((zeile = in.readLine()) != null) {
						//System.out.println("Gelesene Zeile: " + zeile);
						zeile = zeile.replace(" ","");
						String[] items = zeile.split(",");	
						autos.add(new Auto(items[0],Integer.parseInt(items[1]),Integer.parseInt(items[2]),items[3].charAt(0),Integer.parseInt(items[4])));						
					}
				}
				else{
					item = in.readLine();
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
