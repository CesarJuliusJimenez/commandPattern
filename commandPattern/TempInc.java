package commandPattern;
public class TempInc implements Command{
    private Device device;

    public TempInc(Device device) {
        this.device = device;
    }

    public void execute(){
        device.tempInc();
    }
}
