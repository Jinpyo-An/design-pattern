package ch06_command.simple_command;

public class GarageDoorOpenCommand implements Command{
    GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
        garageDoor.down();
        garageDoor.stop();
        garageDoor.lightOn();
        garageDoor.lightOff();
    }
}
