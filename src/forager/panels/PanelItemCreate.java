/*package forager.panels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import forager.gui.GuiColors;

public class PanelItemCreate extends JPanel {
	
	private JPanel panelItemCreate;
	private JLabel lblNameOfItem;
	
	
	
	public JPanel getPanelItemCreate () {
		
		
		
		panelItemCreate = new JPanel();
		panelItemCreate.setBounds(0, 162, 682, 350);
		panelItemCreate.setBackground(GuiColors.getColor(GuiColors.DARK_GRAY));
		panelItemCreate.setLayout(null);

		
		lblNameOfSprite = new JLabel("Name of Sprite:");
		lblNameOfSprite.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNameOfSprite.setBounds(45, 49, 125, 20);
		lblNameOfSprite.setForeground(GuiColors.getColor(GuiColors.LIGHT_GRAY));
		panelItemCreate.add(lblNameOfSprite);
		

		txtSpriteName = new JTextField();
		txtSpriteName.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtSpriteName.setText("sprite name");
		txtSpriteName.setBounds(182, 41, 183, 38);
		txtSpriteName.setSelectionColor(GuiColors.getColor(GuiColors.LIGHT_BLUE));
		txtSpriteName.setForeground(new Color(169, 169, 169));
		txtSpriteName.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtSpriteName.setColumns(10);
		txtSpriteName.setCaretColor(GuiColors.getColor(GuiColors.LIGHT_BLUE));
		txtSpriteName.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, (GuiColors.getColor(GuiColors.LIGHT_BLUE))));
		txtSpriteName.setBackground(new Color(60, 60, 60));
		panelItemCreate.add(txtSpriteName);
		
		
		
		lblNumberOfFrames = new JLabel("Number of Frames:");
		lblNumberOfFrames.setForeground(new Color(169, 169, 169));
		lblNumberOfFrames.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNumberOfFrames.setBounds(45, 122, 157, 20);
		panelItemCreate.add(lblNumberOfFrames);
		
	}
}
*/