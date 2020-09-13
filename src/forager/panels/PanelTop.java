package forager.panels;

import java.awt.Color;

import javax.swing.JPanel;
import forager.gui.*;

public class PanelTop extends JPanel {
	
	Gui gui = new Gui();
	private JPanel panelTop;
	
	public PanelTop() { }
	
	public JPanel getPanelTop() {
		
		panelTop = new JPanel();
		panelTop.setLayout(null);
		panelTop.setBackground(GuiColors.getColor(GuiColors.DARK_BLUE));
		panelTop.setBounds(0, 0, 501, 501);
		
		return panelTop;
		
	}

	
}

