package commandPattern;
import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    private List<Command> commandList = new ArrayList<>();

    public void commandBox (Command command) {
        commandList.add(command);
    }

    public void clickButton() {
       for (Command command : commandList) {
           command.execute();
       }
       commandList.clear();
    }



}
