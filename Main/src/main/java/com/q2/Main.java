package com.q2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Turma turma = new Turma();

        turma.alunos[0] = new Aluno("Jose");
        turma.alunos[1] = new Aluno("Maria");
        turma.alunos[2] = new Aluno("Cleber");
        turma.alunos[3] = new Aluno("Antonio");
        turma.alunos[4] = new Aluno("Marcos");

        for(Aluno aluno : turma.alunos){

            System.out.println("Vez de: "+ aluno.getNome());
            System.out.println("Digite o nome do aluno para Voto: ");

            String nomeVotado = ler.next();

            for (Aluno alunoVotado : turma.alunos){
                if(alunoVotado.getNome().equalsIgnoreCase(nomeVotado)){
                    alunoVotado.setVotos(1);
                    break;
                }
            }

        }

        int maiorVoto = 0;
        String nomeMaiorVoto = "";
        System.out.println("Aluno mais votado :");

        for(Aluno aluno : turma.alunos){

            if(aluno.getVotos() > maiorVoto){
                maiorVoto = aluno.getVotos();
                nomeMaiorVoto = aluno.getNome();
            }

        }

        System.out.println("Vencedor e -> " + nomeMaiorVoto + " : " + maiorVoto);

        ler.close();
    }
}
