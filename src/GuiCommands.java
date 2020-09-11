package ForagerModGui;

import java.util.Stack;

public class GuiCommands {

    public static Stack<Sprite> SpriteStack = new Stack<Sprite>();
    
    /** This method creates a Sprite object and then adds it to the global Sprite Stack
     * 
     * @param sprName - The name of the sprite
     * @param sprLocation - The path/location of the sprite
     * @param numOfFrames - The number of frames that the image has, 0 for default
     * @param removeBackground - Removes the background of the sprite, true for default
     * @param smoothImage - Makes the image smoothed out, false for default
     * @param xCenter - The x coord for the center of the sprite
     * @param yCenter - The y coord for the center of the sprite
     */
    public static void CreateSprite(String sprName, String sprLocation, int numOfFrames, boolean removeBackground, boolean smoothImage, double xCenter, double yCenter) {
        Sprite spr = new Sprite(sprName, sprLocation, numOfFrames, removeBackground, smoothImage, xCenter, yCenter);
        SpriteStack.push(spr);
    }
    
    
    /**
     * Take a sprite and then converts it to GML Code
     * @param s - The sprite that you would like to convert to code
     * @return - GML Code for sprite_add()
     */
    public static String SpriteInterpreter(Sprite s){

        String gmlCode = ("global." + s.sprName + " = " + "sprite_add(" + "\"" + s.sprLocation + "\", " + s.numOfFrames + ", " + s.removeBackround + ", " + s.smoothImage + ", " + s.xCenter + ", " + s.yCenter + ");");
        return gmlCode;
    }
}