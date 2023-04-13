package beispiele.GUI.WeitereBeispiele.JSplitPane;


import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSplitPane;



public class JSplitPaneBsp extends JFrame 
{
	public JSplitPaneBsp()
	{
		setSize(600,400);
		setTitle("JSplitPane Example");
		
		JPanel rot = new JPanel();
		rot.setBackground(Color.RED);
		
		JPanel gruen = new JPanel();
		gruen.setBackground(Color.GREEN);
		
		JSplitPane sPane = new JSplitPane();
		sPane.setLeftComponent(rot);
		sPane.setRightComponent(gruen);
		sPane.setDividerLocation(150);
		this.add(sPane);
		
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new JSplitPaneBsp();
	}

}
