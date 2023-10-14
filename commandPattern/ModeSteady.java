package commandPattern;
public class ModeSteady implements Command{
    private Device device;

    public ModeSteady(Device device) {
        this.device = device;
    }
    @Override
    public void execute() {
        device.modeSteady();
    }
}
