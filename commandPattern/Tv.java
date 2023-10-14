package commandPattern;
public class Tv implements Device {
    private int vol = 0;

    public void switchOn() {
        System.out.println("Tv is switched on!");

    }
    public void switchOff() {
        System.out.println("Tv is switched off!");

        vol = 0;
    }

    @Override
    public void volumeUp() {
        ++vol;
        System.out.println("TV Volume = " + vol);

    }

    @Override
    public void volumeDown() {
        --vol;
        if (vol < 0) { vol = 0; }
        System.out.println("TV Volume = " + vol);

    }

    public void dimMode() {

    }


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
