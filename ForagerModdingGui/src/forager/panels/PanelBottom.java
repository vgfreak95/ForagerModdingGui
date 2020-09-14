package forager.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import forager.gui.*;

public class PanelBottom extends JPanel implements ActionListener {
	
	private JPanel panelBottom;
	private JButton btnContinue;
	private JButton btnBack;
	
	public PanelBottom() { }
	
	public JPanel getPanelBottom() {
		
		panelBottom = new JPanel();
		panelBottom.setBounds(0, 511, 682, 92);
		panelBottom.setBackground(GuiColors.getColor(GuiColors.MOON_GRAY));
		panelBottom.setLayout(null);
		
		btnContinue = new JButton("CONTINUE");
		btnContinue.setFocusPainted(false);
		btnContinue.setFont(new Font("Calibri", Font.PLAIN, 22));
		btnContinue.setBounds(530, 20, 140, 58);
		btnContinue.setBackground(GuiColors.getColor(GuiColors.PURE_ORANGE));
		btnContinue.setForeground(GuiColors.getColor(GuiColors.LIGHT_WHITE));
		panelBottom.add(btnContinue);
		
		btnBack = new JButton("BACK");
		btnBack.setVisible(false);
		btnBack.setForeground(new Color(245, 245, 245));
		btnBack.setFont(new Font("Calibri", Font.PLAIN, 22));
		btnBack.setFocusPainted(false);
		btnBack.setBackground(new Color(210, 105, 30));
		btnBack.setBounds(12, 20, 140, 58);
		panelBottom.add(btnBack);
		return panelBottom;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

	
}
