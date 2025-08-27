package example.interfacedemo.devices;

public class SmartPhone implements Phone,MusicPlayer,Camera{
    @Override
    public void takePhoto() {
        System.out.println("taking photo..........");
    }

    @Override
    public void recordVideo() {
        System.out.println("recording video.........");
    }

    @Override
    public void playMusic() {
        System.out.println("playing music......");
    }

    @Override
    public void stopMusic() {
        System.out.println("stop music!!!!");
    }

    @Override
    public void makaCall(String number) {
        System.out.println("calling from "+number+" number");
    }

    @Override
    public void endCall() {
        System.out.println("call end!!!!");
    }
}
