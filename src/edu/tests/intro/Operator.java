package edu.tests.intro;

public class Operator {
    public static void main(String[] args) {
        String concatenar = "?";

        concatenar = 1 + 1 + 1 + "1";

        System.out.println(concatenar);

        concatenar = 1 + "1" + 1 + 1;

        System.out.println(concatenar);

        concatenar = 1 + "1" + 1 + "1";

        System.out.println(concatenar);

        concatenar = "1" + (1 + 1 + 1);

        System.out.println(concatenar);
    }
}
