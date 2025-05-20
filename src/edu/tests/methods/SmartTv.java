package edu.tests.methods;

public class SmartTv {
    boolean turnOn = false;
    int channel = 1;
    int volume = 25;

    // Tv Status
    public void turnOn() {
        turnOn = true;
        System.out.println("Is On?: " + turnOn);
    }

    public void turnOff() {
        turnOn = false;
        System.out.println("Is On?: " + turnOn);
    }

    // Channel
    public void changeChannel(int newChannel) {
        channel = newChannel;
        System.out.println("Channel: " + channel);
    }

    // Volume
    public void turnUpVolume() {
        volume++;
        System.out.println("Volume:" + volume);
    }

    public void turnDownVolume() {
        volume--;
        System.out.println("Volume:" + volume);
    }
}
