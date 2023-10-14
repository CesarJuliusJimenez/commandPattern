package commandPattern;
public class ModeBright implements Command {
    private Device device;

    public ModeBright(Device device) {
        this.device = device;
    }
    @Override
    public void execute() {
        device.brightMode();
    }
}
