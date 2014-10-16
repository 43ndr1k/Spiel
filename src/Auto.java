
public class Auto {
	private static String farbe;
	private int xPos,yPos;
	/* xPos und yPos geben ein Ende des Autos an.
	 * Wenn das Auto horizontal steht, ist das Ende links.
	 * Wenn das Auto vertikal steht, ist das Ende oben.**/
	private static char richtung; // v=vertikal; h=horizontal
	private static int laenge;
	
	public Auto(String f, int x, int y, char r, int l){
		farbe = f;
		xPos = x;
		yPos = y;
		richtung = r;
		laenge = l;
	}
	
	
	public static String getFarbe() {
		return farbe;
	}
	public int getxPos() {
		return xPos;
	}
	public int getyPos() {
		return yPos;
	}
	public static char getRichtung() {
		return richtung;
	}
	public static int getLaenge() {
		return laenge;
	}


	public void vor(){
		if(richtung=='v') yPos++;
		if(richtung=='h') xPos++;
	}
	public void zurueck(){
		if(richtung=='v') yPos--;
		if(richtung=='h') xPos--;
	}
}
