import java.awt.*;
import java.awt.event.*;

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
			okButton = new JButton("OK"), abbrechenButton = new JButton("Abbrechen");
	JLabel titelLabel = new JLabel("Rush Hour"), anzfLabel = new JLabel("Anzahl der Fahrzeuge: "),
			anzspLabel = new JLabel("Anzahl der Spielzuege: "), anzspLabel1 = new JLabel("Gespielte Zuege: ");
	JFrame abfrage = new JFrame("Abfrage");
	JComboBox anzf = new JComboBox(), anzsp = new JComboBox();
	int zuege = 0;
	

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
				startButtonPanel.add(neuButton);
				neuButton.setPreferredSize(new Dimension(150,30));
				neuButton.addActionListener(this);
				startButtonPanel.add(beendenButton);
				beendenButton.setPreferredSize(new Dimension(150,30));
				beendenButton.addActionListener(this);
				backPanel.add(buttonPanel, BorderLayout.SOUTH);
				zuegePanel.add(anzspLabel1);
				backPanel.add(zuegePanel, BorderLayout.NORTH);
				abfrage();
				addaction();
			}
		 
	private void abfrage() {
		abfrage.setSize(300, 150);
	    abfrage.setLocationRelativeTo(null);
	    abfrage.add(abfragePanel);
		for(int i=2; i<5; i++){ //Moeglichkeiten fuer Fahrzeuge, zurzeit 2-4
	    	anzf.addItem(i);
	    }
	    for(int i=5; i<8; i++) { //Moeglichkeiten fuer Spielzuege, zurzeit 5-7
	    	anzsp.addItem(i);
	    }
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
	
	private void addaction() {
		  resButton.addActionListener(this);
		  tippButton.addActionListener(this);
		  loesungButton.addActionListener(this);
		  
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
					b[i][j].addActionListener(this);
				}
			}
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		switch (arg0.getActionCommand()){
		case "OK" :
			abfrage.setVisible(false);
			startPanel.setVisible(false);
			cp1.add(backPanel);
			buttonPanel.add(neuButton);
			buttonPanel.add(resButton);
			buttonPanel.add(tippButton);
			buttonPanel.add(loesungButton);
			buttonPanel.add(beendenButton);
			zuege = 0;
			anzspLabel1.setText("Gespielte Zuege: " + zuege);
			
			if (0 == anzf.getSelectedIndex()) {
				//wenn 2 Autos ausgewaehlt
			}
			if (0 == anzsp.getSelectedIndex()) {
				//fuer 5 Spielzuege
			}
			
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
		case "" :
			//wenn eine Aktion ausgeführt wird ->muss noch überprüft werden
			zuege++;
			anzspLabel1.setText("Gespielte Zuege: " + zuege);
			break;
		}

		
	}

}
