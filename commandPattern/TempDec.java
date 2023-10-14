package commandPattern;
public class TempDec implements Command {
    private Device device;

    public TempDec(Device device) {
        this.device = device;
    }

    public void execute(){
        device.tempDec();
    }
}
