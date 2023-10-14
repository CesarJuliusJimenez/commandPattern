package commandPattern;
public class Lights implements Device {

    public void switchOn() {
        System.out.println("Lights are switched on!");
    }
    public void switchOff() {
        System.out.println("Lights are switched off!");
    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }

    @Override
    public void dimMode() {
        System.out.println("Lights are now in Dim Mode!");
    }

    @Override
    public void brightMode() {
        System.out.println("Lights are now in Bright Mode!");
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
