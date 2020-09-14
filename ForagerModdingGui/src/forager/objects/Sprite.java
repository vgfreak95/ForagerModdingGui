package forager.objects;

public class Sprite {
    
    public String sprName = "";
    public String sprLocation = "";
    public int numOfFrames = 0;
    public boolean removeBackround = true;
    public boolean smoothImage = false;
    public double xCenter = 0;
    public double yCenter = 0;

    public Sprite(String sprName, String sprLocation, int numOfFrames, boolean removeBackground, boolean smoothImage, double xCenter, double yCenter) {
        
        this.sprName = sprName;
        this.sprLocation = sprLocation;
        this.numOfFrames = numOfFrames;
        this.removeBackround = removeBackground;
        this.smoothImage = smoothImage;
        this.xCenter = xCenter;
        this.yCenter = yCenter;

    }
    
    public String getSpriteGMLCode(Sprite spr) {
    	
    	String outputCode = String.format("global.Sprite_%s = sprite_add(\"%s\", %o, %b, %b, %f, %f);", spr.sprName, spr.sprLocation, spr.numOfFrames, spr.removeBackround, spr.smoothImage, spr.xCenter, spr.yCenter);
    	System.out.println(outputCode);
    	
    	return outputCode;
    	
    }
    
}