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

public class Gui extends JFrame{

	private JPanel paneMain;
	private JTextField textItemName;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public Gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 616);
		paneMain = new JPanel();
		paneMain.setBackground(new Color(60, 60, 60));
		paneMain.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(paneMain);
		paneMain.setLayout(null);
		
		JPanel panelTop = new JPanel();
		FlowLayout fl_panelTop = (FlowLayout) panelTop.getLayout();
		panelTop.setBackground(new Color(30, 144, 255));
		panelTop.setBounds(0, 0, 630, 157);
		paneMain.add(panelTop);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon("G:\\Users\\VGFreak\\eclipse-workspace\\ForagerGui\\bin\\ForagerIconGui.png"));
		panelTop.add(lblNewLabel);
		
		Color textForegroundColor = new Color(169, 169, 169);
		Color textBackgroundColor = new Color(60, 60, 60);
		
		textItemName = new JTextField();
		textItemName.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, (new Color(102, 183, 227))));
		textItemName.setFont(new Font("Calibri", Font.PLAIN, 16));
		textItemName.setForeground(textForegroundColor);
		textItemName.setText("Item Name");
		textItemName.setSelectionColor(new Color(102, 183, 227));
		textItemName.setCaretColor(new Color(102, 183, 227));
		textItemName.setBackground(textBackgroundColor);
		textItemName.setBounds(158, 196, 177, 36);
		paneMain.add(textItemName);
		textItemName.setColumns(10);
		
		JLabel lblNameOfItem = new JLabel("Name of Item:");
		lblNameOfItem.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNameOfItem.setForeground(textForegroundColor);
		lblNameOfItem.setBounds(28, 199, 118, 28);
		
		paneMain.add(lblNameOfItem);
		
		JButton btnBrowse = new JButton("Browse");
		btnBrowse.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		btnBrowse.setForeground(new Color(245, 245, 245));
		btnBrowse.setBackground(new Color(70, 130, 180));

		btnBrowse.setBounds(393, 183, 85, 33);
		paneMain.add(btnBrowse);
		
		JPanel panelItemDisplay = new JPanel();
		panelItemDisplay.setBounds(393, 235, 177, 165);
		panelItemDisplay.setForeground(textForegroundColor);
		panelItemDisplay.setBackground(textBackgroundColor);
		panelItemDisplay.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, (new Color(102, 183, 227))));
		paneMain.add(panelItemDisplay);
		
		JSpinner spinnerX = new JSpinner();
		spinnerX.setFont(new Font("Cambria", Font.PLAIN, 15));
		spinnerX.setBounds(393, 433, 55, 28);
		spinnerX.setOpaque(false);
		//spinner.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, (new Color(102, 183, 227))));
		paneMain.add(spinnerX);
		
		JLabel lblNumberOfFrames = new JLabel("Number of Frames:");
		lblNumberOfFrames.setForeground(new Color(169, 169, 169));
		lblNumberOfFrames.setFont(new Font("Calibri", Font.BOLD, 17));
		lblNumberOfFrames.setBounds(28, 274, 144, 28);
		paneMain.add(lblNumberOfFrames);
		
		JLabel lblCenterx = new JLabel("CenterX");
		lblCenterx.setForeground(new Color(169, 169, 169));
		lblCenterx.setFont(new Font("Calibri", Font.BOLD, 17));
		lblCenterx.setBounds(393, 407, 68, 28);
		paneMain.add(lblCenterx);
		
		JLabel lblCenterY = new JLabel("CenterY");
		lblCenterY.setForeground(new Color(169, 169, 169));
		lblCenterY.setFont(new Font("Calibri", Font.BOLD, 17));
		lblCenterY.setBounds(485, 407, 68, 28);
		paneMain.add(lblCenterY);
		
		JSpinner spinnerY = new JSpinner();
		spinnerY.setFont(new Font("Cambria", Font.PLAIN, 15));
		spinnerY.setBounds(485, 433, 55, 28);
		paneMain.add(spinnerY);
		
		JSpinner spinnerFrameCount = new JSpinner();
		spinnerFrameCount.setFont(new Font("Cambria", Font.PLAIN, 15));
		spinnerFrameCount.setBounds(184, 276, 55, 28);
		paneMain.add(spinnerFrameCount);
		
		JPanel panelBottom = new JPanel();
		panelBottom.setBackground(new Color(112, 128, 144));
		panelBottom.setBounds(0, 489, 630, 80);
		paneMain.add(panelBottom);
		panelBottom.setLayout(null);
		
		JButton buttonContinue = new JButton("CONTINUE");
		buttonContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		buttonContinue.setBounds(459, 16, 148, 51);
		buttonContinue.setForeground(new Color(245, 245, 245));
		buttonContinue.setFont(new Font("Bahnschrift", Font.PLAIN, 20));
		buttonContinue.setBackground(new Color(210, 105, 30));
		panelBottom.add(buttonContinue);
		
		JLabel lblImageSmooth = new JLabel("Image Smooth?");
		lblImageSmooth.setForeground(new Color(169, 169, 169));
		lblImageSmooth.setFont(new Font("Calibri", Font.BOLD, 17));
		lblImageSmooth.setBounds(28, 338, 118, 28);
		paneMain.add(lblImageSmooth);
		
		JCheckBox checkBoxSmooth = new JCheckBox("");
		checkBoxSmooth.setBounds(146, 339, 26, 25);
		checkBoxSmooth.setBackground(textBackgroundColor);
		paneMain.add(checkBoxSmooth);
		
		JLabel lblRemoveBackground = new JLabel("Remove Background?");
		lblRemoveBackground.setForeground(new Color(169, 169, 169));
		lblRemoveBackground.setFont(new Font("Calibri", Font.BOLD, 17));
		lblRemoveBackground.setBounds(28, 391, 160, 28);
		paneMain.add(lblRemoveBackground);
		
		JCheckBox checkBoxRemove = new JCheckBox("");
		checkBoxRemove.setBackground(new Color(60, 60, 60));
		checkBoxRemove.setBounds(190, 392, 26, 25);
		paneMain.add(checkBoxRemove);
	}
	
}
