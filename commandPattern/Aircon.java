package commandPattern;
import java.util.*;


public class Aircon implements Device {
    Scanner sc = new Scanner(System.in);
    private int min = 16;
    private int mid = 24;
    private int max = 31;
    private String timer = "";

    @Override
    public void switchOn() {
        System.out.println("Aircon switch is on!");
    }

    @Override
    public void switchOff() {
        System.out.println("Aircon switch is off!");
    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }

    @Override
    public void dimMode() {

    }

    @Override
    public void brightMode() {

    }

    @Override
    public void playMusic() {

    }

    @Override
    public void switchNext() {

    }

    @Override
    public void switchPrev() {

    }

    @Override
    public void tempInc() {
        if (mid < max) {
            ++mid;
            System.out.println("Aircon Temperature is increased to " + mid);
        } else if (mid == max) {
            System.out.println("Aircon reached maximum temperature!");
            System.out.println("Aircon Temperature is " + mid);
        }
    }

    @Override
    public void tempDec() {
        if (mid > min) {
            --mid;
            System.out.println("Aircon Temperature is decreased to " + mid);
        } else if (mid == min) {
            System.out.println("Aircon reached minimum temperature!");
            System.out.println("Aircon Temperature is " + mid);
        }
    }

    @Override
    public void modeSwing() {
        System.out.println("Aircon is now in Swing Mode!");
    }

    @Override
    public void modeSteady() {
        System.out.println("Aircon is now in Steady Mode!");
    }


}
