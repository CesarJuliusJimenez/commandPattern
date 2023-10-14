package commandPattern;
public class NextSong implements Command{
    private Device device;

    public NextSong(Device device) {
        this.device = device;
    }

    public void execute(){
        device.switchNext();
    }
}
