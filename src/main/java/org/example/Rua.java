package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Rua {

    public void start(Lutador player1, Lutador player2) {
        System.out.println("STARTOU A BRIGA!");
        while (player1.getVida() > 0 && player2.getVida() > 0) {
            List<Lutador> lutadores = escolherQuemVaiAtacar(player1, player2);
            escolherGolpe(lutadores);

            System.out.println("O HP do "+ player1.getName() + " é igual a " + player1.getVida());
            System.out.println("O HP do "+ player2.getName() + " é igual a " + player2.getVida());
            System.out.println("---------------------------------------------------");
        }

        escolherVencedor(player1, player2);
    }

    private void escolherGolpe (List<Lutador> lutadores) {
        Random golpeValue = new Random();
        int sorteioDeGolpe = golpeValue.nextInt(4);

        switch(sorteioDeGolpe) {
            case 0:
                ataqueDuploFunction(lutadores.get(0), lutadores.get(1));
                break;
            case 1:
                lutadores.get(0).soltarMagia(lutadores.get(1));
                System.out.println(lutadores.get(0) + " Soltou a magia!!");
                break;
            case 2:
                System.out.println(lutadores.get(0).getName() + " está tentando dar um FATALITY");
                Random fatalityValue = new Random();
                int sorteioFatality = fatalityValue.nextInt(5);
                if (sorteioFatality == 4) {
                    lutadores.get(0).fatality(lutadores.get(1));
                    System.out.println(lutadores.get(0) + " FATALITY!!!!!!!!!!!!!!!!");
                }
                break;
            case 3:
                System.out.println(lutadores.get(0).getName() + " está tentando cometer suicidio");
                Random suicidioValue = new Random();
                int sorteioSuicidio = suicidioValue.nextInt(5);
                if (sorteioSuicidio == 4) {
                    lutadores.get(0).seMatar(lutadores.get(1));
                    System.out.println(lutadores.get(0) + " JA FUI!");
                }
                break;
        }
    }

    private void escolherVencedor(Lutador player1, Lutador player2) {
        if(player1.getVida() > 0) {
            System.out.println(player1.getName() + " GANHOU A LUTA!");
        } else if (player2.getVida() > 0){
            System.out.println(player2.getName() + " GANHOU A LUTA!");
        } else {
            System.out.println("A GENTE SE MATOU! - A LUTA FOI UM EMPATE");
        }
    }

    private List<Lutador> escolherQuemVaiAtacar(Lutador player1, Lutador player2) {
        Random valueRandom = new Random();
        int sorteioDeQuemAtacaPrimeiro = valueRandom.nextInt(2);

        Lutador lutadorDaVez;
        Lutador lutadorOponente;
        if (sorteioDeQuemAtacaPrimeiro == 0) {
            lutadorDaVez = player1;
            lutadorOponente = player2;
        } else {
            lutadorDaVez = player2;
            lutadorOponente = player1;
        }

        return Arrays.asList(lutadorDaVez, lutadorOponente);
    }

    private void ataqueDuploFunction (Lutador lutadorDaVez, Lutador lutadorOponente) {
        Random value = new Random();
        int ataqueDuploSorteio = value.nextInt(2);
        boolean ataqueDuplo = false;
        if (ataqueDuploSorteio == 1) {
            ataqueDuplo = true;
        }

        if (ataqueDuplo) {
            lutadorDaVez.chutar(lutadorOponente);
            lutadorDaVez.chutar(lutadorOponente);
            System.out.println(lutadorDaVez + " Chutou DUAS VEZES!!");
        } else {
            lutadorDaVez.chutar(lutadorOponente);
            System.out.println(lutadorDaVez + " Chutou!!");
        }
    }
}
