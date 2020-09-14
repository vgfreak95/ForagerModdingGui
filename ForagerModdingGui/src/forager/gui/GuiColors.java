package forager.gui;
import java.awt.Color;

/**
 * Container for the colors used for the Gui Class
 * @author VGFreak95
 * 
 */
public enum GuiColors {
	
	LIGHT_GRAY(169, 169, 169),
	LIGHT_BLUE(102, 183, 227),
	DARK_GRAY(60, 60, 60),
	DARK_BLUE(30, 144, 255),
	MOON_GRAY(112, 128, 144),
	PURE_ORANGE(210, 105, 30);
	
    private int r, g, b;

    private GuiColors(){}
 
    private GuiColors(int r, int g, int b) {
    	
    	this.r = r;
    	this.g = g;
    	this.b = b;
    	
    }
    
    /**
     * Takes in a color from the GuiColors Enum and converts it to a color object
     * @param col - The color from the enum
     * @return color - A color object
     */
    public static Color getColor(GuiColors col) {
    	
		Color color = new Color(col.r, col.g, col.b);
		return color;
    	
    }
    
}
