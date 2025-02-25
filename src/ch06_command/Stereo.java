package ch06_command;

public class Stereo {
    int volume;

    public void on() {
        System.out.println("스테레오가 켜졌습니다.");
    }

    public void setCD() {
        System.out.println("스테레오에 CD가 들어갔습니다.");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void off() {
        System.out.println("스테레오가 꺼졌습니다.");
    }
}
