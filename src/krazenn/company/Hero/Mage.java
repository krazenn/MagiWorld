package krazenn.company.Hero;

public class Mage extends Hero{
    /**
     * Contructeur
     * @param level        niveau du héro
     * @param life         vie du héro
     * @param power        force du héro
     * @param agility      agilité du héro
     * @param intelligence intelligence du héro
     * @param playerNumber numéro du joueur
     */
    public Mage(int level, int life, int power, int agility, int intelligence, int playerNumber) {
        super(level, life, power, agility, intelligence, playerNumber);
    }

    @Override
    public void basicAttack(Hero hero) {
        System.out.println("Joueur " + getPlayerNumber() + " utilise Boule de Feu et inflige " + getIntelligence() + " dommages");
        hero.removeLife(getIntelligence());
    }

    @Override
    public void specialAttack(Hero hero) {
        int currentVie = getLife();
        int maxLife = getLevel() * 5;
        addLife(((currentVie + getIntelligence()*2) >= maxLife) ? maxLife - getLife() : getIntelligence()*2);

    }

    private void addLife(int Life) {
        int currentLife = getLife();
        setLife(getLife() + Life);
        System.out.print("Joueur " + getPlayerNumber() + " utilise Soin et ");
        System.out.print("gagne " + (getLife() - currentLife) + " en Vitalité\n");
    }

    @Override
    protected String cri() {
        return "Abracadabra";
    }
}
