package forager.panels;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import forager.gui.*;

public class PanelTop extends JPanel {
	
	private JPanel panelTop;
	private JLabel foragerIcon;
	
	public PanelTop() { }
	
	public JPanel getPanelTop() {
		
		panelTop = new JPanel();
		panelTop.setLayout(null);
		panelTop.setBackground(GuiColors.getColor(GuiColors.DARK_BLUE));
		panelTop.setBounds(0, 0, 682, 163);
		
		foragerIcon = new JLabel("");
		foragerIcon.setBounds(167, 13, 315, 150);
		foragerIcon.setIcon(new ImageIcon(getClass().getResource("/res/ForagerIconGui.png")));
		//foragerIcon.setIcon(new ImageIcon("C:\\Users\\VGFreak\\Desktop\\sprWood.png"));
		//C:\Users\VGFreak\Desktop\sprWood.png

		panelTop.add(foragerIcon);
		
		
		return panelTop;
		
	}

	
}

