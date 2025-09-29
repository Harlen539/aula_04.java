package aula_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.print("Digite o nome: ");
        a.setNome(sc.nextLine());
        System.out.println("Nome: " + a.getNome());

        System.out.print("Insira sua matrícula: ");
        a.setMatricula(sc.nextInt());
        System.out.println("Matrícula: " + a.getMatricula());

        System.out.print("Insira sua primeira nota: ");
        a.setNota1(sc.nextDouble());
        System.out.println("Nota 1: " + a.getNota1());

        sc.close();
    }
}
