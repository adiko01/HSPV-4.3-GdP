package beispiele.GUI.WeitereBeispiele.JMenu;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

public class MFenster extends JFrame
{
	public MFenster() 
	{
		super ("JMenu - Test");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize (640,480);
		
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu m1 = new JMenu("Datei");
		JMenuItem oeffnen = new JMenuItem("Öffnen");
		oeffnen.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.out.println("Öffnen wurde geklickt");
			}
		});
		
		
		ButtonGroup bg = new ButtonGroup();
		JRadioButtonMenuItem rbmi1 = new JRadioButtonMenuItem("Auswahl 1");
		JRadioButtonMenuItem rbmi2 = new JRadioButtonMenuItem("Auswahl 2");
		bg.add(rbmi1);
		bg.add(rbmi2);
		
		JCheckBoxMenuItem cbmi = new JCheckBoxMenuItem("Check it");
		
		JMenuItem beenden = new JMenuItem("Beenden");
		beenden.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		beenden.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		m1.add(oeffnen);
		m1.add(rbmi1);
		m1.add(rbmi2);
		m1.add(cbmi);
		m1.addSeparator();
		m1.add(beenden);
		
		JMenu m2 = new JMenu("Hilfe");
		JMenuItem about = new JMenuItem("Über");
		m2.add(about);
				
		menuBar.add(m1);
		menuBar.add(m2);
		
		/*
		 * ToolBar anzeigen
		 */
		JToolBar tb = new JToolBar();
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		tb.setFloatable(true);
		tb.add(b1);
		tb.addSeparator();
		tb.add(b2);
		
		this.add(tb, BorderLayout.NORTH);
		
		/*
		 * rotes Panel für Kontextmenü
		 */
		JPanel red = new JPanel();
		red.setBackground(Color.RED);
		red.setPreferredSize(new Dimension(100,100));
		add (red, BorderLayout.CENTER);
		
		
		
		/*
		 * Kontextmenü für das Panel
		 */
		JPopupMenu popup = new JPopupMenu();
		JMenuItem item = new JMenuItem("Blau");
		item.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				red.setBackground(Color.BLUE);
			}
		});
		
		popup.add(item);
		
		red.addMouseListener(new MouseAdapter()
		{
			/*
			 * Leider unterscheiden sich die BS in der Erkennung von Popups
			 * sodass hier zwei Methoden implementiert werden müssen
			 */
			@Override
			public void mousePressed(MouseEvent e)
			{
				if (e.isPopupTrigger())
					popup.show((Component) e.getSource(), e.getX(), e.getY());
			}
			
			@Override
			public void mouseReleased(MouseEvent e)
			{
				if (e.isPopupTrigger())
					popup.show((Component) e.getSource(), e.getX(), e.getY());
			}
		});
		
		
		this.setJMenuBar(menuBar);
	
		
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new MFenster();
	}

}
