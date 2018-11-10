package krazenn.company.Game;

import krazenn.company.Hero.Guerrier;
import krazenn.company.Hero.Hero;
import krazenn.company.Hero.Mage;
import krazenn.company.Hero.Rodeur;

import java.util.Scanner;

public class Game {
        private Hero player1;
        private Hero player2;
        private Scanner sc = new Scanner(System.in);

        /**
         * contructeur du jeu
         *
         */
        public Game() {
            this.player1 = createPlayer(1);
            if (player1 != null) {
                System.out.println(player1.presentation());
            }
            this.player2 = createPlayer(2);
            if (player2 != null) {
                System.out.println(player2.presentation());
            }
        }

    private Hero selectPlayer(int playerClass, int level, int life, int power, int agility, int intelligence, int playerNumber) {
        Hero hero = null;

        switch (playerClass) {
            case 1:
                hero = new Guerrier(level, life, power, agility, intelligence, playerNumber);
                break;
            case 2:
                hero = new Rodeur(level, life,power, agility, intelligence, playerNumber);
                break;
            case 3:
                hero = new Mage(level, life,power, agility, intelligence, playerNumber);
                break;
            default:
                System.out.println("La classe choisie n'existe pas !");
        }
        return hero;


    }

    private Hero createPlayer(int playerNumber) {
            int playerClass;
            System.out.println("Création du Hero du joueur " + playerNumber);
            do {
                System.out.println("Veuillez choisir la classe de votre Hero (1 : Guerrier, 2 : Rôdeur, 3 : Mage)");
                playerClass = sc.nextInt();
            }while (playerClass < 1 || playerClass > 3);
                System.out.println("Niveau du Hero ?");
                int level = sc.nextInt();
                int life = level * 5;
                System.out.println("Force du Hero ?");
                int power = sc.nextInt();
                System.out.println("Agilité du Hero ?");
                int agility = sc.nextInt();
                System.out.println("Intelligence du Hero ?");
                int intelligence = sc.nextInt();
            return selectPlayer(playerClass, level, life, power, agility, intelligence, playerNumber);


    }

        private void turn(Hero attackPlayer, Hero defensePlayer) {
            System.out.println(attackPlayer.askPlayerAction());
            int action = sc.nextInt();
            if (action == 1) {
                attackPlayer.basicAttack(defensePlayer);
            } else if (action == 2) {
                attackPlayer.specialAttack(defensePlayer);
            } else {
                System.out.println("Veuillez choisir une action valide (1 ou 2)");
                turn(attackPlayer, defensePlayer);
            }
        }

    /**
     * Combat des joueurs jusqu'a ce qu'un joueur meurt
     */
    public void run() {
        int turn = 1;
        int playerNumber;
        while (player1.getLife() > 0 && player2.getLife() > 0) {
            playerNumber = (turn % 2 == 0) ? 2 : 1;
            if (playerNumber == 1) turn(player1, player2);
            else turn(player2, player1);
            turn++;
        }
        if (player1.getLife() == 0) {
            endGame(player1);
        } else {
            endGame(player2);
        }
    }

    private void endGame(Hero hero) {
        System.out.println("Joueur " + hero.getPlayerNumber() + " a perdu !");
    }
}


