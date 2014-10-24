import java.awt.Color;
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
	
	public String getZuege(){
		char c;
		c = quelle.charAt(1);
		if(c == '1') return "10";
		return ""+c;
	}
	
	public int getAutoIndex(Color c){
		int index = -1;
		for(int i=0;i<spielfeld.getList().size();i++){
			if(spielfeld.getList().get(i).getFarbe()==c) index = i;
		}
		return index;
		
	}
}
