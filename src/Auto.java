
public class Auto {
	private  String farbe;
	private  int xPos,yPos;
	/* xPos und yPos geben ein Ende des Autos an.
	 * Wenn das Auto horizontal steht, ist das Ende links.
	 * Wenn das Auto vertikal steht, ist das Ende oben.**/
	private char richtung; // v=vertikal; h=horizontal
	private int laenge;
	
	public Auto(String f, int x, int y, char r, int l){
		this.farbe = f;
		this.xPos = x;
		this.yPos = y;
		this.richtung = r;
		this.laenge = l;
	}
	
	
	public String getFarbe() {
		return farbe;
	}
	public int getxPos() {
		return xPos;
	}
	public int getyPos() {
		return yPos;
	}
	public char getRichtung() {
		return richtung;
	}
	public int getLaenge() {
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
