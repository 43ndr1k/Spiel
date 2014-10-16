import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LeseSpielfelderTXT {

	String path = "Spielfelder";
	
	public void LeseSpielfeld(){
		
		
	    File dir = new File(path);
	    String[] directory = dir.list();
		
		for(String file: dir.list()){
			System.out.println(file);
			FileReader lvl;
			try {
				try {
				lvl = new FileReader(path + "/" + file);
				@SuppressWarnings("resource")
				BufferedReader in = new BufferedReader(lvl);
				String zeile = null;
				while ((zeile = in.readLine()) != null) {
					System.out.println("Gelesene Zeile: " + zeile);
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
	
	

//	Spielfeld[] Spielfelder = new Spielfeld[anz];	
//	String[][] z = new String[6][6];
//	public void SpielfeldGenerieren(String zeile){
		
		
//}		

}

