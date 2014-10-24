import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;


public class RushHourGUI extends JFrame implements ActionListener{
	//ContentPane
	Container cp1;
	//Komponenten 
	JPanel startPanel = new JPanel(new GridLayout(2,1)), startButtonPanel = new JPanel(), backPanel = new JPanel(new BorderLayout()), 
			buttonPanel = new JPanel(), spielfeldPanel = new JPanel(new GridLayout(8, 8)), abfragePanel = new JPanel(new GridLayout(3,2)),
			zuegePanel = new JPanel(new FlowLayout());
	JButton neuButton = new JButton("Neues Spiel"), resButton = new JButton("Restart"), tippButton = new JButton("Tipp"), 
			loesungButton = new JButton("Loesung"), beendenButton = new JButton("Beenden"), b[][] = new JButton[8][8],
			okButton = new JButton("OK"), abbrechenButton = new JButton("Abbrechen"), neuButton1 = new JButton("Neues Spiel"),
			beendenButton1 = new JButton("Beenden");
	JLabel titelLabel = new JLabel("Rush Hour"), anzfLabel = new JLabel("Anzahl der Fahrzeuge: "),
			anzspLabel = new JLabel("Anzahl der Spielzuege: "), anzspLabel1 = new JLabel("Gespielte Zuege: "),
			endeLabel = new JLabel();
	JFrame abfrage = new JFrame("Abfrage"), ende = new JFrame ("Gewonnen!");
	JComboBox anzf = new JComboBox(), anzsp = new JComboBox();
	int zuege = 0;
	
	Spielfeld spielfeld = null;

	public RushHourGUI(){
			    this.setTitle("Rush Hour");
			    this.setSize(800, 700);
			    this.setLocationRelativeTo(null);
			    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    cp1 = this.getContentPane();
			    cp1.add(startPanel);
			    startPanel.add(titelLabel);
			    titelLabel.setFont(new Font("Arial", Font.BOLD, 80));
			    titelLabel.setHorizontalAlignment(SwingConstants.CENTER);
				titelLabel.setVerticalAlignment(SwingConstants.CENTER);
				startPanel.add(startButtonPanel);
				startButtonPanel.add(neuButton1);
				neuButton1.setPreferredSize(new Dimension(150,30));
				neuButton1.addActionListener(this);
				startButtonPanel.add(beendenButton1);
				beendenButton1.setPreferredSize(new Dimension(150,30));
				beendenButton1.addActionListener(this);
				backPanel.add(buttonPanel, BorderLayout.SOUTH);
				zuegePanel.add(anzspLabel1);
				backPanel.add(zuegePanel, BorderLayout.NORTH);
				abfrage();
				buttonP();
			}
		 
	private void abfrage() {
		abfrage.setSize(300, 150);
	    abfrage.setLocationRelativeTo(null);
	    abfrage.add(abfragePanel);
	    for(int i=5; i<8; i++){ //Moeglichkeiten fuer Fahrzeuge
	    	anzf.addItem(i);
	    }
	    //Moeglichkeiten fuer Spielzuege
	    anzsp.addItem(12);
	    anzsp.addItem(14);
	    anzsp.addItem(15);
	    abfragePanel.add(anzfLabel);
	    abfragePanel.add(anzf);
	    abfragePanel.add(anzspLabel);
	    abfragePanel.add(anzsp);
	    abfragePanel.add(okButton);
	    abfragePanel.add(abbrechenButton);
	    okButton.addActionListener(this);
	    abbrechenButton.addActionListener(this);
	    anzf.addActionListener(this);
	    anzsp.addActionListener(this);
		abfrage.setVisible(false);
	}
	
	private void buttonP() {
		buttonPanel.add(neuButton);
		buttonPanel.add(resButton);
		buttonPanel.add(tippButton);
		buttonPanel.add(loesungButton);
		buttonPanel.add(beendenButton);
		neuButton.addActionListener(this); 
		resButton.addActionListener(this);
		tippButton.addActionListener(this);
		loesungButton.addActionListener(this);
		beendenButton.addActionListener(this);
		backPanel.add(spielfeldPanel, BorderLayout.CENTER);
		initSpielfeld();
	}
	
