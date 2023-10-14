package commandPattern;
public class ModeDim implements Command {
    private Device device;

    public ModeDim(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.dimMode();
    }
}
