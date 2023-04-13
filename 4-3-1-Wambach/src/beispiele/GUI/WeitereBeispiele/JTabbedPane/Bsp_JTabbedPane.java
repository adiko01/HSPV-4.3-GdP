package beispiele.GUI.WeitereBeispiele.JTabbedPane;


import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;


public class Bsp_JTabbedPane extends JFrame
{
	Bsp_JTabbedPane()
	{
		setSize(600,400);
		setTitle("JTabbedPane Example");
		

		JPanel gruen = new JPanel();
		gruen.setBackground(Color.GREEN);

		
		JTabbedPane tPane = new JTabbedPane(JTabbedPane.TOP);
		
		MeinPanel rot = new MeinPanel(tPane);

		
		
		tPane.add("Tab 1", rot);
		tPane.add("Noch ein Tab", gruen);
		this.add(tPane);
		
		

		
		setVisible(true);
		
		
		
	}
	public static void main(String[] args)
	{
		new Bsp_JTabbedPane();

	}

}

class MeinPanel extends JPanel
{
	
	JTabbedPane tPane;
	
	public MeinPanel(JTabbedPane tPane)
	{
		setBackground(Color.RED);
		this.tPane=tPane;
		addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				tPane.add(new JPanel(),"neuer panel");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	
	
}
