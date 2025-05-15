package edu.tests.intro;

public class StudentsGrade {
    public static void main(String[] args) {
        double FinalGrade = 6.2;

        if (FinalGrade < 6)
            System.out.println("Reprovado");
        else if (FinalGrade == 6)
            System.out.println("Aprovado");
        else
            System.out.println("Aprovado com honra");
    }
}