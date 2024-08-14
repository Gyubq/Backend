package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {

        RemoteControl rc;

        rc = new Audio();
        rc.setVolume(2);
        rc.turnOn();
        rc.turnOff();

        rc = new Television();

        rc.turnOff();
        rc.setVolume(6);
        rc.turnOn();
    }
}
