package edu.tests.intro;

public class Variables {
    public static void main(String[] args) throws Exception {
        int number = 5;
        final double PI_VALUE = 3.14;

        number = 10;
        // PI_VALUE = 10; can't modify an final value
        System.out.println(number);
        System.out.println(PI_VALUE);

    }
}
