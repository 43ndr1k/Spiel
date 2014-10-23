
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GUI wird erzeugt und angezeigt
		RushHourGUI spiel = new RushHourGUI();
		spiel.setVisible(true);

		Spielfeld s = new Spielfeld("410");
		//s.getAutos();
		
		for(Auto a:s.getAutos()){
			System.out.println(a.getFarbe());
			System.out.println(a.getLaenge());
			System.out.println(a.getRichtung());
			System.out.println(a.getxPos());
			System.out.println(a.getyPos());
		}


	}

}
