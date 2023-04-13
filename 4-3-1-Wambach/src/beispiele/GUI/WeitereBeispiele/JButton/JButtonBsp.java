package beispiele.GUI.WeitereBeispiele.JButton;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;

public class JButtonBsp extends JFrame
{
	private static int anzahlDerClicks;
	
	
	JButtonBsp()
	{
		setTitle("JButton-Test");
		setSize(600,480);
		
		JButton jb = new JButton("Klick mich");
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hier wurde geklickt");
				Integer anzahl = ++anzahlDerClicks;
				JButtonBsp.this.setTitle(anzahl.toString());
			}
		});
		
		add(jb);
		
		setVisible(true);
	}
	public static void main(String[] args)
	{
		new JButtonBsp();
	}

}
