package beispiele.InnereKlassen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnereKlassenBeispiel {

	public static void main(String[] args) {
		JFrame fenster = new JFrame();
		fenster.setLocation(200,200);
		fenster.setSize(300,300);
		fenster.setTitle("erstes Fenster");
		
		JButton button = new JButton("Klick mich");
		//button.setLocation(50,50);
		//button.setSize(80,80);
		button.setBounds(50, 50, 80, 80);
		MeinButtonListener mbl = new MeinButtonListener();
		button.addActionListener(mbl);
		
		fenster.setLayout(null);
		fenster.add(button);
		
		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setVisible(true);
		
	}
}

class MeinButtonListener implements ActionListener
{
	public void actionPerformed(ActionEvent e) {
		System.out.println("geklickt");
	}
}

