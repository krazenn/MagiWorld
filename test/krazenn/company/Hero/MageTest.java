package krazenn.company.Hero;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MageTest {

    Hero magePlayer1 = new Mage(10, 50, 0, 0, 10, 1);
    Hero magePlayer2 = new Mage(10, 50, 0, 0, 10, 2);

    @Test
    void Given_mageSelected_When_HeroCreated_Then_DisplayGoodInformation() {
        System.out.println(magePlayer1.presentation());
        assertEquals("Woarg je suis le mage joueur 1 niveau 10 je possède 50 de vitalité, 10 de force, 0 d'agilite et 0 d'intelligence !", magePlayer1.presentation());
    }


    @Test
    public void Given_BasicAttackSelected_When_PlayerTurn_Then_RemoveGoodAmountOfLifeToHero() {
        magePlayer1.basicAttack(magePlayer2);
        assertEquals(40, magePlayer2.getLife());
        assertEquals(50, magePlayer1.getLife());
    }

    @Test
    public void Given_SpecialAttackSelected_When_PlayerTurn_Then_AddGoodAmountOfLifeToHero(){
        magePlayer2.basicAttack(magePlayer1);
        magePlayer2.basicAttack(magePlayer1);
        magePlayer2.basicAttack(magePlayer1);
        magePlayer1.specialAttack(magePlayer2);
        assertEquals(40,magePlayer1.getLife());
    }
}