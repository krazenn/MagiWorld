package krazenn.company.Hero;

public abstract class Hero {

    private int level;
    private int life;
    private int power;
    private int agility;
    private int intelligence;
    private int playerNumber;

    /**
     * Contructeur
     * @param level niveau du héro
     * @param life vie du héro
     * @param power force du héro
     * @param agility agilité du héro
     * @param intelligence intelligence du héro
     * @param playerNumber numéro du joueur
     */
    public Hero(int level, int life, int power, int agility, int intelligence, int playerNumber) {
        this.level = level;
        this.life = life;
        this.power = power;
        this.agility = agility;
        this.intelligence = intelligence;
        this.playerNumber = playerNumber;
    }


    public int getLevel() {
        return level;
    }

    public int getLife() {
        return life;
    }

    public int getPower() {
        return power;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    /**
     * Présentation du héro
     * @return le héro sélectionné avec son niveau et ses compétences
     */
    public String presentation() {
        return (cri() +  " je suis le " + getClass().getSimpleName() +
                " joueur " + playerNumber + " niveau " + level + " je possède " +
                life + " de vitalité, " + power + " de force, " +
                agility + " d'agilite et " + intelligence + " d'intelligence !");
    }

    /**
     * Demande au joueur de séléctionner une action
     * @return le numéro du joueurs, sa vie ainsi que le choix des attaques disponible
     */
    public String askPlayerAction() {
        return ("Joueur " + playerNumber + " (" + life + " Vitalité) veuillez choisir votre action " +
                "(1 : Attaque Basique, 2 : Attaque Spécial)");
    }

    /**
     * Attaque basique du héro
     * @param hero en fonction du héro sélectionné
     */
    public abstract void basicAttack(Hero hero);

    /**
     * Attaque spéciale du héro
     * @param hero en fonction du héro sélectionné
     */
    public abstract void specialAttack(Hero hero);

    protected abstract String cri();


}

