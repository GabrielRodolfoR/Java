package edu.tests.methods;

public class User {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.turnOn();

        smartTv.turnUpVolume();
        smartTv.turnDownVolume();

        smartTv.changeChannel(5);
    }
}
