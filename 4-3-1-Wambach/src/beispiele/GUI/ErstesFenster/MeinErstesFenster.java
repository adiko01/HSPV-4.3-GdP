package beispiele.GUI.ErstesFenster;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MeinErstesFenster extends JFrame
{

	public MeinErstesFenster()
	{
		setSize(300,300);
		setLocation(100,100);
		setTitle("Mein erstes Fenster");
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		MeinErstesPanel p1 = new MeinErstesPanel();
		add(p1);
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MeinErstesFenster f1 = new MeinErstesFenster();
		//MeinErstesFenster f2 = new MeinErstesFenster();
		//MeinErstesFenster f3 = new MeinErstesFenster();
		
	}

}

class MeinErstesPanel extends JPanel
{
	public MeinErstesPanel()
	{
		setSize(50,50);
		setLocation(25,50);
		setBackground(Color.BLUE);
	}
}
