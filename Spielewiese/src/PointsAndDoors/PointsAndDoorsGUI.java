package PointsAndDoors;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class PointsAndDoorsGUI {

	private JFrame frmPointAndDoors;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {	
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PointsAndDoorsGUI window = new PointsAndDoorsGUI();
					window.frmPointAndDoors.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PointsAndDoorsGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		//Starte ein neues Spiel
		PointsAndDoors game = new PointsAndDoors();
		
		
		frmPointAndDoors = new JFrame();
		frmPointAndDoors.setTitle("PointsAndDoors - Game Version: - GUI:");
		frmPointAndDoors.setBounds(100, 100, 600, 650);
		frmPointAndDoors.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPointAndDoors.getContentPane().setLayout(null);
		
		//Panels
				JPanel[] panels = new JPanel[100];
				for (int i = 0; i < 100 ; i++ ) {
					//Erstelle das Panel
					panels[i] = new JPanel ();
						
					//Hintergrundfarbe der Panels
					if (i == game.getPos(GameObjects.Player)) {
						panels[i].setBackground(Color.RED);
					} else {
						panels[i].setBackground(Color.WHITE);
					}			
					
					//Rahmen der Panels
					panels[i].setBorder(BorderFactory.createLineBorder(Color.black));
						
					//Position Festlegen
					//Festlegen der Spalte
					int x = (i % 10) * 50;
					//Festlegen der Zeile
					int y = (i / 10) * 50;
							
					//Setze die Maße des Panels
					panels[i].setBounds(x, y, 50, 50);
					
					//Füge das Panel hinzu
					frmPointAndDoors.getContentPane().add(panels[i]);
				}
		
		JButton btn_runter = new JButton("Runter");
		btn_runter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.movePlayer('d');
				aktualisieren(game, panels);
			}
		});
		btn_runter.setBounds(10, 582, 85, 21);
		frmPointAndDoors.getContentPane().add(btn_runter);
		
		JButton btn_rauf = new JButton("Rauf");
		btn_rauf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.movePlayer('u');
				aktualisieren(game, panels);
			}
		});
		btn_rauf.setBounds(105, 582, 85, 21);
		frmPointAndDoors.getContentPane().add(btn_rauf);
		
		JButton btn_links = new JButton("Links");
		btn_links.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.movePlayer('l');
				aktualisieren(game, panels);
			}
		});
		btn_links.setBounds(200, 582, 85, 21);
		frmPointAndDoors.getContentPane().add(btn_links);
		
		JButton btn_rechts = new JButton("Rechts");
		btn_rechts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.movePlayer('r');
				aktualisieren(game, panels);
			}
		});
		btn_rechts.setBounds(295, 582, 85, 21);
		frmPointAndDoors.getContentPane().add(btn_rechts);
		
		JLabel lbl_task = new JLabel(game.getTask());
		lbl_task.setBounds(390, 582, 186, 21);
		frmPointAndDoors.getContentPane().add(lbl_task);
		
	}
	private void aktualisieren (PointsAndDoors game , JPanel[] panels) {
		//TODO make this happen
		for (int i = 0; i < 100 ; i++) {
			//Hintergrundfarbe der Panels
			if (i == game.getPos(GameObjects.Player)) {
				panels[i].setBackground(Color.RED);
			} else {
				panels[i].setBackground(Color.WHITE);
			}			
		}
	}
}
