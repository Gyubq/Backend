package ch08.sec04;

public class Audio implements RemoteControl {
    private int volum;

    @Override
    public void turnOff() {
        System.out.println("Turning off audio");
    }

    @Override
    public void turnOn() {
        System.out.println("Turning on audio");

    }

    @Override
    public void setVolume(int volume) {

        if (volume > RemoteControl.MAX_VOLUME) {
            this.volum = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volum = RemoteControl.MIN_VOLUME;
        } else {
            this.volum = volume;
        }
        System.out.println("현재볼륨  " + volume);
    }
}

