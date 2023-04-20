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
import java.awt.Font;

public class PointsAndDoorsGUI {
	final String title = "PointsAndDoors - Game Version: - GUI: BETA";
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
		frmPointAndDoors.setTitle(title);
		frmPointAndDoors.setBounds(100, 100, 580, 650);
		frmPointAndDoors.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPointAndDoors.getContentPane().setLayout(null);
		
		//Panels
				JPanel[] panels = new JPanel[100];
				for (int i = 0; i < 100 ; i++ ) {
					//Erstelle das Panel
					panels[i] = new JPanel ();
					
					panels[i].setBackground(Color.WHITE);		
					
					//Rahmen der Panels
					panels[i].setBorder(BorderFactory.createLineBorder(Color.black));
						
					//Position Festlegen
					//Festlegen der Spalte
					int x = ((i % 10) * 50) + 30;
					//Festlegen der Zeile
					int y = ((i / 10) * 50) + 40;
							
					//Setze die Maße des Panels
					panels[i].setBounds(x, y, 50, 50);
					
					//Füge das Panel hinzu
					frmPointAndDoors.getContentPane().add(panels[i]);
				}
		
		JLabel lbl_task = new JLabel(game.getTask());
		lbl_task.setBounds(390, 582, 186, 21);
		frmPointAndDoors.getContentPane().add(lbl_task);		
		
		JButton btn_runter = new JButton("Runter");
		btn_runter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.movePlayer('d');
				aktualisieren(game, panels, lbl_task);
			}
		});
		btn_runter.setBounds(10, 582, 85, 21);
		frmPointAndDoors.getContentPane().add(btn_runter);
		
		JButton btn_rauf = new JButton("Rauf");
		btn_rauf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.movePlayer('u');
				aktualisieren(game, panels, lbl_task);
			}
		});
		btn_rauf.setBounds(105, 582, 85, 21);
		frmPointAndDoors.getContentPane().add(btn_rauf);
		
		JButton btn_links = new JButton("Links");
		btn_links.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.movePlayer('l');
				aktualisieren(game, panels, lbl_task);
			}
		});
		btn_links.setBounds(200, 582, 85, 21);
		frmPointAndDoors.getContentPane().add(btn_links);
		
		JButton btn_rechts = new JButton("Rechts");
		btn_rechts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				game.movePlayer('r');
				aktualisieren(game, panels, lbl_task);
			}
		});
		btn_rechts.setBounds(295, 582, 85, 21);
		frmPointAndDoors.getContentPane().add(btn_rechts);
		
		JLabel lbl_Header = new JLabel(title + " by adiko01");
		lbl_Header.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Header.setBounds(10, 10, 546, 21);
		frmPointAndDoors.getContentPane().add(lbl_Header);
		
		JLabel lbl_P = new JLabel("P");
		lbl_P.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lbl_P.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_P.setBounds(173, 276, 45, 45);
		
		aktualisieren(game , panels, lbl_task);
	}
	/**
	 * Akualisiert das Spielfeld
	 * @param game
	 * @param panels
	 */
	private void aktualisieren (PointsAndDoors game , JPanel[] panels, JLabel lbl_task) {
		//TODO make this happen
		for (int i = 0; i < 100 ; i++) {
			//Hintergrundfarbe der Panels
			if (i == game.getPos(GameObjects.Player)) {
				markPanelAsPlayer(panels[i]);
			} else if (i == game.getPos(GameObjects.Money)) {
				markPanelAsMoney(panels[i]);
			} else if (i == game.getPos(GameObjects.Door)) {
				markPanelAsDoor(panels[i]);
			} else if (i == game.getPos(GameObjects.Enemy)) {
				markPanelAsEnemy(panels[i]);
			} else {
				resetPanel(panels[i]);
			}			
		}
		lbl_task.setText(game.getTask());
		
	}
	private void resetPanel (JPanel panel) {
		panel.setBackground(Color.WHITE);
	}
	private void markPanelAsPlayer (JPanel panel) {
		panel.setBackground(Color.RED);
	}
	private void markPanelAsMoney (JPanel panel) {
		panel.setBackground(Color.YELLOW);
	}
	private void markPanelAsDoor (JPanel panel) {
		panel.setBackground(new Color(139, 0, 0));
	}
	private void markPanelAsEnemy (JPanel panel) {
		panel.setBackground(new Color(255, 0, 255));
	}
}