	private void initSpielfeld() {
		for(int i=7; i>=0; i--) {
			for (int j=0; j<=7; j++) {
				b[i][j]= new JButton("");
				spielfeldPanel.add(b[i][j]);
				if((i==7 || i==0 || j==7 || j==0) && (i!=4 || j==0)) {
					b[i][j].setBackground(Color.DARK_GRAY);
				} else {
					b[i][j].setBackground(Color.WHITE);
					b[i][j].addActionListener(this);
				}
			}
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton x = null;
		int xKoord,yKoord;
		char richtung;
		switch (arg0.getActionCommand()){
		case "OK" :
			abfrage.setVisible(false);
			startPanel.setVisible(false);
			cp1.add(backPanel);
			zuege = 0;
			anzspLabel1.setText("Gespielte Zuege: " + zuege);
			spielfeld = new Spielfeld(""+(((Integer)anzf.getSelectedItem())-1)+""+((Integer)anzsp.getSelectedItem()-5)+"");
			spielfeldFuellen();
			break;
		case "Neues Spiel" :
			anzf.setSelectedIndex(0);
			anzsp.setSelectedIndex(0);
			abfrage.setVisible(true);
			break;
		case "Restart" :
			//alle Spielzuege zurueksetzen
			zuege = 0;
			anzspLabel1.setText("Gespielte Zuege: " + zuege);
			spielfeld = new Spielfeld(""+(((Integer)anzf.getSelectedItem())-1)+""+anzsp.getSelectedItem()+"");
			spielfeldFuellen();
			break;
		case "Tipp" :
			//Tipp anzeigen
			break;
		case "Loesung" :
			//Loesung anzeigen
			break;
		case "Beenden" :
			System.exit(0);
			break;
		case "Abbrechen" :
			abfrage.setVisible(false);
			break;
		case "0":
			x = (JButton)arg0.getSource();
			xKoord = spielfeld.getAutos().get(spielfeld.getAutoIndex(x.getBackground())).getxPos();
			yKoord = spielfeld.getAutos().get(spielfeld.getAutoIndex(x.getBackground())).getyPos();
			richtung = spielfeld.getAutos().get(spielfeld.getAutoIndex(x.getBackground())).getRichtung();
			if(richtung == 'v'){
				if(b[xKoord+1][yKoord].getBackground()==Color.WHITE){
					spielfeld.getAutos().get(spielfeld.getAutoIndex(x.getBackground())).zurueck();
					zuege++;
					anzspLabel1.setText("Gespielte Zuege: " + zuege);
				}
			}
			if(richtung == 'h'){
				if(b[xKoord][yKoord-1].getBackground()==Color.WHITE){
					spielfeld.getAutos().get(spielfeld.getAutoIndex(x.getBackground())).zurueck();
					zuege++;
					anzspLabel1.setText("Gespielte Zuege: " + zuege);
				}
			}
			spielfeldFuellen();
			break;
		case "1":
			x = (JButton)arg0.getSource();
			xKoord = spielfeld.getAutos().get(spielfeld.getAutoIndex(x.getBackground())).getxPos();
			yKoord = spielfeld.getAutos().get(spielfeld.getAutoIndex(x.getBackground())).getyPos();
			int laenge = spielfeld.getAutos().get(spielfeld.getAutoIndex(x.getBackground())).getLaenge();
			richtung = spielfeld.getAutos().get(spielfeld.getAutoIndex(x.getBackground())).getRichtung();
			if(richtung == 'v'){
				if(b[xKoord-laenge][yKoord].getBackground()==Color.WHITE){
					spielfeld.getAutos().get(spielfeld.getAutoIndex(x.getBackground())).vor();
					zuege++;
					anzspLabel1.setText("Gespielte Zuege: " + zuege);
				}
			}
			if(richtung == 'h'){
				if(b[xKoord][yKoord+laenge].getBackground()==Color.WHITE){
					spielfeld.getAutos().get(spielfeld.getAutoIndex(x.getBackground())).vor();
					zuege++;
					anzspLabel1.setText("Gespielte Zuege: " + zuege);
				}
			}
			spielfeldFuellen();
			if(b[4][7].getBackground()==Color.red){
				spielEnde();
			}
			break;
		}

		
	}
	
	//Visualisiert die Autos aus der Liste
	public void spielfeldFuellen(){
		ArrayList<Auto> autos = spielfeld.getAutos();
		clear();
		for(int i=0;i<autos.size();i++){
			Auto a = autos.get(i);
			if(a.getRichtung()=='h'){
				for(int j=a.getyPos();j<(a.getyPos()+a.getLaenge());j++){
					b[a.getxPos()][j].setBackground(a.getFarbe());
					if(j==a.getyPos()){
						b[a.getxPos()][j].setText("0");
						b[a.getxPos()][j].setForeground(a.getFarbe());
					}
					if(j==(a.getyPos()+a.getLaenge()-1)){
						b[a.getxPos()][j].setText("1");
						b[a.getxPos()][j].setForeground(a.getFarbe());
					}
					
				}
			}
			if(a.getRichtung()=='v'){
				for(int j=a.getxPos();j>(a.getxPos()-a.getLaenge());j--){
					b[j][a.getyPos()].setBackground(a.getFarbe());
					if(j==a.getxPos()){
						b[j][a.getyPos()].setText("0");
						b[j][a.getyPos()].setForeground(a.getFarbe());
					}
					if(j==(a.getxPos()-a.getLaenge()+1)){
						b[j][a.getyPos()].setText("1");
						b[j][a.getyPos()].setForeground(a.getFarbe());
					}
				}
			}
		}
	}
	
	//Löscht alle angeziegten Autos
	public void clear(){
		for(int i=7; i>=0; i--) {
			for (int j=0; j<=7; j++) {
				if((i==7 || i==0 || j==7 || j==0) && (i!=4 || j==0)) {
					b[i][j].setBackground(Color.DARK_GRAY);
					b[i][j].setText("");
				} else {
					b[i][j].setBackground(Color.WHITE);
					b[i][j].setText("");
				}
			}
		}
	}
	
	public void spielEnde(){
		ende.setSize(300, 150);
	    ende.setLocationRelativeTo(null);
	   	ende.add(endeLabel);
	   	endeLabel.setText("<html>Sie haben gewonnen!!!<br> Benötigte Spielzüge: "+zuege+"<br> Minimale Spielzüge: "+spielfeld.getZuege()+"</html>");
	   	ende.setVisible(true);
	   	zuege = 0;
		anzspLabel1.setText("Gespielte Zuege: " + zuege);
	   	spielfeld = new Spielfeld(""+(((Integer)anzf.getSelectedItem())-1)+""+((Integer)anzsp.getSelectedItem()-5)+"");
		spielfeldFuellen();
	}

}
