
public class Spielfeld {
	Auto autos[];
	private String tipp;
	private String loesung;
	private String quelle; //Name der Text-Datei
	
	public Spielfeld(int anzahl, String q){
		autos = new Auto [anzahl];
		quelle = q;
		restart();
	}	
	
	public String getTipp() {
		return tipp;
	}
	public String getLoesung() {
		return loesung;
	}
	//TODO auto
	public void restart(){
		/** Jedes Spielfeld als eigene Text-Datei speichern.
		 *Die Autos mit ihren Eigenschaften sind dort aufgelistet.
		 *Hier muss noch das Einlesen erg�nzt werden!
		 */
		for(int i=0;i<autos.length;i++){
			//autos[i] = new Auto();
		}
		//Auch der Tipp und die L�sung stehen mit in der txt.
		tipp = "";
		quelle = "";
	}
	
}
