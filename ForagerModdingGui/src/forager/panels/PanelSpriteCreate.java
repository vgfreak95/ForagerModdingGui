package forager.panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;

import forager.gui.GuiColors;
import forager.objects.Item;

public class PanelSpriteCreate extends JPanel implements ActionListener {
	
	//Panels and JComponents
	private JPanel panelSpriteCreate;
	private JPanel panelImageDisplayer;
	
	private JLabel lblNameOfSprite;
	private JLabel lblNumberOfFrames;
	private JLabel lblImageSmooth;
	private JLabel lblRemoveBackground;
	private JLabel lblCenterX;
	private JLabel lblCenterY;
	private JLabel lblImage;
	
	private JTextField txtSpriteName;
	
	private JButton btnBrowse;
	private JButton btnRefresh;
	
	private JSpinner spinnerFrameNumber;
	private JSpinner spinnerX;
	private JSpinner spinnerY;
	
	private JCheckBox checkSmooth;
	private JCheckBox checkBackground;
	
	Thread thread = new Thread();
	
	//Variables
	public static JFileChooser fc = new JFileChooser();
    public static JLabel filename = new JLabel();

	public Integer spinnerXValue;
	public Integer spinnerYValue;
	
	private Image scaledImage;
	private ImageIcon imageIcon;
	
	
	public PanelSpriteCreate() { }
	
