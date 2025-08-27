package example.interfacedemo.devices;

public class Test {
    public static void main(String[] args) {
        SmartPhone sm1=new SmartPhone();
        sm1.makaCall("9641177110");
        sm1.endCall();
        sm1.playMusic();
        sm1.stopMusic();
        sm1.takePhoto();
        sm1.recordVideo();

    }
}
