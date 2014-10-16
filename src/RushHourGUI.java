import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class RushHourGUI extends JFrame implements ActionListener{
	//ContentPane
	Container cp1;
	//Komponenten 
	JPanel backPanel = new JPanel(new GridLayout(1,2)), buttonPanel = new JPanel(null),
				 spielfeldPanel = new JPanel(new GridLayout(8, 8));
	JButton neuButton = new JButton("Neues Spiel"), resButton = new JButton("Restart"), tippButton = new JButton("Tipp"), 
			loesungButton = new JButton("Lösung"), beendenButton = new JButton("Beenden"), b[][] = new JButton[8][8];

	public RushHourGUI(){
			    this.setTitle("Rush Hour");
			    this.setSize(1000, 650);
			    this.setLocationRelativeTo(null);
			    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			    initStartGUI();
			}
		 

	
	private void initStartGUI() {
		  cp1 = this.getContentPane();
		  cp1.add(backPanel);
		  backPanel.add(buttonPanel);
		  buttonPanel.setBackground(Color.LIGHT_GRAY);
		  buttonPanel.add(neuButton);
		  neuButton.setBounds(100, 50, 250, 50);
		  neuButton.addActionListener(this);
		  buttonPanel.add(resButton);
		  resButton.setBounds(100, 120, 250, 50);
		  resButton.addActionListener(this);
		  buttonPanel.add(tippButton);
		  tippButton.setBounds(100, 190, 250, 50);
		  tippButton.addActionListener(this);
		  buttonPanel.add(loesungButton);
		  loesungButton.setBounds(100, 260, 250, 50);
		  loesungButton.addActionListener(this);
		  buttonPanel.add(beendenButton);
		  beendenButton.setBounds(100, 330, 250, 50);
		  beendenButton.addActionListener(this);
		  
		  backPanel.add(spielfeldPanel);
		  spielfeldPanel.setBackground(Color.LIGHT_GRAY);
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
		case "Neues Spiel" :
			break;
		case "Restart" :
			break;
		case "Tipp" :
			break;
		case "Lösung" :
			break;
		case "Beenden" :
			System.exit(0);
			break;
		case "" :
			break;
		}

		
	}

}