	private Image getScaledImage(Image srcImg, int w, int h) {
		
	    BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
	    Graphics2D g2 = resizedImg.createGraphics();

	    g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
	    g2.drawImage(srcImg, 0, 0, w, h, null);
	    g2.dispose();

	    return resizedImg;
	    
	}
	
	
	public JPanel getPanelSpriteCreate() {
		
		
		
		panelSpriteCreate = new JPanel();
		panelSpriteCreate.setBounds(0, 162, 682, 350);
		panelSpriteCreate.setBackground(GuiColors.getColor(GuiColors.DARK_GRAY));
		panelSpriteCreate.setLayout(null);
		
		
		
		lblNameOfSprite = new JLabel("Name of Sprite:");
		lblNameOfSprite.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNameOfSprite.setBounds(45, 49, 125, 20);
		lblNameOfSprite.setForeground(GuiColors.getColor(GuiColors.LIGHT_GRAY));
		panelSpriteCreate.add(lblNameOfSprite);
		

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
		panelSpriteCreate.add(txtSpriteName);
		
		
		
		lblNumberOfFrames = new JLabel("Number of Frames:");
		lblNumberOfFrames.setForeground(new Color(169, 169, 169));
		lblNumberOfFrames.setFont(new Font("Calibri", Font.BOLD, 18));
		lblNumberOfFrames.setBounds(45, 122, 157, 20);
		panelSpriteCreate.add(lblNumberOfFrames);
		
		
		
		spinnerFrameNumber = new JSpinner();
		spinnerFrameNumber.setBounds(214, 121, 41, 22);
		panelSpriteCreate.add(spinnerFrameNumber);
		
		
		
		lblImageSmooth = new JLabel("Image Smooth?");
		lblImageSmooth.setForeground(new Color(169, 169, 169));
		lblImageSmooth.setFont(new Font("Calibri", Font.BOLD, 18));
		lblImageSmooth.setBounds(45, 182, 125, 20);
		panelSpriteCreate.add(lblImageSmooth);
		
		
		
		checkSmooth = new JCheckBox("");
		checkSmooth.setBounds(182, 180, 25, 25);
		checkSmooth.setBackground(GuiColors.getColor(GuiColors.DARK_GRAY));
		panelSpriteCreate.add(checkSmooth);
		
		
		
		lblRemoveBackground = new JLabel("Remove Background?");
		lblRemoveBackground.setForeground(new Color(169, 169, 169));
		lblRemoveBackground.setFont(new Font("Calibri", Font.BOLD, 18));
		lblRemoveBackground.setBounds(45, 243, 174, 20);
		panelSpriteCreate.add(lblRemoveBackground);
		
		
		
		checkBackground = new JCheckBox("");
		checkBackground.setBackground(new Color(60, 60, 60));
		checkBackground.setBounds(215, 241, 25, 25);
		panelSpriteCreate.add(checkBackground);
		
		
		
		btnBrowse = new JButton("Browse");
		btnBrowse.setFocusPainted(false);
		btnBrowse.setBounds(416, 23, 92, 35);
		btnBrowse.setForeground(new Color(245, 245, 245));
		btnBrowse.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		btnBrowse.setBackground(new Color(70, 130, 180));
		btnBrowse.addActionListener(this);
		panelSpriteCreate.add(btnBrowse);
		
		btnRefresh = new JButton("Refresh");
		btnRefresh.setFocusPainted(false);
		btnRefresh.setBounds(550, 23, 92, 35);
		btnRefresh.setForeground(new Color(245, 245, 245));
		btnRefresh.setFont(new Font("Bahnschrift", Font.PLAIN, 13));
		btnRefresh.setBackground(new Color(70, 130, 180));
		btnRefresh.addActionListener(this);
		panelSpriteCreate.add(btnRefresh);
		
		
		
		spinnerX = new JSpinner();
		spinnerX.setBounds(438, 315, 41, 22);
		panelSpriteCreate.add(spinnerX);
		
		
		
		spinnerY = new JSpinner();
		spinnerY.setBounds(532, 315, 41, 22);
		panelSpriteCreate.add(spinnerY);
		
		
		
		lblCenterX = new JLabel("CenterX");
		lblCenterX.setForeground(new Color(169, 169, 169));
		lblCenterX.setFont(new Font("Calibri", Font.BOLD, 18));
		lblCenterX.setBounds(426, 286, 69, 20);
		panelSpriteCreate.add(lblCenterX);
		
		
		
		lblCenterY = new JLabel("CenterY");
		lblCenterY.setForeground(new Color(169, 169, 169));
		lblCenterY.setFont(new Font("Calibri", Font.BOLD, 18));
		lblCenterY.setBounds(522, 286, 69, 20);
		panelSpriteCreate.add(lblCenterY);
		
		
		
		
		
		int panelImageX = 416;
		int panelImageY = 80;
		int panelImageWidth = 192;
		int panelImageHeight = 192;
		
		panelImageDisplayer = new JPanel();

		panelImageDisplayer.setBounds(panelImageX, panelImageY, 192, 192);
		panelImageDisplayer.setLayout(null);
		panelImageDisplayer.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, (new Color(102, 183, 227))));
		panelImageDisplayer.setBackground(GuiColors.getColor(GuiColors.DARK_GRAY));
		
		panelSpriteCreate.add(panelImageDisplayer);
		
		lblImage = new JLabel("");
	
		//lblImage.setBounds(96 - (lblImage.getWidth()/2), 96 - (lblImage.getHeight()/2), 30, 30);
		lblImage.setBounds(416, 80, 192, 192);
		//panelImageDisplayer.set
		panelImageDisplayer.add(lblImage);

		
		return panelSpriteCreate;
		//Item wood = new Item("Fist", );
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
        if (e.getSource() == btnBrowse) {

            int returnVal = fc.showOpenDialog(null);

            if (returnVal == JFileChooser.APPROVE_OPTION) {

                File file = fc.getSelectedFile();
                //System.out.println(file.getAbsolutePath());
                
                File image;
                BufferedImage fileImage;

                try {
                	
                	image = new File(file.getAbsolutePath());

                    scaledImage = getScaledImage(ImageIO.read(image), 192, 192);
                    imageIcon = new ImageIcon(scaledImage);
                    lblImage.setBounds(416, 80, 192, 192);
                    lblImage.setIcon(imageIcon);
                    //System.out.println(image);
					
				} catch (IOException e1) {
					e1.printStackTrace();
				}
            	
        		
            	setImageBounds();

            }

        }
        
        else if (e.getSource() == btnRefresh) {
        	
    		int lblImageX = 96;
    		int lblImageY = 96;
        	
        	spinnerXValue = (Integer) spinnerX.getValue();
        	spinnerYValue = (Integer) spinnerY.getValue();
        	
        	
        	lblImage.setBounds(lblImageX - (lblImage.getWidth()/2) + spinnerXValue, lblImageY - (lblImage.getHeight()/2) + spinnerYValue, 192, 192);

        }
		
	}
	
	public void setImageBounds() {
		
		int lblImageX = 96;
		int lblImageY = 96;
		
		lblImage.setBounds(lblImageX - (lblImage.getWidth()/2), lblImageY - (lblImage.getHeight()/2), 192, 192);
		
	}
	
	public void setVisibility(boolean b) {
		setVisible(b);
	}
	
	
}
