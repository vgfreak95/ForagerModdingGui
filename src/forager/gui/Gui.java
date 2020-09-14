package forager.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import forager.panels.*;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;

public class Gui extends JFrame {

	private JPanel contentPane;
	private PanelWelcome panelWelcome;
	
	private PanelTop panelTop;
	
	private PanelSpriteCreate panelSpriteCreate;
	
	
	private PanelBottom panelBottom;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui frame = new Gui();
					//PanelWelcome pw = new PanelWelcome();
					//System.out.println(pw);
					//frame.setSize(700, 600);

					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Gui() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		panelTop = new PanelTop();
		contentPane.add(panelTop.getPanelTop());
		
		panelBottom = new PanelBottom();
		contentPane.add(panelBottom.getPanelBottom());
		
		panelSpriteCreate = new PanelSpriteCreate();
		contentPane.add(panelSpriteCreate.getPanelSpriteCreate());
		
	}
}

/*
package me.forager.gui;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.BorderUIResource;
import javax.swing.border.Border;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;

import java.util.ArrayList;

public class Gui extends JFrame implements ActionListener {


public String currentPanel = "something";
private JPanel panelMain;
private JTextField textField;

//Panel Order Final
public JPanel panelSpriteCreate;
public JPanel panelItemCreate;

//public String[] panelArray = {"panelSpriteCreate", "panelItemCreate"};
ArrayList<String> panelArrayList = new ArrayList<String>();

private JButton buttonContinue;
private JButton buttonBack;

public enum panels {
	
	panelSpriteCreate,
	panelItemCreate,

}


public static void main(String[] args) {

	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				Gui frame = new Gui();
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	});
}


public Gui() {
	
	initPanelArray();
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 648, 616);
	panelMain = new JPanel();
	panelMain.setBackground(new Color(60, 60, 60));
	panelMain.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(panelMain);
	
	panelMain.setLayout(null);
	
	JPanel panelTop = new JPanel();
	FlowLayout fl_panelTop = (FlowLayout) panelTop.getLayout();
	panelTop.setBackground(new Color(30, 144, 255));
	panelTop.setBounds(0, 0, 630, 157);
	panelMain.add(panelTop);
	
	JLabel lblNewLabel = new JLabel("");
	lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel.setIcon(new ImageIcon(getClass().getResource("ForagerIconGui.png")));
	panelTop.add(lblNewLabel);
	
	Color textForegroundColor = new Color(169, 169, 169);
	Color textBackgroundColor = new Color(60, 60, 60);
	
	JPanel panelBottom = new JPanel();
	panelBottom.setBackground(new Color(112, 128, 144));
	panelBottom.setBounds(0, 489, 630, 80);
	panelMain.add(panelBottom);
	panelBottom.setLayout(null);
	
	buttonContinue = new JButton("CONTINUE");
	buttonContinue.addActionListener(this);
	buttonContinue.setBounds(459, 16, 148, 51);
	buttonContinue.setForeground(new Color(245, 245, 245));
	buttonContinue.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
	buttonContinue.setBackground(new Color(210, 105, 30));
	panelBottom.add(buttonContinue);
	
	buttonBack = new JButton("BACK");
	buttonBack.addActionListener(this);
	buttonBack.setBounds(20, 16, 148, 51);
	buttonBack.setForeground(new Color(245, 245, 245));
	buttonBack.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
	buttonBack.setBackground(new Color(210, 105, 30));
	panelBottom.add(buttonBack);


	panelSpriteCreate = new JPanel();
	panelSpriteCreate.setBounds(0, 155, 630, 338);
	panelSpriteCreate.setBackground(textBackgroundColor);
	panelSpriteCreate.setName("panelSpriteCreate");
	panelMain.add(panelSpriteCreate);
	
	setCurrentPanel(panelSpriteCreate.getName());
	//System.out.println(panelSpriteCreate.getName());
	panelSpriteCreate.setLayout(null);
	
	textField = new JTextField();
	textField.setBounds(145, 61, 130, 34);
	textField.setText("Item Name");
	textField.setSelectionColor(new Color(102, 183, 227));
	textField.setForeground(new Color(169, 169, 169));
	textField.setFont(new Font("Calibri", Font.PLAIN, 17));
	textField.setColumns(10);
	textField.setCaretColor(new Color(102, 183, 227));
	textField.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, (new Color(102, 183, 227))));
	textField.setBackground(new Color(60, 60, 60));
	panelSpriteCreate.add(textField);
	
	JLabel label = new JLabel("Name of Item:");
	label.setBounds(30, 66, 103, 22);
	label.setForeground(new Color(169, 169, 169));
	label.setFont(new Font("Calibri", Font.BOLD, 17));
	panelSpriteCreate.add(label);
	
	JButton button = new JButton("Browse");
	button.setBounds(399, 13, 92, 35);
	button.setForeground(new Color(245, 245, 245));
	button.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
	button.setBackground(new Color(70, 130, 180));
	panelSpriteCreate.add(button);
	
	JPanel panel = new JPanel();
	panel.setBounds(399, 61, 199, 193);
	panel.setForeground(new Color(169, 169, 169));
	panel.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, (new Color(102, 183, 227))));
	panel.setBackground(new Color(60, 60, 60));
	panelSpriteCreate.add(panel);
	
	JSpinner spinnerFrameNumber = new JSpinner();
	spinnerFrameNumber.setBounds(189, 115, 48, 26);
	spinnerFrameNumber.setOpaque(false);
	spinnerFrameNumber.setFont(new Font("Cambria", Font.PLAIN, 15));
	panelSpriteCreate.add(spinnerFrameNumber);
	
	JLabel label_1 = new JLabel("Number of Frames:");
	label_1.setBounds(30, 118, 137, 22);
	label_1.setForeground(new Color(169, 169, 169));
	label_1.setFont(new Font("Calibri", Font.BOLD, 17));
	panelSpriteCreate.add(label_1);
	
	JLabel label_2 = new JLabel("CenterX");
	label_2.setBounds(419, 269, 57, 22);
	label_2.setForeground(new Color(169, 169, 169));
	label_2.setFont(new Font("Calibri", Font.BOLD, 17));
	panelSpriteCreate.add(label_2);
	
	JLabel label_3 = new JLabel("CenterY");
	label_3.setBounds(520, 269, 57, 22);
	label_3.setForeground(new Color(169, 169, 169));
	label_3.setFont(new Font("Calibri", Font.BOLD, 17));
	panelSpriteCreate.add(label_3);
	
	JSpinner spinnerX = new JSpinner();
	spinnerX.setBounds(429, 299, 48, 26);
	spinnerX.setFont(new Font("Cambria", Font.PLAIN, 15));
	panelSpriteCreate.add(spinnerX);
	
	JSpinner spinnerY = new JSpinner();
	spinnerY.setBounds(520, 299, 48, 26);
	spinnerY.setFont(new Font("Cambria", Font.PLAIN, 15));
	panelSpriteCreate.add(spinnerY);
	
	JLabel label_4 = new JLabel("Image Smooth?");
	label_4.setBounds(30, 184, 111, 22);
	label_4.setForeground(new Color(169, 169, 169));
	label_4.setFont(new Font("Calibri", Font.BOLD, 17));
	panelSpriteCreate.add(label_4);
	
	JCheckBox checkBoxSmooth = new JCheckBox("");
	checkBoxSmooth.setBounds(149, 181, 25, 25);
	checkBoxSmooth.setBackground(new Color(60, 60, 60));
	panelSpriteCreate.add(checkBoxSmooth);
	
	JLabel label_5 = new JLabel("Remove Background?");
	label_5.setBounds(30, 242, 154, 22);
	label_5.setForeground(new Color(169, 169, 169));
	label_5.setFont(new Font("Calibri", Font.BOLD, 17));
	panelSpriteCreate.add(label_5);
	
	JCheckBox checkBox_1 = new JCheckBox("");
	checkBox_1.setBounds(189, 242, 25, 25);
	checkBox_1.setBackground(new Color(60, 60, 60));
	panelSpriteCreate.add(checkBox_1);

	panelItemCreate = new JPanel();
	panelItemCreate.setLayout(null);
	panelItemCreate.setBackground(new Color(60, 60, 60));
	panelItemCreate.setBounds(0, 155, 630, 338);
	panelItemCreate.setName("panelItemCreate");
	panelMain.add(panelItemCreate);

	JLabel labelItemCreate = new JLabel("Item Create");
	labelItemCreate.setBounds(30, 242, 154, 22);
	labelItemCreate.setForeground(new Color(169, 169, 169));
	labelItemCreate.setFont(new Font("Calibri", Font.BOLD, 17));
	panelItemCreate.add(labelItemCreate);
}

public void setCurrentPanel(String panelName) {
	currentPanel = panelName;
	if (currentPanel.equals("panelSpriteCreate")) {
		buttonBack.setVisible(false);
	}
	else {
		buttonBack.setVisible(true);
	}
}

@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource() == buttonContinue) {
		movePanelForward(currentPanel);
		//System.out.println("Hello World");
		
	}

	else if (e.getSource() == buttonBack) {
		movePanelBack(currentPanel);
	}
		
}
	

public void movePanelForward(String panelName) {
	
	switch(panelName) {
	
		case "panelSpriteCreate":
			System.out.println("Switching Panels to Items");
			panelSpriteCreate.setVisible(false);
			panelItemCreate.setVisible(true);
			setCurrentPanel(panelItemCreate.getName());
			break;
			
		case "panelItemCreate":
			System.out.println("Switching Panels to Structures");
			setCurrentPanel(panelSpriteCreate.getName());
			break;
			
	}
}

public void movePanelBack(String panelName) {
	System.out.println(panelName);

	switch(panelName) {

		case "panelItemCreate":
			System.out.println("Switching Panels Back to Sprites");
			panelItemCreate.setVisible(false);
			panelSpriteCreate.setVisible(true);
			setCurrentPanel(panelSpriteCreate.getName());
			break;
			
	}
}



public void initPanelArray() {

	for (int i = 0; i<panels.values().length; i++) {

		panelArrayList.add(panels.values()[i].toString());
		
	}
	
}




}

*/
