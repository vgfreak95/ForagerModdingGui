package forager.panels;

import java.awt.Color;

import javax.swing.JPanel;
import forager.gui.*;

public class PanelWelcome extends JPanel {
	
	Gui gui = new Gui();
	private JPanel panelWelcome;
	
	public PanelWelcome() { }
	
	public JPanel getPanelWelcome() {
		
		panelWelcome = new JPanel();
		panelWelcome.setLayout(null);
		panelWelcome.setBackground(Color.BLUE);
		//add(panelWelcome);
		
		return panelWelcome;
	}

	
}
