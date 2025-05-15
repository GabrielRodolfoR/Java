package edu.tests.intro;

public class NameConcat {
    public static void main(String[] args) {
        String primeiroNome = "Gabriel";
        String segundoNome = "Rodolfo";
        String terceiroNome = "Rabello";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome);
        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome, String terceiroNome) {
        return primeiroNome.concat(" ").concat(segundoNome).concat(" ").concat(terceiroNome);
    }
}