package krazenn.company.Hero;

public class Rodeur extends Hero {
    /**
     * Contructeur
     *
     * @param level        niveau du héro
     * @param life         vie du héro
     * @param power        force du héro
     * @param agility      agilité du héro
     * @param intelligence intelligence du héro
     * @param playerNumber numéro du joueur
     */
    public Rodeur(int level, int life, int power, int agility, int intelligence, int playerNumber) {
        super(level, life, power, agility, intelligence, playerNumber);
    }

    @Override
    public void basicAttack(Hero hero) {

    }

    @Override
    public void specialAttack(Hero hero) {

    }

    @Override
    protected String cri() {
        return null;
    }
}
