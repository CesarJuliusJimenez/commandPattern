package commandPattern;
public class PlayMusic implements Command{
    private Device device;

    public PlayMusic(Device device) {
        this.device = device;
    }

    public void execute(){
        device.playMusic();
    }
}
