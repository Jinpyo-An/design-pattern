package ch06_command.simple_command;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        final Light light = new Light();
        final LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        final GarageDoor garageDoor = new GarageDoor();
        final GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(garageDoorOpenCommand);
        remote.buttonWasPressed();
    }
}
