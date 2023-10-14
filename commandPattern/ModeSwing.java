package commandPattern;
public class ModeSwing implements Command{
    private Device device;

    public ModeSwing(Device device) {
        this.device = device;
    }
    @Override
    public void execute() {
        device.modeSwing();
    }
}
