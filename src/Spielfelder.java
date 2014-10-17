import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Spielfelder {

	String path = "Spielfelder";
	

	public Spielfelder() {
		super();
		File dir = new File(path);


		for (String file : dir.list()) {
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



}
