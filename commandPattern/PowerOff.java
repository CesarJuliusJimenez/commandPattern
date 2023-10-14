package commandPattern;
public class PowerOff implements Command{

    private Device device;

    public PowerOff(Device device) {
        this.device = device;
    }

    public void execute() {
        device.switchOff();
    }

}
