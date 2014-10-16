import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class LeseSpielfelderTXT {

	public void LeseSpielfeld(){
		
		
		int anz = listDirectory("Spielfelder");
		
		for(int i=0;i<anz;i++){
			try {
				@SuppressWarnings("resource")
				BufferedReader in = new BufferedReader(new FileReader("Spielfelder/Spielfeld"+i+".txt"));
				String zeile = null;
				while ((zeile = in.readLine()) != null) {
					System.out.println("Gelesene Zeile: " + zeile);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		
		}
	}
	
	
	private int listDirectory(String path){
	    File file = new File(path);
	    String[] directory = file.list();
	    return directory.length;
	}
}
