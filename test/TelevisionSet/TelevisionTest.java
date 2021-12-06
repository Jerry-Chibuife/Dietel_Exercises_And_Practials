package TelevisionSet;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    Television tokunbo;

    @BeforeEach
    public void beforeEachTest(){
        tokunbo = new Television("Samsung Q-Led 1840");
    }


    @Test
    public void iCanTurnOnTheTelevision(){
        assertFalse(tokunbo.itIsOn());
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
    }

    @Test
    public void iCanTurnTheTelevisionOff(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.turnItOff();
        assertFalse(tokunbo.itIsOn());
    }

    @Test
    public void iCanSwitchChannelsOnTheTelevision(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        int channel = tokunbo.getChannel();
        assertEquals(0, channel);
        tokunbo.changeChannel(9);
        assertEquals(9, tokunbo.getChannel());
    }

    @Test
    public void theChannelIsAsLastSetAfterRestartTest(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.changeChannel(67);
        assertEquals(67, tokunbo.getChannel());
        tokunbo.turnItOff();
        assertFalse(tokunbo.itIsOn());
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        int channel = tokunbo.getChannel();
        assertEquals(67, channel);
    }

    @Test
    public void iCanIncreaseVolumeOfTheTelevision(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        int volume = tokunbo.getVolume();
        assertEquals(0, volume);
        tokunbo.increaseVolume();
        assertEquals(1, tokunbo.getVolume());
    }

    @Test
    public void iCanDecreaseVolumeOfTheTelevision(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.increaseVolume();
        tokunbo.increaseVolume();
        int volume = tokunbo.getVolume();
        assertEquals(2, volume);
        tokunbo.decreaseVolume();
        assertEquals(1, tokunbo.getVolume());
    }

    @Test
    public void volumeRemainsTheSameAfterRestart(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        for(int a = 1; a < 17; a++){
            tokunbo.increaseVolume();
        }
        assertEquals(16, tokunbo.getVolume());
        tokunbo.turnItOff();
        assertFalse(tokunbo.itIsOn());
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        int volume = tokunbo.getVolume();
        assertEquals(16, volume);
    }

    @Test
    public void volumeCanNotBeIncreasedPast100(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        for(int a = 1; a <= 100; a++){
            tokunbo.increaseVolume();
        }
        int volume = tokunbo.getVolume();
        assertEquals(100, volume);
        tokunbo.increaseVolume();
        assertEquals(100, tokunbo.getVolume());
    }

    @Test
    public void volumeCanNotBeDecreasedBelow0(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        int volume = tokunbo.getVolume();
        assertEquals(0, volume);
        tokunbo.decreaseVolume();
        assertEquals(0, tokunbo.getVolume());
    }

    @Test
    public void iCanIncreaseBrightnessOfTheTelevision(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        int brightness = tokunbo.getBrightness();
        assertEquals(1, brightness);
        tokunbo.increaseBrightness();
        assertEquals(2, tokunbo.getBrightness());
    }

    @Test
    public void iCanDecreaseBrightnessOfTheTelevision(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.increaseBrightness();
        tokunbo.increaseBrightness();
        tokunbo.increaseBrightness();
        tokunbo.increaseBrightness();
        assertEquals(5, tokunbo.getBrightness());
        tokunbo.decreaseBrightness();
        assertEquals(4, tokunbo.getBrightness());
    }

    @Test
    public void brightnessCanNotBeIncreasedBeyond50(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        assertEquals(1, tokunbo.getBrightness());
        for(int a = 1; a < 50; a++){
            tokunbo.increaseBrightness();
        }
        assertEquals(50, tokunbo.getBrightness());
        tokunbo.increaseBrightness();
        assertEquals(50, tokunbo.getBrightness());
    }

    @Test
    public void brightnessCanNotBeDecreasedBelow1(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.decreaseBrightness();
        assertEquals(1, tokunbo.getBrightness());
    }

    @Test
    public void brightnessStartsOffAs1(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        assertEquals(1, tokunbo.getBrightness());
    }

    @Test
    public void iCanIncreaseTheTelevisionContrast(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        int contrast = tokunbo.getContrast();
        assertEquals(1, contrast);
        tokunbo.increaseContrast();
        assertEquals(2, tokunbo.getContrast());
    }

    @Test
    public void iCanDecreaseTelevisionContrast(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.increaseContrast();
        tokunbo.increaseContrast();
        tokunbo.increaseContrast();
        assertEquals(4, tokunbo.getContrast());
        tokunbo.decreaseContrast();
        assertEquals(3, tokunbo.getContrast());
    }

    @Test
    public void contrastRemainsTheSameAfterRestart(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        for(int a = 1; a <= 40; a++) {
            tokunbo.increaseContrast();
        }
        assertEquals(41, tokunbo.getContrast());
        tokunbo.turnItOff();
        assertFalse(tokunbo.itIsOn());
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        assertEquals(41, tokunbo.getContrast());
    }

    @Test
    public void contrastCanNotBeIncreasedBeyond50(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        for(int a = 1; a < 50; a++){
            tokunbo.increaseContrast();
        }
        assertEquals(50, tokunbo.getContrast());
        tokunbo.increaseContrast();
        assertEquals(50, tokunbo.getContrast());
    }

    @Test
    public void contrastCanNotBeDecreasedBelow1(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.decreaseContrast();
        assertEquals(1, tokunbo.getContrast());
    }

    @Test
    public void iCanIncreaseTheTelevisionSharpness(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        int sharpness = tokunbo.getSharpness();
        assertEquals(1, sharpness);
        tokunbo.increaseSharpness();
        assertEquals(2, tokunbo.getSharpness());
    }

    @Test
    public void iCanDecreaseTelevisionSharpness(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.increaseSharpness();
        tokunbo.increaseSharpness();
        tokunbo.increaseSharpness();
        assertEquals(4, tokunbo.getSharpness());
        tokunbo.decreaseSharpness();
        assertEquals(3, tokunbo.getSharpness());
    }

    @Test
    public void sharpnessRemainsTheSameAfterRestart(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        for(int a = 1; a <= 40; a++) {
            tokunbo.increaseSharpness();
        }
        assertEquals(41, tokunbo.getSharpness());
        tokunbo.turnItOff();
        assertFalse(tokunbo.itIsOn());
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        assertEquals(41, tokunbo.getSharpness());
    }

    @Test
    public void sharpnessCanNotBeIncreasedBeyond50(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        for(int a = 1; a < 50; a++){
            tokunbo.increaseSharpness();
        }
        assertEquals(50, tokunbo.getSharpness());
        tokunbo.increaseSharpness();
        assertEquals(50, tokunbo.getSharpness());
    }

    @Test
    public void sharpnessCanNotBeDecreasedBelow1(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.decreaseSharpness();
        assertEquals(1, tokunbo.getSharpness());
    }

    @Test
    public void iCanIncreaseTheTelevisionColour(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        int contrast = tokunbo.getColour();
        assertEquals(1, contrast);
        tokunbo.increaseColour();
        assertEquals(2, tokunbo.getColour());
    }

    @Test
    public void iCanDecreaseTelevisionColour(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.increaseColour();
        tokunbo.increaseColour();
        tokunbo.increaseColour();
        assertEquals(4, tokunbo.getColour());
        tokunbo.decreaseColour();
        assertEquals(3, tokunbo.getColour());
    }

    @Test
    public void colourRemainsTheSameAfterRestart(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        for(int a = 1; a <= 40; a++) {
            tokunbo.increaseColour();
        }
        assertEquals(41, tokunbo.getColour());
        tokunbo.turnItOff();
        assertFalse(tokunbo.itIsOn());
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        assertEquals(41, tokunbo.getColour());
    }

    @Test
    public void colourCanNotBeIncreasedBeyond50(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        for(int a = 1; a < 50; a++){
            tokunbo.increaseColour();
        }
        assertEquals(50, tokunbo.getColour());
        tokunbo.increaseColour();
        assertEquals(50, tokunbo.getColour());
    }

    @Test
    public void colourCanNotBeDecreasedBelow1(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.decreaseColour();
        assertEquals(1, tokunbo.getColour());
    }

    @Test
    public void iCanChangeTheVideoQualityOfTheTelevision(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.setVideoQuality(4);
        assertEquals("Movie", tokunbo.getVideoQuality());
    }

    @Test
    public void iCanChangeTheAudioQualityOfTheTelevision(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.setAudioQuality(9);
        assertEquals(null, tokunbo.getAudioQuality());
    }

    @Test
    public void videoQualityDoesNotChangeAfterRestart(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.setVideoQuality(3);
        assertEquals("Natural", tokunbo.getVideoQuality());
        tokunbo.turnItOff();
        assertFalse(tokunbo.itIsOn());
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        assertEquals("Natural", tokunbo.getVideoQuality());
    }

    @Test
    public void audioQualityDoesNotChangeAfterRestart(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.setAudioQuality(3);
        assertEquals("Amplify", tokunbo.getAudioQuality());
        tokunbo.turnItOff();
        assertFalse(tokunbo.itIsOn());
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        assertEquals("Amplify", tokunbo.getAudioQuality());
    }

    @Test
    public void switchingVideoQualityAffectsBrightness(){
        tokunbo.turnItOn();
        assertTrue(tokunbo.itIsOn());
        tokunbo.setVideoQuality(1);
        assertEquals(50, tokunbo.getBrightness());
        for(int a = 1; a < 50; a++) {
            tokunbo.decreaseBrightness();
        }
        assertEquals(1, tokunbo.getBrightness());
        tokunbo.decreaseBrightness();
        assertEquals(1, tokunbo.getBrightness());
        tokunbo.setVideoQuality(4);
        assertEquals(33, tokunbo.getBrightness());
        tokunbo.setVideoQuality(8);
        assertEquals(33, tokunbo.getBrightness());
    }
}
