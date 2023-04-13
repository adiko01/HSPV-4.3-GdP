package aufgaben;

import java.awt.EventQueue;
import java.awt.Point;
import java.util.Date;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Aufgabe_25 extends JFrame {
	/**Aufgabe 25:
	 * Erstellen Sie das dargestellte Fenster in der
	 * Größe 550x600 Pixel. Die Panel (50x50)
	 * sollen sich alle 250ms schrittweise schräg
	 * um 5 Pixel auseinander bewegen.
	 * Was passiert mit den Panels? Wie können
	 * Sie das ändern?
	 * Hinweis: Sie müssen dem Konstruktor des JFrame
	 * die Anweisung setLayout(null);  hinzufügen.
	 * 
	 */
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aufgabe_25 frame = new Aufgabe_25();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Aufgabe_25() {
		setTitle("Aufgabe 25");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 550, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Die kleinen Panels
		JPanel panelA = new JPanel();
		panelA.setBackground(Color.RED);
		panelA.setForeground(Color.RED);
		panelA.setBounds(215, 232, 50, 50);
		contentPane.add(panelA);
		
		JPanel panelB = new JPanel();
		panelB.setForeground(Color.RED);
		panelB.setBackground(Color.RED);
		panelB.setBounds(275, 232, 50, 50);
		contentPane.add(panelB);
		
		JPanel panelC = new JPanel();
		panelC.setForeground(Color.RED);
		panelC.setBackground(Color.RED);
		panelC.setBounds(215, 292, 50, 50);
		contentPane.add(panelC);
		
		JPanel panelD = new JPanel();
		panelD.setForeground(Color.RED);
		panelD.setBackground(Color.RED);
		panelD.setBounds(275, 292, 50, 50);
		contentPane.add(panelD);
		
		
		
		// Timer
        Timer timer = new Timer(250, e -> {
            move(panelA , -5, -5);
            move(panelB , 5, -5);
            move(panelC , -5, 5);
            move(panelD , 5, 5);
        });       
        timer.start();
	}
	
	private void move (JPanel panel, int dX, int dY) {
		//Überführe die Koordinaten des Panels in einen Punkt
		Point location = panel.getLocation();
		//Bewege den Punkt um das Delta
        location.translate(dX, dY);
        //Überführe die Bewegung in das Panel
        panel.setLocation(location);
	}
}
