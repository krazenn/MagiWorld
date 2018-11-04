package krazenn.company.Hero;

public class Guerrier extends Hero {
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
    public Guerrier(int level, int life, int power, int agility, int intelligence, int playerNumber) {
        super(level, life, power, agility, intelligence, playerNumber);
    }

    @Override
    public void basicAttack(Hero hero) {
        System.out.println("Joueur " + getPlayerNumber() + " utilise Coup d'épée et inflige " + getPower() + " dommages");
        hero.removeLife(getPower());
    }

    @Override
    public void specialAttack(Hero hero) {
        System.out.println("Joueur " + getPlayerNumber() + " utilise Coup de Rage et inflige " + getPower()*2 + " dommages");
        hero.removeLife(getPower()*2);
        removeLife(getPower()/2);
    }

    @Override
    protected String cri() {
        return "Woarg";
    }
}
