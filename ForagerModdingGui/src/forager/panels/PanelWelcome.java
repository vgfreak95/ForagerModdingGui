package forager.panels;

import java.awt.Color;

import javax.swing.JPanel;
import forager.gui.*;

public class PanelWelcome extends JPanel {
	
	private JPanel panelWelcome;
	
	public PanelWelcome() { }
	
	public JPanel getPanelWelcome() {
		
		panelWelcome = new JPanel();
		panelWelcome.setLayout(null);
		panelWelcome.setBackground(GuiColors.getColor(GuiColors.PURE_ORANGE));
		panelWelcome.setBounds(0, 0, 200, 200);
		
		
		
		return panelWelcome;
		
	}

	
}
