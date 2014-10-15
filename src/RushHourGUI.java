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
			loesungButton = new JButton("Lösung"), beendenButton = new JButton("Beenden"), 
			b00 = new JButton(""), b01 = new JButton(""), b02 = new JButton(""), b03 = new JButton(""), b04 = new JButton(""),
			b05 = new JButton(""), b06 = new JButton(""), b07 = new JButton(""), b10 = new JButton(""), b11 = new JButton(""), 
			b12 = new JButton(""), b13 = new JButton(""), b14 = new JButton(""), b15 = new JButton(""), b16 = new JButton(""), 
			b17 = new JButton(""), b20 = new JButton(""), b21 = new JButton(""), b22 = new JButton(""), b23 = new JButton(""), 
			b24 = new JButton(""), b25 = new JButton(""), b26 = new JButton(""), b27 = new JButton(""), b30 = new JButton(""), 
			b31 = new JButton(""), b32 = new JButton(""), b33 = new JButton(""), b34 = new JButton(""), b35 = new JButton(""),
			b36 = new JButton(""), b37 = new JButton(""), b40 = new JButton(""), b41 = new JButton(""),	b42 = new JButton(""),
			b43 = new JButton(""), b44 = new JButton(""), b45 = new JButton(""), b46 = new JButton(""), b47 = new JButton(""),
			b50 = new JButton(""), b51 = new JButton(""), b52 = new JButton(""), b53 = new JButton(""), b54 = new JButton(""),
			b55 = new JButton(""), b56 = new JButton(""), b57 = new JButton(""), b60 = new JButton(""), b61 = new JButton(""),
			b62 = new JButton(""), b63 = new JButton(""), b64 = new JButton(""), b65 = new JButton(""), b66 = new JButton(""), 
			b67 = new JButton(""), b70 = new JButton(""), b71 = new JButton(""), b72 = new JButton(""), b73 = new JButton(""),
			b74 = new JButton(""), b75 = new JButton(""), b76 = new JButton(""), b77 = new JButton("");

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
		spielfeldPanel.add(b70);
		spielfeldPanel.add(b71);
		spielfeldPanel.add(b72);
		spielfeldPanel.add(b73);
		spielfeldPanel.add(b74);
		spielfeldPanel.add(b75);
		spielfeldPanel.add(b76);
		spielfeldPanel.add(b77);
		spielfeldPanel.add(b60);
		spielfeldPanel.add(b61);
		spielfeldPanel.add(b62);
		spielfeldPanel.add(b63);
		spielfeldPanel.add(b64);
		spielfeldPanel.add(b65);
		spielfeldPanel.add(b66);
		spielfeldPanel.add(b67);
		spielfeldPanel.add(b50);
		spielfeldPanel.add(b51);
		spielfeldPanel.add(b52);
		spielfeldPanel.add(b53);
		spielfeldPanel.add(b54);
		spielfeldPanel.add(b55);
		spielfeldPanel.add(b56);
		spielfeldPanel.add(b57);
		spielfeldPanel.add(b40);
		spielfeldPanel.add(b41);
		spielfeldPanel.add(b42);
		spielfeldPanel.add(b43);
		spielfeldPanel.add(b44);
		spielfeldPanel.add(b45);
		spielfeldPanel.add(b46);
		spielfeldPanel.add(b47);
		spielfeldPanel.add(b30);
		spielfeldPanel.add(b31);
		spielfeldPanel.add(b32);
		spielfeldPanel.add(b33);
		spielfeldPanel.add(b34);
		spielfeldPanel.add(b35);
		spielfeldPanel.add(b36);
		spielfeldPanel.add(b37);
		spielfeldPanel.add(b20);
		spielfeldPanel.add(b21);
		spielfeldPanel.add(b22);
		spielfeldPanel.add(b23);
		spielfeldPanel.add(b24);
		spielfeldPanel.add(b25);
		spielfeldPanel.add(b26);
		spielfeldPanel.add(b27);
		spielfeldPanel.add(b10);
		spielfeldPanel.add(b11);
		spielfeldPanel.add(b12);
		spielfeldPanel.add(b13);
		spielfeldPanel.add(b14);
		spielfeldPanel.add(b15);
		spielfeldPanel.add(b16);
		spielfeldPanel.add(b17);
		spielfeldPanel.add(b00);
		spielfeldPanel.add(b01);
		spielfeldPanel.add(b02);
		spielfeldPanel.add(b03);
		spielfeldPanel.add(b04);
		spielfeldPanel.add(b05);
		spielfeldPanel.add(b06);
		spielfeldPanel.add(b07);
		
		b00.setBackground(Color.DARK_GRAY);
		b01.setBackground(Color.DARK_GRAY);
		b02.setBackground(Color.DARK_GRAY);
		b03.setBackground(Color.DARK_GRAY);
		b04.setBackground(Color.DARK_GRAY);
		b05.setBackground(Color.DARK_GRAY);
		b06.setBackground(Color.DARK_GRAY);
		b07.setBackground(Color.DARK_GRAY);
		b10.setBackground(Color.DARK_GRAY);
		b20.setBackground(Color.DARK_GRAY);
		b30.setBackground(Color.DARK_GRAY);
		b40.setBackground(Color.DARK_GRAY);
		b50.setBackground(Color.DARK_GRAY);
		b60.setBackground(Color.DARK_GRAY);
		b70.setBackground(Color.DARK_GRAY);
		b71.setBackground(Color.DARK_GRAY);
		b72.setBackground(Color.DARK_GRAY);
		b73.setBackground(Color.DARK_GRAY);
		b74.setBackground(Color.DARK_GRAY);
		b75.setBackground(Color.DARK_GRAY);
		b76.setBackground(Color.DARK_GRAY);
		b77.setBackground(Color.DARK_GRAY);
		b17.setBackground(Color.DARK_GRAY);
		b27.setBackground(Color.DARK_GRAY);
		b37.setBackground(Color.DARK_GRAY);
		b57.setBackground(Color.DARK_GRAY);
		b67.setBackground(Color.DARK_GRAY);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
