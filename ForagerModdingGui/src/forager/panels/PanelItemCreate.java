package forager.panels;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import forager.gui.GuiColors;

public class PanelItemCreate extends JPanel {
	
	private JPanel panelItemCreate;
	private JLabel lblNameOfItem;
	private JTextField txtDescription;
	private JTextField txtItemName;
	
	
	
	public JPanel getPanelItemCreate () {

		
		panelItemCreate = new JPanel();
		panelItemCreate.setBounds(-11, 153, 697, 359);
		panelItemCreate.setBackground(GuiColors.getColor(GuiColors.DARK_GRAY));
		//panelItemCreate.setBackground(GuiColors.getColor(GuiColors.DARK_BLUE));
		panelItemCreate.setLayout(null);

		
		txtItemName = new JTextField();
		txtItemName.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtItemName.setText("item name");
		txtItemName.setBounds(165, 16, 183, 38);
		txtItemName.setSelectionColor(GuiColors.getColor(GuiColors.LIGHT_BLUE));
		txtItemName.setForeground(new Color(169, 169, 169));
		txtItemName.setFont(new Font("Calibri", Font.PLAIN, 17));
		txtItemName.setColumns(10);
		txtItemName.setCaretColor(GuiColors.getColor(GuiColors.LIGHT_BLUE));
		txtItemName.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, (GuiColors.getColor(GuiColors.LIGHT_BLUE))));
		txtItemName.setBackground(new Color(60, 60, 60));
		panelItemCreate.add(txtItemName);
		

		txtDescription = new JTextField();
		txtDescription.setText("description of item");
		txtDescription.setSelectionColor(new Color(102, 183, 227));
		txtDescription.setForeground(new Color(169, 169, 169));
		txtDescription.setFont(new Font("Calibri", Font.PLAIN, 18));
		txtDescription.setColumns(10);
		txtDescription.setCaretColor(new Color(102, 183, 227));
		txtDescription.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, (GuiColors.getColor(GuiColors.LIGHT_BLUE))));
		txtDescription.setBackground(new Color(60, 60, 60));
		txtDescription.setBounds(123, 58, 225, 38);
		panelItemCreate.add(txtDescription);

	
		JSpinner spinnerVal = new JSpinner();
		spinnerVal.setToolTipText("");
		spinnerVal.setBounds(82, 127, 41, 22);
		panelItemCreate.add(spinnerVal);
		

		
		JSpinner spinnerHeal = new JSpinner();
		spinnerHeal.setToolTipText("");
		spinnerHeal.setBounds(102, 174, 41, 22);
		panelItemCreate.add(spinnerHeal);

		
		JSpinner spinnerEnergy = new JSpinner();
		spinnerEnergy.setToolTipText("");
		spinnerEnergy.setBounds(102, 217, 41, 22);
		panelItemCreate.add(spinnerEnergy);
		
		
		String[] itemTypes = {"Material", "Consumable", "Gear"};
		JComboBox cbItemTypes = new JComboBox(itemTypes);
		cbItemTypes.setBounds(437, 127, 108, 22);
		panelItemCreate.add(cbItemTypes);

		
		String[] subItemTypes = {"None", "Potion", "Scroll", "Gem", "Structure", "Tile", "Seed", "Nuclear"};
		JComboBox cbSubItemTypes = new JComboBox(subItemTypes);
		cbSubItemTypes.setBounds(468, 163, 108, 22);
		panelItemCreate.add(cbSubItemTypes);
		
		
		JCheckBox cbUnlocked = new JCheckBox("");
		cbUnlocked.setBounds(437, 203, 24, 25);
		panelItemCreate.add(cbUnlocked);

		
		JSpinner spinnerDmg = new JSpinner();
		spinnerDmg.setToolTipText("");
		spinnerDmg.setBounds(112, 263, 41, 22);
		panelItemCreate.add(spinnerDmg);
		
		JLabel lblItemName = new JLabel("Name of Item:");
		lblItemName.setFont(new Font("Calibri", Font.BOLD, 18));
		lblItemName.setBounds(25, 22, 118, 23);
		lblItemName.setForeground(GuiColors.getColor(GuiColors.LIGHT_GRAY));
		panelItemCreate.add(lblItemName);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setForeground(new Color(169, 169, 169));
		lblDescription.setFont(new Font("Calibri", Font.BOLD, 18));
		lblDescription.setBounds(25, 64, 98, 23);
		panelItemCreate.add(lblDescription);
		
		JLabel lblValue = new JLabel("Value:");
		lblValue.setToolTipText("How much the item sells for");
		lblValue.setForeground(new Color(169, 169, 169));
		lblValue.setFont(new Font("Calibri", Font.BOLD, 18));
		lblValue.setBounds(25, 127, 57, 23);
		panelItemCreate.add(lblValue);
		
		JLabel lblHealing = new JLabel("Healing:");
		lblHealing.setToolTipText("How much the item sells for");
		lblHealing.setForeground(new Color(169, 169, 169));
		lblHealing.setFont(new Font("Calibri", Font.BOLD, 18));
		lblHealing.setBounds(25, 174, 71, 23);
		panelItemCreate.add(lblHealing);
		
		JLabel lblItemtype = new JLabel("ItemType:");
		lblItemtype.setForeground(new Color(169, 169, 169));
		lblItemtype.setFont(new Font("Calibri", Font.BOLD, 18));
		lblItemtype.setBounds(338, 127, 87, 23);
		panelItemCreate.add(lblItemtype);
		
		JLabel lblSubitemtype = new JLabel("SubItemType:");
		lblSubitemtype.setForeground(new Color(169, 169, 169));
		lblSubitemtype.setFont(new Font("Calibri", Font.BOLD, 18));
		lblSubitemtype.setBounds(338, 163, 118, 23);
		panelItemCreate.add(lblSubitemtype);
		
		
		JLabel lblStamina = new JLabel("Energy:");
		lblStamina.setToolTipText("How much the item sells for");
		lblStamina.setForeground(new Color(169, 169, 169));
		lblStamina.setFont(new Font("Calibri", Font.BOLD, 18));
		lblStamina.setBounds(25, 217, 71, 23);
		panelItemCreate.add(lblStamina);
		
		JLabel lblIsunlocked = new JLabel("isUnlocked");
		lblIsunlocked.setToolTipText("How much the item sells for");
		lblIsunlocked.setForeground(new Color(169, 169, 169));
		lblIsunlocked.setFont(new Font("Calibri", Font.BOLD, 18));
		lblIsunlocked.setBounds(338, 205, 98, 23);
		panelItemCreate.add(lblIsunlocked);
		
		JLabel lblDmg = new JLabel("Damage:");
		lblDmg.setToolTipText("How much the item sells for");
		lblDmg.setForeground(new Color(169, 169, 169));
		lblDmg.setFont(new Font("Calibri", Font.BOLD, 18));
		lblDmg.setBounds(25, 263, 71, 23);
		panelItemCreate.add(lblDmg);

		panelItemCreate.setVisible(false);

		return panelItemCreate;
		
	}
}
