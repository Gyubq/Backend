package ch08.sec04;

public class  Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOff() {
        System.out.println("Television turning off");
    }

    @Override
    public void turnOn() {
        System.out.println("Television turning on");

    }

    @Override
    public void setVolume(int volume) {
        if (volume>RemoteControl.MAX_VOLUME) {
            volume = RemoteControl.MAX_VOLUME;
        }else if (volume<RemoteControl.MIN_VOLUME) {
            volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("TV 볼륨 "+volume);


    }
}
