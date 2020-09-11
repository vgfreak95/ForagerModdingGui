package ForagerModGui;

public class Sprite {
    
    public String sprName = "";
    public String sprLocation = "";
    public int numOfFrames = 0;
    public boolean removeBackround = true;
    public boolean smoothImage = false;
    public double xCenter = 0;
    public double yCenter = 0;

    Sprite(String sprName, String sprLocation, int numOfFrames, boolean removeBackground, boolean smoothImage, double xCenter, double yCenter) {
        
        this.sprName = sprName;
        this.sprLocation = sprLocation;
        this.numOfFrames = numOfFrames;
        this.removeBackround = removeBackground;
        this.smoothImage = smoothImage;
        this.xCenter = xCenter;
        this.yCenter = yCenter;

    }
    
}
