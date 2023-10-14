package commandPattern;
public class PrevSong implements Command{
    private Device device;

    public PrevSong(Device device) {
        this.device = device;
    }

    public void execute(){
        device.switchPrev();
    }
}
