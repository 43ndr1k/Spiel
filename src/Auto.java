import java.awt.Color;


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
	
	
	public Color getFarbe() {
		if(farbe.equals("blue")) return Color.blue;
		if(farbe.equals("cyan")) return Color.cyan;
		if(farbe.equals("green")) return Color.green;
		if(farbe.equals("magenta")) return Color.magenta;
		if(farbe.equals("orange")) return Color.orange;
		if(farbe.equals("pink")) return Color.pink;
		if(farbe.equals("red")) return Color.red;
		if(farbe.equals("yellow")) return Color.yellow;
		else return null;
		
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
		if(richtung=='v') xPos--;
		if(richtung=='h') yPos++;
	}
	public void zurueck(){
		if(richtung=='v') xPos++;
		if(richtung=='h') yPos--;
	}
}
