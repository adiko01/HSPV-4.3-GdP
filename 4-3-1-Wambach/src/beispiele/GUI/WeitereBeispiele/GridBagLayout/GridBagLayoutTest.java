package beispiele.GUI.WeitereBeispiele.GridBagLayout;


import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;

import beispiele.GUI.WeitereBeispiele.GeschachtelteLayouts.MyLayoutPanel;

public class GridBagLayoutTest extends JFrame
{
	
	public GridBagLayoutTest()
	{
		super("GridBagLayoutTest");
		
		/*
		 * GridBagLayout festlegen
		 */
		GridBagLayout gridbag = new GridBagLayout();
		
		setLayout(gridbag);
		
		
		/*
		 * 10 Panels erzeugen
		 */
		MyLayoutPanel[] myPanels = new MyLayoutPanel[10];
		for (int i=0; i<10; i++)
		{
			myPanels[i] = new MyLayoutPanel(i+1);
		}
		
		/*
		 * 10 Panels in das GridBagLayout übernehmen
		 * (mit Hilfsmethode addPanel, damit hier weniger Quellcode)
		 */
		addPanel(gridbag, myPanels[0], 2, 0, 1, 1);
		addPanel(gridbag, myPanels[1], 0, 1, 1, 1);
		addPanel(gridbag, myPanels[2], 1, 1, 1, 1);
		addPanel(gridbag, myPanels[3], 2, 1, 1, 1);
		addPanel(gridbag, myPanels[4], 0, 2, 1, 2);
		addPanel(gridbag, myPanels[5], 1, 2, 2, 1);
		addPanel(gridbag, myPanels[6], 1, 3, 2, 1);
		addPanel(gridbag, myPanels[7], 1, 4, 1, 1);
		addPanel(gridbag, myPanels[8], 2, 4, 1, 1);
		addPanel(gridbag, myPanels[9], 0, 5, 3, 1);
		
		
		pack();
		setSize(640, 480);
		setVisible(true);
	}
	
	private void addPanel(GridBagLayout gb, MyLayoutPanel p, int x, int y, int w, int h)
	{
		GridBagConstraints constr = new GridBagConstraints();
		constr.insets = new Insets(1, 1, 1, 1);
		
		constr.gridx = x;
		constr.gridy = y;
		constr.gridwidth = w;
		constr.gridheight = h;
		constr.fill = GridBagConstraints.BOTH;

		constr.weightx = constr.weighty = 1;
		gb.setConstraints(p, constr);
		add(p);
	}

	public static void main(String[] args)
	{
		new GridBagLayoutTest();
	}

}
