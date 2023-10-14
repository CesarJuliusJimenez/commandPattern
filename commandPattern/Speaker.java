package commandPattern;
import java.util.*;

public class Speaker implements Device {
    private int vol = 0;
    private int num = 0;

    private String song1 = "Wicked Games by Kiana Lede";
    private String song2 = "On Top of the World by Imagine Dragons";
    private String song3 = "House of Gold by Twenty One Pilots";
    private String song4 = "Valentine by Laufey";

    String[] songs = {song1, song2, song3, song4};

    @Override
    public void switchOn() {
        System.out.println("Speaker is switched on!");

    }

    @Override
    public void switchOff() {
        System.out.println("Speaker is switched off!");
        vol = 0;
    }

    @Override
    public void volumeUp() {
        ++vol;
        System.out.println("Speaker Volume = " + vol);
    }

    @Override
    public void volumeDown() {
        --vol;
        if (vol < 0) { vol = 0; }
        System.out.println("Speaker Volume = " + vol);
    }

    @Override
    public void dimMode() {

    }

    @Override
    public void brightMode() {

    }

    @Override
    public void playMusic() {
        System.out.println("Now playing " + "[" + songs[num] + "]");
    }

    @Override
    public void switchNext() {
        if (num < 4)
        {
            num++;
            if (num == 4) {
                num = 0;
            }
        } else {
            num = 0;
        }
        System.out.println("Playing next song: " + "[" + songs[num] + "]");
    }

    @Override
    public void switchPrev() {
        if (num > 0) {
            num--;
        } else {
            num = 3;
        }
        System.out.println("Playing previous song: " + "[" + songs[num] + "]");
    }

    @Override
    public void tempInc() {

    }

    @Override
    public void tempDec() {

    }

    @Override
    public void modeSwing() {

    }

    @Override
    public void modeSteady() {

    }
}
