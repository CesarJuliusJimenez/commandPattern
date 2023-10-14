package commandPattern;
public class VolumeUp implements Command {
    private Device device;

    public VolumeUp(Device device) {
        this.device = device;
    }

    public void execute() {
        device.volumeUp();
    }
}
