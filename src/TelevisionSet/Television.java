package TelevisionSet;

public class Television {

    private String televisionName;
    private boolean izOn;
    private int channel = 0;
    private int volume;
    private int brightness = 1;
    private int contrast = 1;
    private int sharpness = 1;
    private int colour = 1;
    private String videoQuality;
    private String audioQuality;

    public Television(String televisionName) {
        this.televisionName = televisionName;
    }

    public boolean itIsOn(){
        return izOn;
    }

    public void turnItOn() {
        izOn = true;
    }

    public void turnItOff() {
        izOn = false;
    }

    public int getChannel() {
        return channel;
    }

    public void changeChannel(int newChannel) {
        channel = newChannel;
    }


    public int getVolume() {
        return volume;
    }

    public void increaseVolume() {
        if(volume < 100)
        volume++;
    }

    public void decreaseVolume() {
        if(volume > 0)
        volume--;
    }

    public int getBrightness() {
        return brightness;
    }

    public void increaseBrightness() {
        if(brightness < 50)
        brightness++;
    }

    public void decreaseBrightness() {
        if(brightness > 1)
         brightness--;
    }

    public int getContrast() {
        return contrast;
    }

    public void increaseContrast() {
        if(contrast < 50)
        contrast++;
    }

    public void decreaseContrast() {
        if(contrast > 1)
        contrast--;
    }

    public int getSharpness() {
        return sharpness;
    }

    public void increaseSharpness() {
        if(sharpness < 50)
        sharpness++;
    }

    public void decreaseSharpness() {
        if(sharpness > 1)
        sharpness--;
    }

    public int getColour() {
        return colour;
    }

    public void increaseColour() {
        if(colour < 50)
        colour++;
    }

    public void decreaseColour() {
        if(colour > 1)
        colour--;
    }

    public void setVideoQuality(int callCard) {
        if(callCard == 1){
            brightness = 50;
            videoQuality = "Dynamic";
        }
        if(callCard == 2){
            brightness = 22;
            videoQuality = "Standard";
        }
        if(callCard == 3){
            brightness = 44;
            videoQuality = "Natural";
        }
        if(callCard == 4){
            brightness = 33;
            videoQuality = "Movie";
        }
        if(callCard == 5){
            brightness = 13;
            videoQuality = "FilmMaker Mode";
        }
        if(callCard < 1 || callCard > 5){
            brightness = brightness;
            videoQuality = videoQuality;
        }
    }

    public String getVideoQuality() {
        return videoQuality;
    }

    public void setAudioQuality(int callCard) {
        if(callCard == 1){
            audioQuality = "Standard";
        }
        if(callCard == 2){
            audioQuality = "Adaptive";
        }
        if(callCard == 3){
            audioQuality = "Amplify";
        }
        if(callCard < 1 || callCard > 3){
            audioQuality = audioQuality;
        }
    }

    public String getAudioQuality() {
        return audioQuality;
    }
}
